package com.iut.as2021.mathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.iut.as2021.interfaces.*;
import com.iut.as2021.mathematics.*;
import com.iut.as2021.exceptions.*;

public class MathsTest {

	private IMaths maths;

    @Before
    public void setUp() {
        this.maths = new Maths();
    }

    @Test
    public void testAdditionNbPositif() {
        Assert.assertEquals(maths.addition(1, 2), 3);
    }

    @Test
    public void testAdditionNbNegatif() {
        Assert.assertEquals(maths.addition(-1, -2), -3);
    }

    @Test
    public void testAdditionNbPositifEtNegatif() {
        Assert.assertEquals(maths.addition(-1, 2), 1);
    }

    @Test
    public void testSoustractionNbPositif() {
        Assert.assertEquals(maths.soustraction(1, 2), 3);
    }
    
    @Test
    public void testSoustractionNbNegatif() {
        Assert.assertEquals(maths.soustraction(-1, -2), 1);
    }

    @Test
    public void testSoustractionNbPositifEtNegatif() {
        Assert.assertEquals(maths.soustraction(-1, 2), -3);
    }

    @Test
    public void testMultiplicationNbPositif() {
        Assert.assertEquals(maths.multiplication(5, 3), 15);
    }

    @Test
    public void testMultiplicationNbNegatif() {
        Assert.assertEquals(maths.multiplication(-6, -3), 18);
    }

    @Test
    public void testMultiplicationNbPositifetNegatif() {
        Assert.assertEquals(maths.multiplication(-5, 3), -15);
    }

    @Test
    public void testDivisionNbPositif() throws MathsExceptions {
        Assert.assertEquals(maths.division(12, 4), 3, 0);
    }
    
    @Test
    public void testDivisionNbNegatif() throws MathsExceptions {
        Assert.assertEquals(maths.division(-15, -3), 5, 0);
    }
    
    @Test
    public void testDivisionNbPositifetNegatif() throws MathsExceptions {
        Assert.assertEquals(maths.division(-12, 4), -3, 0);
    }


    @Test(expected = MathsExceptions.class)
    public void testDivisionParZero() throws MathsExceptions {
        try {
            maths.division(4, 0);
        }
        catch (MathsExceptions me) {
            Assert.assertEquals(me.getMessage(), "Division par zero impossible");
            throw me;
        }
    }
}
