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
        System.out.println("Testing testGetRe_PositiveReal");
        Complex instance = new Complex(1.0, 2.0);
        double expResult = 1.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRe_NegativeReal() {
        System.out.println("Testing testGetRe_NegativeReal");
        Complex instance = new Complex(-3.0, 2.0);
        double expResult = -3.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRe_ImaginaryZero() {
        System.out.println("Testing testGetRe_ImaginaryZero");
        Complex instance = new Complex(5.0, 0.0);
        double expResult = 5.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_RealZero() {
        System.out.println("Testing testGetRe_RealZero");
        Complex instance = new Complex(0.0, 7.0);
        double expResult = 0.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_ComplexZero() {
        System.out.println("Testing testGetRe_ComplexZero");
        Complex instance = new Complex(0.0, 0.0);
        double expResult = 0.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_MaxReal() {
        System.out.println("Testing testGetRe_MaxReal");
        Complex instance = new Complex(Double.MAX_VALUE, 3.0);
        double expResult = Double.MAX_VALUE;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_MinReal() {
        System.out.println("Testing testGetRe_MinReal");
        Complex instance = new Complex(Double.MIN_VALUE, 4.0);
        double expResult = Double.MIN_VALUE;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_InfiniteReal() {
        System.out.println("Testing testGetRe_InfiniteReal");
        Complex instance = new Complex(Double.POSITIVE_INFINITY, 2.0);
        double expResult = Double.POSITIVE_INFINITY;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_MaxImaginary() {
        System.out.println("Testing testGetRe_MaxImaginary");
        Complex instance = new Complex(5.0, Double.MAX_VALUE);
        double expResult = 5.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetRe_FractionalReal() {
        System.out.println("Testing testGetRe_FractionalReal");
        Complex instance = new Complex(1.5, 2.0);
        double expResult = 1.5;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRe_NegativeFractionalReal() {
        System.out.println("Testing testGetRe_NegativeFractionalReal");
        Complex instance = new Complex(-2.25, 3.0);
        double expResult = -2.25;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRe_RoundingError() {
        System.out.println("Testing testGetRe_RoundingError");
        Complex instance = new Complex(0.2, 0.1);
        double expResult = 0.200001; //valore diverso
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0001); // Definisci una tolleranza per gli errori di arrotondamento
    }

    @Test
    public void testGetRe_MaxRealAndImaginary() {
        System.out.println("Testing testGetRe_MaxRealAndImaginary");
        Complex instance = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        double expResult = Double.MAX_VALUE;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRe_MinRealAndImaginary() {
        System.out.println("Testing testGetRe_MinRealAndImaginary");
        Complex instance = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        double expResult = Double.MIN_VALUE;
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
    public void testGetIm_PositiveImaginary() {
        System.out.println("Testing testGetIm_PositiveImaginary");
        Complex instance = new Complex(1.0, 2.0);
        double expResult = 2.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_NegativeImaginary() {
        System.out.println("Testing testGetIm_NegativeImaginary");
        Complex instance = new Complex(-3.0, -2.0);
        double expResult = -2.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_RealZero() {
        System.out.println("Testing testGetIm_RealZero");
        Complex instance = new Complex(5.0, 0.0);
        double expResult = 0.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_ImaginaryZero() {
        System.out.println("Testing testGetIm_ImaginaryZero");
        Complex instance = new Complex(0.0, 7.0);
        double expResult = 7.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_ComplexZero() {
        System.out.println("Testing testGetIm_ComplexZero");
        Complex instance = new Complex(0.0, 0.0);
        double expResult = 0.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_MaxImaginary() {
        System.out.println("Testing testGetIm_MaxImaginary");
        Complex instance = new Complex(5.0, Double.MAX_VALUE);
        double expResult = Double.MAX_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_MinImaginary() {
        System.out.println("Testing testGetIm_MinImaginary");
        Complex instance = new Complex(4.0, Double.MIN_VALUE);
        double expResult = Double.MIN_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_InfiniteImaginary() {
        System.out.println("Testing testGetIm_InfiniteImaginary");
        Complex instance = new Complex(2.0, Double.NEGATIVE_INFINITY);
        double expResult = Double.NEGATIVE_INFINITY;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetIm_FractionalImaginary() {
        System.out.println("Testing testGetIm_FractionalImaginary");
        Complex instance = new Complex(3.0, 0.5);
        double expResult = 0.5;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_NegativeFractionalImaginary() {
        System.out.println("Testing testGetIm_NegativeFractionalImaginary");
        Complex instance = new Complex(4.0, -0.75);
        double expResult = -0.75;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_RoundingError() {
        System.out.println("Testing testGetIm_RoundingError");
        Complex instance = new Complex(0.1, 0.2);
        double expResult = 0.20001; //valore diverso
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0001); // Definisci una tolleranza per gli errori di arrotondamento
    }

    @Test
    public void testGetIm_MaxRealAndImaginary() {
        System.out.println("Testing testGetIm_MaxRealAndImaginary");
        Complex instance = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        double expResult = Double.MAX_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetIm_MinRealAndImaginary() {
        System.out.println("Testing testGetIm_MinRealAndImaginary");
        Complex instance = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        double expResult = Double.MIN_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
    * Fine Test getIm method
    */
    
    /**
     * Test of toString methods, of class Complex.
     */
    @Test
    public void testToString_RealPart() {
        System.out.println("Testing testToString_RealPart");
        Complex instance = new Complex(3.0, 0.0);
        String expResult = "3.0\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString_ImaginaryPart() {
        System.out.println("Testing testToString_ImaginaryPart");
        Complex instance = new Complex(0.0, -4.0);
        String expResult = "-4.0j\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString_RealAndImaginaryParts() {
        System.out.println("Testing testToString_RealAndImaginaryParts");
        Complex instance = new Complex(2.3, 5.0);
        String expResult = "2.3 + 5.0j\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    @Test
    public void testToString_NegativeRealAndImaginary() {
        System.out.println("Testing testToString_NegativeRealAndImaginary");
        Complex instance = new Complex(-1.0, -4.0);
        String expResult = "-1.0 - 4.0j\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    /**
     * Fine Test of toString methods, of class Complex.
     */
    
    /**
     * Test of add method, of class Complex.
     */
    @Test
    public void testAdd_PositiveRealImaginary() {
        System.out.println("Testing testAdd_PositiveReal");
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex expResult = new Complex(4.0, 6.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testAdd_NegativeRealImaginary() {
        System.out.println("Testing testAdd_NegativeReal");
        Complex a = new Complex(3.0, 2.0);
        Complex b = new Complex(-1.0, -1.0);
        Complex expResult = new Complex(2.0, 1.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }
   
    @Test
    public void testAdd_ComplexZero() {
        System.out.println("Testing testAdd_ComplexZero");
        Complex a = new Complex(0.0, 0.0);
        Complex b = new Complex(3.0, 4.0);
        Complex expResult = new Complex(3.0, 4.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testAdd_MaxValues() {
        System.out.println("Testing testAdd_MaxValues");
        Complex a = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        Complex b = new Complex(-Double.MAX_VALUE, -Double.MAX_VALUE);
        Complex expResult = new Complex(0.0, 0.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testAdd_MinValues() {
        System.out.println("Testing testAdd_MinValues");
        Complex a = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        Complex b = new Complex(-Double.MIN_VALUE, -Double.MIN_VALUE);
        Complex expResult = new Complex(0.0, 0.0);
        Complex result = Complex.add(a, b);
       assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testAdd_InfiniteValues() {
        System.out.println("Testing testAdd_InfiniteValues");
        Complex a = new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        Complex b = new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        Complex expResult = new Complex(Double.NaN, Double.NaN);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }
    @Test
    public void testAdd_NegativeFractionalImaginary() {
        System.out.println("Testing testAdd_NegativeFractionalImaginary");
        Complex a = new Complex(4.0, -2.5);
        Complex b = new Complex(1.5, -1.0);
        Complex expResult = new Complex(5.5, -3.5);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    

    /**
     * Fine Test of add methods, of class Complex.
     */
    /**
     * Test of sub method, of class Complex.
     */
    @Test
    public void testSub_PositiveRealImaginary() {
        System.out.println("Testing testSub_PositiveRealImaginary");
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex expResult = new Complex(-2.0, -2.0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testSub_NegativeRealImaginary() {
        System.out.println("Testing testSub_NegativeRealImaginary");
        Complex a = new Complex(3.0, 2.0);
        Complex b = new Complex(-1.0, -1.0);
        Complex expResult = new Complex(4.0, 3.0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testSub_ComplexZero() {
        System.out.println("Testing testSub_ComplexZero");
        Complex a = new Complex(0.0, 0.0);
        Complex b = new Complex(3.0, 4.0);
        Complex expResult = new Complex(-3.0, -4.0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testSub_MaxValues() {
        System.out.println("Testing testSub_MaxValues");
        Complex a = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        Complex b = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        Complex expResult = new Complex(0,0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testSub_MinValues() {
        System.out.println("Testing testSub_MinValues");
        Complex a = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        Complex b = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        Complex expResult = new Complex(0,0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testSub_InfiniteValues() {
        System.out.println("Testing testSub_InfiniteValues");
        Complex a = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        Complex b = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        Complex expResult = new Complex(Double.NaN, Double.NaN);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testSub_NegativeFractionalImaginary() {
        System.out.println("Testing testSub_NegativeFractionalImaginary");
        Complex a = new Complex(4.0, -2.5);
        Complex b = new Complex(1.5, -1.0);
        Complex expResult = new Complex(2.5, -1.5);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }
/**
     * Fine Test of sub methods, of class Complex.
     */
    /**
     * Test of mul method, of class Complex.
     */
   
    @Test
    public void testMulRealAndImaginary() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 2.0);
        Complex expResult = new Complex(-4.0, 7.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }
    @Test
    public void testMulBothReal() {
        Complex a = new Complex(2.5, 0.0);
        Complex b = new Complex(3.0, 0.0);
        Complex expResult = new Complex(7.5, 0.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testMulBothImaginary() {
        Complex a = new Complex(0.0, 4.0);
        Complex b = new Complex(0.0, 2.0);
        Complex expResult = new Complex(-8.0, 0.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testMulZero() {
        Complex a = new Complex(0.0, 0.0);
        Complex b = new Complex(3.0, 5.0);
        Complex expResult = new Complex(0.0, 0.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }
    @Test
    public void testMulWithRounding() {
        Complex a = new Complex(1.234567, 2.345678);
        Complex b = new Complex(3.456789, 4.567890);
        Complex expResult = new Complex(-6.4472, 13.7479); 
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }
    
    
    /**
     * Fine Test of mul methods, of class Complex.
     */
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
