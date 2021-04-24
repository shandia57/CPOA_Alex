package com.iut.as2021.main;
import com.iut.as2021.metier.Printer;
import com.iut.as2021.exceptions.PrinterFactory;
public class startDP {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Printer p = new Printer("toto", "typeToto");
		Printer p1 = PrinterFactory.getInstance();
		p.print("toto");
		p1.print("hello wordl");
		Printer p2 = PrinterFactory.getInstance();
		System.out.println(p1 == p2);
	}
	

}
