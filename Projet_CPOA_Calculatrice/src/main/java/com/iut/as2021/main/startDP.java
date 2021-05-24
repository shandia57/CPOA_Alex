package com.iut.as2021.main;
import com.iut.as2021.metier.Printer;
import com.iut.as2021.exceptions.PrinterFactory;
public class startDP {

	public static void main(String[] args) {
		
		Printer p = new Printer("toto", "typeToto");
		Printer p1 = PrinterFactory.getInstance();
		p.print("toto");
		p1.print("hello world");
		Printer p2 = PrinterFactory.getInstance();
		System.out.println(p1 == p2);
	}
	

}
