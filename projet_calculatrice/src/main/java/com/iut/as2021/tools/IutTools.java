package com.iut.as2021.tools;

// import com.iut.as2021.enumerations.EOperation;
import com.iut.as2021.exceptions.MathsExceptions;

public class IutTools {

	public static String getLeftExpression(String expression, int pos) {
		return expression.substring(0, pos).trim();
	}

	public static String getRightExpression(String expression, int pos) {
		return expression.substring(pos + 1).trim();
	}

	public int countParenth(String expression) throws MathsExceptions{
		int nb = 0;
		boolean first = false;
		int cpt = 0;
		if ((expression.charAt(0)==')' || expression.charAt(expression.length()-1) == '(')){
			throw new MathsExceptions("Erreur de parenthèses");
		}
		if (expression.equals("()")){
			throw new MathsExceptions("Parenthèses vides");
		}

		for (int i=0; i<expression.length();i++){
			
			if (i == 0){
                if((expression.charAt(i) == '+') || (expression.charAt(i) == '*') || (expression.charAt(i) == '/')){
                    throw new MathsExceptions("Premier caractère invalide");
                }
            }
			
			if(expression.charAt(i) == '('){
				cpt++;
				if (i==0){
					first = true;
				}
				if (i>0 && first == true){
					nb--;
				}
			}
			if (expression.charAt(i) == ')' && i>0){
				cpt--;
				nb++;
				if(cpt == 0 && first == true){
					first = false;
				}
			}
		}
		if (cpt != 0){
			throw new MathsExceptions("Erreur de parenthèses");
		}
		return nb;
	}

	public String trimParenth(String expression) throws MathsExceptions{
		String res = expression;
		while (countParenth(res)==1 && res .indexOf('(') == 0 && res.lastIndexOf(')') == res.length()-1){
			res = res.substring(1,res.length()-1);
		}
		return res;
	}
}
