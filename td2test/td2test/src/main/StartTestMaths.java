package main;

import interfaces.IMaths;
import interfaces.Maths;

public class StartTestMaths {

	
	public static void main (String [] args) {
		IMaths maths = new Maths();
		System.out.println(maths.addition(2,3));
	}
}
