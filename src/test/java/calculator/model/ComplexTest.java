/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Carlo Marna
 */
public class ComplexTest {
    
    public ComplexTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRe method, of class Complex.
     */
    @Test
    public void testGetRe_PositiveReal() {
        Complex instance = new Complex(1.0, 2.0);
        double expResult = 1.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRe_NegativeReal() {
        Complex instance = new Complex(-3.0, 2.0);
        double expResult = -3.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRe_ImaginaryZero() {
        Complex instance = new Complex(5.0, 0.0);
        double expResult = 5.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_RealZero() {
        Complex instance = new Complex(0.0, 7.0);
        double expResult = 0.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
}
    /**
     * Fine Test getRe method
     */
    
    
    /**
     * Test of getIm method, of class Complex.
     */
    @Test
    public void testGetIm() {
        System.out.println("getIm");
        Complex instance = null;
        double expResult = 0.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Complex.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Complex instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Complex.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Complex a = null;
        Complex b = null;
        Complex expResult = null;
        Complex result = Complex.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Complex.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Complex b = null;
        Complex a = null;
        Complex expResult = null;
        Complex result = Complex.sub(b, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class Complex.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        Complex a = null;
        Complex b = null;
        Complex expResult = null;
        Complex result = Complex.mul(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Complex.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        Complex b = null;
        Complex a = null;
        Complex expResult = null;
        Complex result = Complex.div(b, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqrt method, of class Complex.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        Complex a = null;
        Complex expResult = null;
        Complex result = Complex.sqrt(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of change method, of class Complex.
     */
    @Test
    public void testChange() {
        System.out.println("change");
        Complex a = null;
        Complex expResult = null;
        Complex result = Complex.change(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
