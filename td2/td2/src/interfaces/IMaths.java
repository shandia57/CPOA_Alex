package interfaces;

import exceptions.MathsExceptions;

public interface IMaths {

	int addition(int a, int b);

	int soustration(int a, int b);

	int multiplication(int a, int b);

	double division(int a, int b) throws MathsExceptions;
}
