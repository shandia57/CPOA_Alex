package com.iut.as2021.main;

import com.iut.as2021.interfaces.IMaths;
import com.iut.as2021.mathematics.Maths;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.tools.IutTools;
import com.iut.as2021.metier.Calculer;
import com.iut.as2021.metier.MathResultat;

public class StartTestMaths {
	
	
	public static void main(String[] args) throws MathsExceptions {
		IMaths maths = new Maths();
		
		MathResultat resultat;
		
		System.out.println("Les additions");
        System.out.println(maths.addition(7, 8));
        System.out.println(maths.addition(7, -8));
        System.out.println(maths.addition(-7, 8));
        System.out.println(maths.addition(-7, -8));
        
        System.out.println("\nLes soustractions");
        System.out.println(maths.soustraction(7, 8));
        System.out.println(maths.soustraction(7, -8));
        System.out.println(maths.soustraction(-7, 8));
        System.out.println(maths.soustraction(-7, -8));
        
        System.out.println("\nLes multiplications");
        System.out.println(maths.multiplication(7, 8));
        System.out.println(maths.multiplication(7, -8));
        System.out.println(maths.multiplication(-7, 8));
        System.out.println(maths.multiplication(-7, -8));
        
        System.out.println("\nLes divisions");
        System.out.println(maths.division(56, 8));
        System.out.println(maths.division(56, -8));
        System.out.println(maths.division(-56, 8));
        System.out.println(maths.division(-56, -8));
        
        System.out.println("\nLa division par 0");
        //System.out.println(maths.division(56, 0));
        

        

	}
	
}
