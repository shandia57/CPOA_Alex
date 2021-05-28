package com.iut.as2021.exceptions;

import com.iut.as2021.metier.Printer;

public class PrinterFactorySingleton {
	
	private static  Printer printer;
	public static synchronized Printer getInstance() {
		if(printer == null) {
			printer = new Printer("toto", "typetoto");
		}
		return printer;
	}
}
