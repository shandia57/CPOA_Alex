package com.iut.as2021.metier;

import static com.iut.as2021.enumerations.EOperation.ADDITION;
import static com.iut.as2021.enumerations.EOperation.DIVISION;
import static com.iut.as2021.enumerations.EOperation.INCONNUE;
import static com.iut.as2021.enumerations.EOperation.MULTIPLICATION;
import static com.iut.as2021.enumerations.EOperation.SOUSTRACTION;

import com.iut.as2021.enumerations.EOperation;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;
import com.iut.as2021.mathematics.Maths;
import com.iut.as2021.tools.IutTools;

/**
 * Classe récursive permettant de créer un arbre binaire d'opérations.
 * 
 * @author stephane.joyeux
 *
 */
public class MathResultat {

	private EOperation operation;
	private IMaths maths;
	private IutTools tools;

	private int id;
	private String mathResult;

	private MathResultat leftExpression;
	private MathResultat rightExpression;

	public void setId(int i){
		this.id = i;
	}

	public int getId(){
		return this.id;
	}

	public void setMathResult(String chaine){
		this.mathResult = chaine;
	}

	public String getMathResult(){
		return this.mathResult;
	}
	

	public EOperation getOperation() {
		return operation;
	}

	public double getValue() throws MathsExceptions {
		double res = 0;
		if (this.operation == INCONNUE){
			res = Integer.parseInt(this.mathResult);
		} else {
			res = this.calculate();
		}
		return res;
	}

	public MathResultat getLeftExpression() {
		return leftExpression;
	}

	public MathResultat getRightExpression() {
		return rightExpression;
	}

	public MathResultat(String expression) throws MathsExceptions {
		
		if (expression == null || expression.isEmpty()) {
			
			throw new MathsExceptions("l'expression est vide");
		}
		
		tools = new IutTools();
		this.operation = INCONNUE;
		this.mathResult = tools.trimParenth(expression);
		
		switchLeftAndRightExpression();
		
		this.maths = new Maths();
	}

	protected double calculate() throws MathsExceptions {
		if (!INCONNUE.equals(operation)) {
			double leftValue = leftExpression.getValue();
			double rigthValue = rightExpression.getValue();
			switch (operation) {
			case MULTIPLICATION:
				return maths.multiplication((int) leftValue, (int) rigthValue);
			case DIVISION:
				return maths.division((int) leftValue, (int) rigthValue);
			case ADDITION:
				return maths.addition((int) leftValue, (int) rigthValue);
			case SOUSTRACTION:
				return maths.soustraction((int) leftValue, (int) rigthValue);
			default:
				return 0;
			}
		}
		return 0;
	}

	private void switchLeftAndRightExpression() throws MathsExceptions {
		int pos = getPosition();
		if (!INCONNUE.equals(operation)) {
			if (pos<0 && MULTIPLICATION.equals(operation)){
				leftExpression = new MathResultat(IutTools.getLeftExpression(this.mathResult, (-pos)+1));
				rightExpression = new MathResultat(IutTools.getRightExpression(this.mathResult, pos));
			} else {
				leftExpression = new MathResultat(IutTools.getLeftExpression(this.mathResult, pos));
				rightExpression = new MathResultat(IutTools.getRightExpression(this.mathResult, pos));
			}
		}
	}

	public void switchOpe(char c){
		switch(c){
			case '+':
				this.operation = ADDITION;
				break;
			case '-':
				this.operation = SOUSTRACTION;
				break;
			case '*':
				this.operation = MULTIPLICATION;
				break;
			case '/':
				this.operation = DIVISION;
				break;
		}
	}

	private boolean isOperator(char c){
		return(c == '+' || c == '-' || c == '*' || c == '/');
	}

	private int getPosition() {
		int pos = 0;
		int iterateur = 0;
		for (int i=this.mathResult.length()-1; i> -1; i--){
			if (this.mathResult.charAt(i)=='(' && iterateur ==0){
				iterateur++;
			} else if (this.mathResult.charAt(i)=='('){
				iterateur++;
			}	
			if(i<this.mathResult.length()-2 && this.mathResult.charAt(i)==')' && this.mathResult.charAt(i+1)=='('){
				pos = -i;
				this.operation = MULTIPLICATION;
			}
			if (this.mathResult.charAt(i)=='('){
				iterateur--;
			}
			if(i>0 && !(this.mathResult.charAt(i)=='-' && (isOperator(this.mathResult.charAt(i-1)) || this.mathResult.charAt(i-1) =='('))){
				if(isOperator(this.mathResult.charAt(i)) && iterateur == 0 && (pos==0 || this.operation == MULTIPLICATION || this.operation == DIVISION)){
					pos = i;
					switchOpe(this.mathResult.charAt(i));
				}
			}
		}
		return pos;
	}

	private int getPositionFromOperation(EOperation operation) {
		int pos = this.mathResult.indexOf(operation.getOperateur());
		if (pos > 0) {
			this.operation = operation;
			return pos;
		}
		return 0;
	}
}