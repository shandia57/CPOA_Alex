package com.iut.as2021.exceptions;
import com.iut.as2021.metier.Printer;


public class PrinterFactory {
	
	private static Printer printer;
	
	public static Printer getInstance() {
		printer = new Printer("toto", "typetoto");
		return printer;
	}
}

