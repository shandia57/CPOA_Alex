package mathematics;

import exceptions.MathsExceptions;
import interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int soustration(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		// Ecrire l'implémentation de multiplication en utilisant que des additions !
		// Tester tous les cas possibles (positifs, négatifs, 0 ...).
		return a * b;
	}

	@Override
	public double division(int a, int b) throws MathsExceptions {
		if (b == 0) {
			throw new MathsExceptions("Division par zero impossible");
		}
		try {
			return a / b;
		} catch (Exception e) {
			throw new MathsExceptions(e.getMessage());
		}
	}
}
