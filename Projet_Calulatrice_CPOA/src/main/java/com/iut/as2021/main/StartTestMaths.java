package com.iut.as2021.main;

import com.iut.as2021.interfaces.IMaths;
import com.iut.as2021.mathematics.Maths;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.tools.IutTools;
import com.iut.as2021.metier.Calculer;
import com.iut.as2021.metier.MathResultat;
import com.iut.as2021.dao.*;


public class StartTestMaths {
	
	
	public static void main(String[] args) throws MathsExceptions {
		IMaths maths = new Maths();
		
		/*
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
		*/
        MathResultat res = new MathResultat("(2*3) * 0");
        System.out.println("je récupère la value " + res.getValue());

        /*
        try{
            MathResultat exp = new MathResultat("1+1");
            DaoFactory daof = DaoFactory.getDAOFactory(ETypeDao.MYSQL);

        } catch (Exception e){
            System.out.println("Erreur : " + e.getMessage());
        }*/
        
	}
	
}
