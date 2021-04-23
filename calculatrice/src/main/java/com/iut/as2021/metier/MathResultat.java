package com.iut.as2021.metier;

import com.iut.as2021.enumerations.EOperation;
import com.iut.as2021.interfaces.*;
import com.iut.as2021.metier.*;
import com.iut.as2021.exceptions.*;

public class MathResultat {

	private EOperation operation;
	private IMaths maths;

	private String expression;

	private MathResultat leftExpression;

	private MathResultat rightExpression;

	public EOperation getOperation() {
		return operation;
	}

	public double getValue() throws MathsExceptions {
		return 0;
	}

	public MathResultat getLeftExpression() {
		return leftExpression;
	}

	public MathResultat getRightExpression() {
		return rightExpression;
	}

	public MathResultat(String expression) {
		
	}
	
	public double calculate () {
		return 0;
	}
}
