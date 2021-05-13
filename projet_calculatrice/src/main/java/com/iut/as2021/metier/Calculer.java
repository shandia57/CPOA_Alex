package com.iut.as2021.metier;

import com.iut.as2021.interfaces.IMaths;

public class Calculer {

    private IMaths maths;

    public IMaths getMaths() {
        return maths;
    }

    public void setMaths(IMaths maths) {
        this.maths = maths;
    }

    public Calculer(IMaths maths) {
        this.setMaths(maths);
    }

    public double run(String expression) {
        int pos = 0;
        // ----------------------------------------------
        int posSigneAddition = expression.indexOf("+");
        boolean addition = (posSigneAddition > 0);
        if (addition) {
            pos = posSigneAddition;
        }
        // ------------------------------ CODE TRES DIRTY
        int posSigneSoustraction = expression.indexOf("-");
        boolean soustraction = (posSigneSoustraction > 0);
        if (soustraction) {
            pos = posSigneSoustraction;
        }
        // ------------------------------ CODE TRES DIRTY
        String left = getLeftExpression(expression, pos);
        String right = getRightExpression(expression, pos);
        if (addition) {
            return maths.addition(Integer.valueOf(left), Integer.valueOf(right));
        }
        if (soustraction) {
            return maths.soustraction(Integer.valueOf(left), Integer.valueOf(right));
        }
        return maths.multiplication(1, 2);
    }

    private String getRightExpression(String expression, int posSigneAddition) {
        return expression.substring(posSigneAddition + 1).trim();
    }

    private String getLeftExpression(String expression, int posSigneAddition) {
        return expression.substring(0, posSigneAddition).trim();
    }

}