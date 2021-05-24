package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.*;
import com.iut.as2021.interfaces.*;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		int i;
		
		if (0 < a && 0 < b) {
			i = b;
			a--;
			while (a != 0) {
				b += i;
				a--;
			}
			
		} else if (0 > a && 0 > b){
			i = b;
			a++;
			while (a != 0) {
				b += i;
				a++;
			}
			b = Math.abs(b);
			
		} else if ((0 > a && 0 < b) || (0 < a && 0 > b)){
			i = b;
			if (a < 0) {
				a++;
				while (a != 0) {
					b += i;
					a++;
				}
				b = -b;
				
			} else {
				a--;
				while (a != 0) {
					b += i;
					a--;
				}
			}
			
		} else {
			b = 0;
		}
		
		return b;
	}

	@Override
    public double division(int a, int b) throws MathsExceptions {
        if (b == 0) {
            throw new MathsExceptions("Division par zéro impossible");
        }
        try {
            return a / b;
        } catch (Exception e) {
            throw new MathsExceptions(e.getMessage());
        }
    }
}
