package com.iut.as2021.metier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.iut.as2021.exceptions.MathsExceptions;

public class MathResultatTest {

	private MathResultat resultat;

	@Test
	public void testExpressionSimpleAddition() throws MathsExceptions {
		resultat = new MathResultat("2 + 3");
		
		assertEquals(resultat.calculate(), 5, 2);
		
	}

	@Test(expected = MathsExceptions.class)
	public void testExpressionSimpleAdditionExpressionErronnee() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 + ");
		assertEquals(resultat.calculate(), 5, 2);
	}

	@Test
	public void testExpressionSimpleSoustraction() throws MathsExceptions {
		resultat = new MathResultat("2 - 3");
		assertEquals(resultat.calculate(), -1, 2);
	}

	@Test
	public void testExpressionSimpleAdditionMultiple() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 - 1 + 7 + 8");
		assertEquals(resultat.calculate(), 19, 2);
	}

	@Test
	public void testExpressionSimpleSoustractionMultiple() throws MathsExceptions {
		resultat = new MathResultat("7 - 3 + 1");
		assertEquals(resultat.calculate(), 5, 2);
	}

	@Test
	public void testExpressionSimpleMultiplication() throws MathsExceptions {
		resultat = new MathResultat("7 + 1 * 3 + 1");
		assertEquals(resultat.calculate(), 11, 2);
	}

	@Test
	public void testExpressionSimpleDivision() throws MathsExceptions {
		resultat = new MathResultat("8 / 2");
		assertEquals(resultat.calculate(), 4, 2);
	}

	@Test(expected = MathsExceptions.class)
	public void testExpressionSimpleNull() throws MathsExceptions {
		try {
			resultat = new MathResultat(null);
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "l'expression est vide");
			throw e;
		}
	}

	@Test(expected = MathsExceptions.class)
	public void testExpressionSimpleChaineVide() throws MathsExceptions {
		try {
			resultat = new MathResultat("");
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "l'expression est vide");
			throw e;
		}
	}
	
	
	@Test
	public void testExpressionAvecSimpleParenthese() throws MathsExceptions {
		resultat = new MathResultat("(1+1)");
		assertEquals(resultat.calculate(), 2, 2);
	}
	
	@Test
	public void testExpressionAvecSimpleParentheseEtUnPositif() throws MathsExceptions {
		resultat = new MathResultat("2*(1+1)");
		assertEquals(resultat.calculate(), 4, 2);
	}
	
	@Test
	public void testExpressionNegatifPlusPositif() throws MathsExceptions {
		resultat = new MathResultat("-1+2");
		assertEquals(resultat.calculate(), 1, 2);
	}
	
	@Test
	public void testExpressionNegatifPlusNegatif() throws MathsExceptions {
		resultat = new MathResultat("-1+-2");
		assertEquals(resultat.calculate(), -3, 2);
	}
	
	@Test
	public void testExpressionNegatifMoinsNegatif() throws MathsExceptions {
		resultat = new MathResultat("(-2--3)");
		assertEquals(resultat.calculate(), 1, 2);
	}
	
	@Test
	public void testExpressionPositifParentheseAddition() throws MathsExceptions {
		resultat = new MathResultat("2+(-3+4)");
		assertEquals(resultat.calculate(), 3, 2);
	}
	
	@Test
	public void testExpressionPositifNegatifPositif() throws MathsExceptions {
		resultat = new MathResultat("2+-3+4");
		assertEquals(resultat.calculate(), 3, 2);
	}
	
	@Test
	public void testExpressionAvecBeaucoupParentheses() throws MathsExceptions {
		resultat = new MathResultat("(((6+2)))");
		assertEquals(resultat.calculate(), 8, 2);
	}
	

	
	@Test(expected = MathsExceptions.class)
	public void testExpressionAvecBeaucoupParenthesesManquante() throws MathsExceptions {
		try {
			resultat = new MathResultat("(6+2)))");
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "Erreur de parenthèses");
			throw e;
		}
	}
	

	
	@Test(expected = MathsExceptions.class)
	public void testExpressionParentheseVide() throws MathsExceptions {
		try {
			resultat = new MathResultat("()");
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "Parenthèses vides");
			throw e;
		}
	}
	
	
	@Test(expected = MathsExceptions.class)
	public void testExpressionParentheseVideMultiples() throws MathsExceptions {
		try {
			resultat = new MathResultat("((()))");
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "Parenthèses vides");
			throw e;
		}
	}
	
	
	
	@Test
	public void testExpressionDivisionAvecDoubleParenthese() throws MathsExceptions {
		resultat = new MathResultat("(1+1)/(2+2)");
		assertEquals(resultat.calculate(), 0.5, 2);
	}
	
	@Test
	public void testExpressionDivsionNegatifMultipliePositif() throws MathsExceptions {
		resultat = new MathResultat("2/-1");
		assertEquals(resultat.calculate(), -2, 2);
	}

	
	@Test
	public void testExpressionNegatifDiviseNegatif() throws MathsExceptions {
		resultat = new MathResultat("-2/-1");
		assertEquals(resultat.calculate(), 2, 2);
	}
	
	@Test
	public void testExpressionNegatifDiviseNegatifDansParenthese() throws MathsExceptions {
		resultat = new MathResultat("-2/(-1)");
		assertEquals(resultat.calculate(), 2, 2);
	}
	
	
	@Test
	public void testExpressionParenthesePositifDviseNegatif() throws MathsExceptions {
		resultat = new MathResultat("(+2)/(-1)");
		assertEquals(resultat.calculate(), -2, 2);
	}
	
	
	@Test
	public void testExpressionParenthesePositifSansOperateurDiviseNegatif() throws MathsExceptions {
		resultat = new MathResultat("(2)/(-1)");
		assertEquals(resultat.calculate(), -2, 2);
	}
	
	@Test
	public void testExpressionAvecDoubleParenthese() throws MathsExceptions {
		resultat = new MathResultat("(1+1)*(2+2)");
		assertEquals(resultat.calculate(), 8, 2);
	}
	
	@Test
	public void testExpressionNegatifMultipliePositif() throws MathsExceptions {
		resultat = new MathResultat("-1*2");
		assertEquals(resultat.calculate(), -2, 2);
	}

	
	@Test
	public void testExpressionNegatifMultiplieNegatif() throws MathsExceptions {
		resultat = new MathResultat("-1*-2");
		assertEquals(resultat.calculate(), 2, 2);
	}
	
	@Test
	public void testExpressionNegatifMultiplieNegatifDansParenthese() throws MathsExceptions {
		resultat = new MathResultat("-1*(-2)");
		assertEquals(resultat.calculate(), 2, 2);
	}
	
	
	@Test
	public void testExpressionParentheseNegatifMultiplieNegatif() throws MathsExceptions {
		resultat = new MathResultat("(-1)*(-2)");
		assertEquals(resultat.calculate(), 2, 2);
	}
	

	
	@Test(expected = MathsExceptions.class)
	public void testExpressionPositifMultiplieNegatif() throws MathsExceptions {
		try {
			resultat = new MathResultat("+1*-2");
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "Premier caractère invalide");
			throw e;
		}
	}
	
	@Test(expected = MathsExceptions.class)
	public void testExpressionOperateurDivisionPositifMultiplieNegatif() throws MathsExceptions {
		try {
			resultat = new MathResultat("/1*-2");
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "Premier caractère invalide");
			throw e;
		}
	}
	
	@Test(expected = MathsExceptions.class)
	public void testExpressionOperateurMultiplicationPositifMultiplieNegatif() throws MathsExceptions {
		try {
			resultat = new MathResultat("*1*-2");
		} catch (MathsExceptions e) {
			assertEquals(e.getMessage(), "Premier caractère invalide");
			throw e;
		}
	}
	

	
	@Test
	public void testExpressionParenthesePositifMultiplieNegatif() throws MathsExceptions {
		resultat = new MathResultat("(+1)*(-2)");
		assertEquals(resultat.calculate(), -2, 2);
	}
	
	
	@Test
	public void testExpressionParenthesePositifSansOperateurMultiplieNegatif() throws MathsExceptions {
		resultat = new MathResultat("(1)*(-2)");
		assertEquals(resultat.calculate(), -2, 2);
	}



	
	
}