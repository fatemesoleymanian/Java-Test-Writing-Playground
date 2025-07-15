package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest extends Calc {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDivide() {
        Calc calc = new Calc();

        assertEquals(calc.divide(100,25),4);
    }

    @Test
    public void testMultiply() {
        Calc calc = new Calc();

        assertEquals(calc.multiply(100,25),2500);
    }
}