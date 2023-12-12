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
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale positiva.
     */
    @Test
    public void testGetRe_PositiveReal() {
        System.out.println("Testing testGetRe_PositiveReal");
        Complex instance = new Complex(1.0, 2.0);
        double expResult = 1.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale negativa.
     */
    @Test
    public void testGetRe_NegativeReal() {
        System.out.println("Testing testGetRe_NegativeReal");
        Complex instance = new Complex(-3.0, 2.0);
        double expResult = -3.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria zero.
     */
    @Test
    public void testGetRe_ImaginaryZero() {
        System.out.println("Testing testGetRe_ImaginaryZero");
        Complex instance = new Complex(5.0, 0.0);
        double expResult = 5.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale zero.
     */
    @Test
    public void testGetRe_RealZero() {
        System.out.println("Testing testGetRe_RealZero");
        Complex instance = new Complex(0.0, 7.0);
        double expResult = 0.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale e immaginaria zero.
     */
    @Test
    public void testGetRe_ComplexZero() {
        System.out.println("Testing testGetRe_ComplexZero");
        Complex instance = new Complex(0.0, 0.0);
        double expResult = 0.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale massima.
     */
    @Test
    public void testGetRe_MaxReal() {
        System.out.println("Testing testGetRe_MaxReal");
        Complex instance = new Complex(Double.MAX_VALUE, 3.0);
        double expResult = Double.MAX_VALUE;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale minima.
     */
    @Test
    public void testGetRe_MinReal() {
        System.out.println("Testing testGetRe_MinReal");
        Complex instance = new Complex(Double.MIN_VALUE, 4.0);
        double expResult = Double.MIN_VALUE;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale infinita.
     */
    @Test
    public void testGetRe_InfiniteReal() {
        System.out.println("Testing testGetRe_InfiniteReal");
        Complex instance = new Complex(Double.POSITIVE_INFINITY, 2.0);
        double expResult = Double.POSITIVE_INFINITY;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria massima.
     */
    @Test
    public void testGetRe_MaxImaginary() {
        System.out.println("Testing testGetRe_MaxImaginary");
        Complex instance = new Complex(5.0, Double.MAX_VALUE);
        double expResult = 5.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale frazionaria.
     */
    @Test
    public void testGetRe_FractionalReal() {
        System.out.println("Testing testGetRe_FractionalReal");
        Complex instance = new Complex(1.5, 2.0);
        double expResult = 1.5;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale frazionaria negativa.
     */
    @Test
    public void testGetRe_NegativeFractionalReal() {
        System.out.println("Testing testGetRe_NegativeFractionalReal");
        Complex instance = new Complex(-2.25, 3.0);
        double expResult = -2.25;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con errore di arrotondamento.
     */
    @Test
    public void testGetRe_RoundingError() {
        System.out.println("Testing testGetRe_RoundingError");
        Complex instance = new Complex(0.2, 0.1);
        double expResult = 0.200001; // Valore diverso
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0001); // Definisci una tolleranza per gli errori di arrotondamento
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale e immaginaria massime.
     */
    @Test
    public void testGetRe_MaxRealAndImaginary() {
        System.out.println("Testing testGetRe_MaxRealAndImaginary");
        Complex instance = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        double expResult = Double.MAX_VALUE;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRe method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale e immaginaria minime.
     */
    @Test
    public void testGetRe_MinRealAndImaginary() {
        System.out.println("Testing testGetRe_MinRealAndImaginary");
        Complex instance = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        double expResult = Double.MIN_VALUE;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Fine Test getRe
     *
     * method
     */
    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria positiva.
     */
    @Test
    public void testGetIm_PositiveImaginary() {
        System.out.println("Testing testGetIm_PositiveImaginary");
        Complex instance = new Complex(1.0, 2.0);
        double expResult = 2.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria negativa.
     */
    @Test
    public void testGetIm_NegativeImaginary() {
        System.out.println("Testing testGetIm_NegativeImaginary");
        Complex instance = new Complex(-3.0, -2.0);
        double expResult = -2.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale zero.
     */
    @Test
    public void testGetIm_RealZero() {
        System.out.println("Testing testGetIm_RealZero");
        Complex instance = new Complex(0.0, -10.0);
        double expResult = -10.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria zero.
     */
    @Test
    public void testGetIm_ImaginaryZero() {
        System.out.println("Testing testGetIm_ImaginaryZero");
        Complex instance = new Complex(2.0, 0.0);
        double expResult = 0.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale e immaginaria zero.
     */
    @Test
    public void testGetIm_ComplexZero() {
        System.out.println("Testing testGetIm_ComplexZero");
        Complex instance = new Complex(0.0, 0.0);
        double expResult = 0.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria massima.
     */
    @Test
    public void testGetIm_MaxImaginary() {
        System.out.println("Testing testGetIm_MaxImaginary");
        Complex instance = new Complex(5.0, Double.MAX_VALUE);
        double expResult = Double.MAX_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria minima.
     */
    @Test
    public void testGetIm_MinImaginary() {
        System.out.println("Testing testGetIm_MinImaginary");
        Complex instance = new Complex(4.0, Double.MIN_VALUE);
        double expResult = Double.MIN_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria infinita.
     */
    @Test
    public void testGetIm_InfiniteImaginary() {
        System.out.println("Testing testGetIm_InfiniteImaginary");
        Complex instance = new Complex(2.0, Double.NEGATIVE_INFINITY);
        double expResult = Double.NEGATIVE_INFINITY;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria frazionaria.
     */
    @Test
    public void testGetIm_FractionalImaginary() {
        System.out.println("Testing testGetIm_FractionalImaginary");
        Complex instance = new Complex(3.0, 0.5);
        double expResult = 0.5;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria frazionaria negativa.
     */
    @Test
    public void testGetIm_NegativeFractionalImaginary() {
        System.out.println("Testing testGetIm_NegativeFractionalImaginary");
        Complex instance = new Complex(4.0, -0.75);
        double expResult = -0.75;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getIm method, of class Complex. Classe d'equivalenza: Numeri
     * complessi con errore di arrotondamento.
     */
    @Test
    public void testGetIm_RoundingError() {
        System.out.println("Testing testGetIm_RoundingError");
        Complex instance = new Complex(0.1, 0.2);
        double expResult = 0.20001; // Valore diverso
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0001); // Definisci una tolleranza per gli errori di arrotondamento
    }

    /**
     * Test del metodo getIm della classe Complex. Classe d'equivalenza testata:
     * Parte reale e immaginaria massime.
     */
    @Test
    public void testGetIm_MaxRealAndImaginary() {
        System.out.println("Testing testGetIm_MaxRealAndImaginary");
        Complex instance = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        double expResult = Double.MAX_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test del metodo getIm della classe Complex. Classe d'equivalenza testata:
     * Parte reale e immaginaria minime.
     */
    @Test
    public void testGetIm_MinRealAndImaginary() {
        System.out.println("Testing testGetIm_MinRealAndImaginary");
        Complex instance = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        double expResult = Double.MIN_VALUE;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Fine Test del metodo getIm della classe Complex.
     */

    /**
     * Test del metodo toString della classe Complex. Classe d'equivalenza
     * testata: Parte reale non nulla, parte immaginaria nulla.
     */
    @Test
    public void testToString_RealPart() {
        System.out.println("Testing testToString_RealPart");
        Complex instance = new Complex(3.0, 0.0);
        String expResult = "3.0\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo toString della classe Complex. Classe d'equivalenza
     * testata: Parte reale nulla, parte immaginaria negativa.
     */
    @Test
    public void testToString_ImaginaryPart() {
        System.out.println("Testing testToString_ImaginaryPart");
        Complex instance = new Complex(0.0, -4.0);
        String expResult = "-4.0j\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo toString della classe Complex. Classe d'equivalenza
     * testata: Entrambe le parti reali e immaginarie non nulle.
     */
    @Test
    public void testToString_RealAndImaginaryParts() {
        System.out.println("Testing testToString_RealAndImaginaryParts");
        Complex instance = new Complex(2.3, 5.0);
        String expResult = "2.3 + 5.0j\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo toString della classe Complex. Classe d'equivalenza
     * testata: Entrambe le parti reali e immaginarie negative.
     */
    @Test
    public void testToString_NegativeRealAndImaginary() {
        System.out.println("Testing testToString_NegativeRealAndImaginary");
        Complex instance = new Complex(-1.0, -4.0);
        String expResult = "-1.0 - 4.0j\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Fine Test del metodo toString della classe Complex.
     */

    /**
     * Test del metodo add della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie positive.
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

    /**
     * Test del metodo add della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie negative.
     */
    @Test
    public void testAdd_NegativeRealImaginary() {
        System.out.println("Testing testAdd_NegativeReal");
        Complex a = new Complex(3.0, 2.0);
        Complex b = new Complex(-1.0, -1.0);
        Complex expResult = new Complex(2.0, 1.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo add della classe Complex. Classe d'equivalenza testata:
     * Parte reale e immaginaria nulle.
     */
    @Test
    public void testAdd_ComplexZero() {
        System.out.println("Testing testAdd_ComplexZero");
        Complex a = new Complex(0.0, 0.0);
        Complex b = new Complex(3.0, 4.0);
        Complex expResult = new Complex(3.0, 4.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo add della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie massime.
     */
    @Test
    public void testAdd_MaxValues() {
        System.out.println("Testing testAdd_MaxValues");
        Complex a = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        Complex b = new Complex(-Double.MAX_VALUE, -Double.MAX_VALUE);
        Complex expResult = new Complex(0.0, 0.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo add della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie minime.
     */
    @Test
    public void testAdd_MinValues() {
        System.out.println("Testing testAdd_MinValues");
        Complex a = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        Complex b = new Complex(-Double.MIN_VALUE, -Double.MIN_VALUE);
        Complex expResult = new Complex(0.0, 0.0);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo add della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie infinite.
     */
    @Test
    public void testAdd_InfiniteValues() {
        System.out.println("Testing testAdd_InfiniteValues");
        Complex a = new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        Complex b = new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        Complex expResult = new Complex(Double.NaN, Double.NaN);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo add della classe Complex. Classe d'equivalenza testata:
     * Parte immaginaria frazionaria negativa.
     */
    @Test
    public void testAdd_NegativeFractionalImaginary() {
        System.out.println("Testing testAdd_NegativeFractional Imaginary");
        Complex a = new Complex(4.0, -2.5);
        Complex b = new Complex(1.5, -1.0);
        Complex expResult = new Complex(5.5, -3.5);
        Complex result = Complex.add(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Fine Test del metodo add della classe Complex.
     */

    /**
     * Test del metodo sub della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie positive.
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

    /**
     * Test del metodo sub della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie negative.
     */
    @Test
    public void testSub_NegativeRealImaginary() {
        System.out.println("Testing testSub_NegativeRealImaginary");
        Complex a = new Complex(3.0, 2.0);
        Complex b = new Complex(-1.0, -1.0);
        Complex expResult = new Complex(4.0, 3.0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo sub della classe Complex. Classe d'equivalenza testata:
     * Parte reale nulla, parte immaginaria nulla.
     */
    @Test
    public void testSub_ComplexZero() {
        System.out.println("Testing testSub_ComplexZero");
        Complex a = new Complex(0.0, 0.0);
        Complex b = new Complex(3.0, 4.0);
        Complex expResult = new Complex(-3.0, -4.0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo sub della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie massime.
     */
    @Test
    public void testSub_MaxValues() {
        System.out.println("Testing testSub_MaxValues");
        Complex a = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        Complex b = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        Complex expResult = new Complex(0, 0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo sub della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie minime.
     */
    @Test
    public void testSub_MinValues() {
        System.out.println("Testing testSub_MinValues");
        Complex a = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        Complex b = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        Complex expResult = new Complex(0, 0);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo sub della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie infinite.
     */
    @Test
    public void testSub_InfiniteValues() {
        System.out.println("Testing testSub_InfiniteValues");
        Complex a = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        Complex b = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        Complex expResult = new Complex(Double.NaN, Double.NaN);
        Complex result = Complex.sub(b, a);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo sub della classe Complex. Classe d'equivalenza testata:
     * Parte immaginaria frazionaria negativa.
     */
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
     * Fine Test del metodo sub della classe Complex.
     */

    /**
     * Test del metodo mul della classe Complex. Classe d'equivalenza testata:
     * Parti reali e immaginarie.
     */
    @Test
    public void testMulRealAndImaginary() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 2.0);
        Complex expResult = new Complex(-4.0, 7.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo mul della classe Complex. Classe d'equivalenza testata:
     * Entrambe le parti reali non nulle.
     */
    @Test
    public void testMulBothReal() {
        Complex a = new Complex(2.5, 0.0);
        Complex b = new Complex(3.0, 0.0);
        Complex expResult = new Complex(7.5, 0.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo mul della classe Complex. Classe d'equivalenza testata:
     * Entrambe le parti immaginarie non nulle.
     */
    @Test
    public void testMulBothImaginary() {
        Complex a = new Complex(0.0, 4.0);
        Complex b = new Complex(0.0, 2.0);
        Complex expResult = new Complex(-8.0, 0.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo mul della classe Complex. Classe d'equivalenza testata:
     * Moltiplicazione per zero.
     */
    @Test
    public void testMulZero() {
        Complex a = new Complex(0.0, 0.0);
        Complex b = new Complex(3.0, 5.0);
        Complex expResult = new Complex(0.0, 0.0);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test del metodo mul della classe Complex. Classe d'equivalenza testata:
     * Moltiplicazione con arrotondamento.
     */
    @Test
    public void testMulWithRounding() {
        Complex a = new Complex(1.234567, 2.345678);
        Complex b = new Complex(3.456789, 4.567890);
        Complex expResult = new Complex(-6.4472, 13.7479);
        Complex result = Complex.mul(a, b);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Fine Test del metodo mul
     */
    /**
     * Testa il metodo div della classe Complex con un caso normale. Classe
     * d'equivalenza: Parte reale e immaginaria sia nel numeratore che nel
     * denominatore.
     */
    @Test
    public void testDivNormalCase() {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(1, 2);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(2.20, -0.40);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con il numeratore reale uguale a
     * zero. Classe d'equivalenza: Parte reale del numeratore uguale a zero,
     * parte immaginaria del numeratore diversa da zero.
     */
    @Test
    public void testDivNumeratorRealZero() {
        Complex a = new Complex(0, 5);
        Complex b = new Complex(2, 3);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(1.1538, 0.7692);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con il numeratore immaginario
     * uguale a zero. Classe d'equivalenza: Parte reale del numeratore diversa
     * da zero, parte immaginaria del numeratore uguale a zero.
     */
    @Test
    public void testDivNumeratorImaginaryZero() {
        Complex a = new Complex(5, 0);
        Complex b = new Complex(3, 2);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(1.1538, -0.7692);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con il denominatore reale uguale
     * a zero. Classe d'equivalenza: Parte reale del denominatore uguale a zero,
     * parte immaginaria del denominatore diversa da zero.
     */
    @Test
    public void testDivDenominatorRealZero() {
        Complex a = new Complex(5, 2);
        Complex b = new Complex(0, 6);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(0.3333, -0.8333);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con il denominatore immaginario
     * uguale a zero. Classe d'equivalenza: Parte reale del denominatore diversa
     * da zero, parte immaginaria del denominatore uguale a zero.
     */
    @Test
    public void testDivDenominatorImaginaryZero() {
        Complex a = new Complex(5, 2);
        Complex b = new Complex(3, 0);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(1.6667, 0.6667);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con numeratore e denominatore
     * con segni misti. Classe d'equivalenza: Parte reale e immaginaria del
     * numeratore e denominatore con segni misti.
     */
    @Test
    public void testDivMixedSigns() {
        Complex a = new Complex(-5, 2);
        Complex b = new Complex(3, -17);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(-0.1644, -0.2651);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con numeri di tipo double.
     * Classe d'equivalenza: Numeri di tipo double.
     */
    @Test
    public void testDivDoubleType() {
        Complex a = new Complex(0.02, 7.92);
        Complex b = new Complex(-3.14, 0.099);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(0.0731, -2.52);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con numeri molto piccoli. Classe
     * d'equivalenza: Numeri molto piccoli.
     */
    @Test
    public void testDivSmallNumbers() {
        Complex a = new Complex(1e-10, 1e-10);
        Complex b = new Complex(1e-6, 1e-6);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(0.0001, 0);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo div della classe Complex con numeri molto grandi. Classe
     * d'equivalenza: Numeri molto grandi.
     */
    @Test
    public void testDivBigNumbers() {
        Complex a = new Complex(1e10, 1e10);
        Complex b = new Complex(10, 10);
        Complex result = Complex.div(b, a);
        Complex expResult = new Complex(1000000000, 0);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Fine del test del metodo div della classe Complex.
     */

    /**
     * Testa il metodo sqrt della classe Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale e immaginaria positive.
     */
    @Test
    public void testSqrtPositiveComplex() {
        Complex input = new Complex(3, 4);
        Complex[] result = Complex.sqrt(input);

        // Result 1
        Complex expResult1 = new Complex(2, 1);
        assertEquals(expResult1.toString(), result[0].toString());

        // Result 2
        Complex expResult2 = new Complex(-2, -1);
        assertEquals(expResult2.toString(), result[1].toString());
    }

    /**
     * Testa il metodo sqrt della classe Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale e immaginaria negative.
     */
    @Test
    public void testSqrtNegativeComplex() {
        Complex input = new Complex(-2, 5);
        Complex[] result = Complex.sqrt(input);

        // Result 1
        Complex expResult1 = new Complex(1.301, 1.922);
        assertEquals(expResult1.toString(), result[0].toString());

        // Result 2
        Complex expResult2 = new Complex(-1.301, -1.922);
        assertEquals(expResult2.toString(), result[1].toString());
    }

    /**
     * Testa il metodo sqrt della classe Complex. Classe d'equivalenza: Numeri
     * puramente immaginari.
     */
    @Test
    public void testSqrtPureImaginaryComplex() {
        Complex input = new Complex(0, 18);
        Complex[] result = Complex.sqrt(input);

        // Result 1
        Complex expResult1 = new Complex(3, 3);
        assertEquals(expResult1.toString(), result[0].toString());

        // Result 2
        Complex expResult2 = new Complex(-3, -3);
        assertEquals(expResult2.toString(), result[1].toString());
    }

    /**
     * Testa il metodo sqrt della classe Complex. Classe d'equivalenza: Numeri
     * puramente reali.
     */
    @Test
    public void testSqrtPureRealComplex() {
        Complex input = new Complex(9, 0);
        Complex[] result = Complex.sqrt(input);

        // Result 1
        Complex expResult1 = new Complex(3, 0);
        assertEquals(expResult1.toString(), result[0].toString());

        // Result 2
        Complex expResult2 = new Complex(-3, 0);
        assertEquals(expResult2.toString(), result[1].toString());
    }

    /**
     * Testa il metodo sqrt della classe Complex. Classe d'equivalenza: Numeri
     * complessi con parte immaginaria zero.
     */
    @Test
    public void testSqrtImaginaryZeroComplex() {
        Complex input = new Complex(6, 0);
        Complex[] result = Complex.sqrt(input);

        // Result 1
        Complex expResult1 = new Complex(2.449, 0);
        assertEquals(expResult1.toString(), result[0].toString());

        // Result 2
        Complex expResult2 = new Complex(-2.449, 0);
        assertEquals(expResult2.toString(), result[1].toString());
    }

    /**
     * Testa il metodo sqrt della classe Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale zero.
     */
    @Test
    public void testSqrtRealZeroComplex() {
        Complex input = new Complex(0, -8);
        Complex[] result = Complex.sqrt(input);

        // Result 1
        Complex expResult1 = new Complex(2, -2);
        assertEquals(expResult1.toString(), result[0].toString());

        // Result 2
        Complex expResult2 = new Complex(-2, 2);
        assertEquals(expResult2.toString(), result[1].toString());
    }

    /**
     * Fine del test del metodo sqrt della classe Complex.
     */
    /**
     * Testa il metodo change della classe Complex. Classe d'equivalenza: Numero
     * complesso con parte reale e immaginaria positiva.
     */
    @Test
    public void testChangePositiveComplex() {
        Complex input = new Complex(3, 4);
        Complex result = Complex.change(input);

        Complex expResult = new Complex(-3, -4);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo change della classe Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale negativa e immaginaria positiva.
     */
    @Test
    public void testChangeRealNegativeComplex() {
        Complex input = new Complex(-29, 51);
        Complex result = Complex.change(input);

        Complex expResult = new Complex(29, -51);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo change della classe Complex. Classe d'equivalenza: Numeri
     * complessi con parte reale positiva e immaginaria negativa.
     */
    @Test
    public void testChangeComplexNegativeComplex() {
        Complex input = new Complex(11, -15);
        Complex result = Complex.change(input);

        Complex expResult = new Complex(-11, 15);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo change della classe Complex. Classe d'equivalenza: Numeri
     * complessi molto grandi.
     */
    @Test
    public void testChangeVeryLargeComplex() {
        Complex input = new Complex(1e100, 1e100);
        Complex result = Complex.change(input);

        Complex expResult = new Complex(-1e100, -1e100);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Testa il metodo change della classe Complex. Classe d'equivalenza: Numeri
     * complessi molto piccoli.
     */
    @Test
    public void testChangeVerySmallComplex() {
        Complex input = new Complex(1e-100, 1e-100);
        Complex result = Complex.change(input);

        Complex expResult = new Complex(-1e-100, -1e-100);
        assertEquals(expResult.toString(), result.toString());
    }

}
