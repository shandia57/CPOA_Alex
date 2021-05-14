package com.iut.as2021.metier;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;

public class Calculer {

    private IMaths maths;

    public IMaths getMaths() {
        return maths;
    }

    public double addition(String expression, int signe){
        String left = getLeftExpression(expression, signe);
        String right = getRightExpression(expression, signe);
        return maths.addition(Integer.valueOf(left), Integer.valueOf(right));
    }
        
    public double soustraction(String expression, int signe){
        String left = getLeftExpression(expression, signe);
        String right = getRightExpression(expression, signe);
        return maths.soustraction(Integer.valueOf(left), Integer.valueOf(right));
    }
        
    public double multiplication(String expression, int signe){
        String left = getLeftExpression(expression, signe);
        String right = getRightExpression(expression, signe);
        return maths.multiplication(Integer.valueOf(left), Integer.valueOf(right));
    }
        
    public double division(String expression, int signe) throws Exception{
        String left = getLeftExpression(expression, signe);
        String right = getRightExpression(expression, signe);
        return maths.division(Integer.valueOf(left), Integer.valueOf(right));
    }

    private String getRightExpression(String expression, int posSigne) {
        return expression.substring(posSigne + 1).trim();
    }

    private String getLeftExpression(String expression, int posSigne) {
        return expression.substring(0, posSigne).trim();
    }

}