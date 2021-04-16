package tests.mathematics;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import mathematics.Maths;

public class MathsTest {

	private IMaths maths;

	@Before
	public void setUp() {
		this.maths = new Maths();
	}

	@Test
	public void testAdditionCasGeneralNombresPositifs() {
		assertEquals(maths.addition(2, 3), 5);
	}

	@Test(expected = MathsExceptions.class)
	public void testDivisionParZero() throws MathsExceptions {
		try {
			maths.division(4, 0);
		} catch (MathsExceptions e) {
			Assert.assertEquals(e.getMessage(), "Division par zero impossible");
			throw e;
		}
	}
}

