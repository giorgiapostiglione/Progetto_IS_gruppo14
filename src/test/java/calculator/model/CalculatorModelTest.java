/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator.model;

import calculator.exception.StackFullException;
import calculator.exception.StackUnderflowException;
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
public class CalculatorModelTest {
    
    public CalculatorModelTest() {
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
     * Test of getSf method, of class CalculatorModel.
     */
    @Test
    public void testGetSf() {
        System.out.println("getSf");
        CalculatorModel instance = new CalculatorModel();
        Complex c= new Complex(4,8);
        
        StackFinito result = instance.getSf();
        assertEquals(0, result.getSize());
        try{
        instance.insertNumber(8, 4);
        assertEquals(c.toString(),result.viewElement(0).toString());
        assertEquals(1, result.getSize());
        
        }catch(StackFullException ex){
            fail("Unexpected exception: " + ex.getMessage());
        }
    }

    /**
     * Test of toStringHM method, of class CalculatorModel.
     */
    @Test
    public void testToStringHM() {
        System.out.println("toStringHM");
        CalculatorModel instance = new CalculatorModel();
        instance.insertNumber(4, 7);
        instance.insertNumber(3, 5);
        try{
            instance.assegnaVariabile('c');
            instance.assegnaVariabile('d');
        }catch(StackUnderflowException ex){
            fail("Unexpected exception: " + ex.getMessage());
        }
        String expResult = "c=5.0 + 3.0j\nd=7.0 + 4.0j\n";
        String result = instance.toStringHM();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of insertNumber method, of class CalculatorModel.
     */
    @Test
    public void testInsertNumberPositive() {
        System.out.println("testInsertNumberPositive");
        double im = 3.5;
        double re = 2.0;
        CalculatorModel instance = new CalculatorModel();

        try {
            instance.insertNumber(im, re);
            
            

        } catch (StackFullException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
    }

    @Test
    public void testInsertNumberNegative() {
        System.out.println("testInsertNumberNegative");
        double im = -1.5;
        double re = -4.0;
        CalculatorModel instance = new CalculatorModel();

        try {
            instance.insertNumber(im, re);
            

        } catch (StackFullException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
    }

    @Test
    public void testInsertNumberZero() {
        System.out.println("testInsertNumberZero");
        double im = 0.0;
        double re = 0.0;
        CalculatorModel instance = new CalculatorModel();

        try {
            instance.insertNumber(im, re);
            

        } catch (StackFullException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
    }

    

    @Test
    public void testInsertNumberStackFullException() {
        System.out.println("testInsertNumberStackFullException");
        
        
        CalculatorModel instance = new CalculatorModel();

        try {
            for(int i=0;i<51;i++){
            instance.insertNumber(i*3.33,i*2.41 );
            }
            
            fail("Expected StackFullException, but it was not thrown.");
        } catch (StackFullException ex) {
            // Questo è il risultato atteso
        }
    }
/**
     * Fine test of insertNumber method, of class CalculatorModel.
     */
    /**
     * Test of somma method, of class CalculatorModel.
     */
    @Test
    public void testSomma() {
        System.out.println("somma");
        CalculatorModel instance = new CalculatorModel();
        instance.somma();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of differenza method, of class CalculatorModel.
     */
    @Test
    public void testDifferenza() {
        System.out.println("differenza");
        CalculatorModel instance = new CalculatorModel();
        instance.differenza();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prodotto method, of class CalculatorModel.
     */
    @Test
    public void testProdotto() {
        System.out.println("prodotto");
        CalculatorModel instance = new CalculatorModel();
        instance.prodotto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rapporto method, of class CalculatorModel.
     */
    @Test
    public void testRapporto() {
        System.out.println("rapporto");
        CalculatorModel instance = new CalculatorModel();
        instance.rapporto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of radice method, of class CalculatorModel.
     */
    @Test
    public void testRadice() {
        System.out.println("radice");
        CalculatorModel instance = new CalculatorModel();
        instance.radice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioSegno method, of class CalculatorModel.
     */
    @Test
    public void testCambioSegno() {
        System.out.println("cambioSegno");
        CalculatorModel instance = new CalculatorModel();
        instance.cambioSegno();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class CalculatorModel.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        CalculatorModel instance = new CalculatorModel();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class CalculatorModel.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        CalculatorModel instance = new CalculatorModel();
        instance.swap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drop method, of class CalculatorModel.
     */
    @Test
    public void testDrop() {
        System.out.println("drop");
        CalculatorModel instance = new CalculatorModel();
        instance.drop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dup method, of class CalculatorModel.
     */
    @Test
    public void testDup() {
        System.out.println("dup");
        CalculatorModel instance = new CalculatorModel();
        instance.dup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of over method, of class CalculatorModel.
     */
    @Test
    public void testOver() {
        System.out.println("over");
        CalculatorModel instance = new CalculatorModel();
        instance.over();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sommaVariabile method, of class CalculatorModel.
     */
    @Test
    public void testSommaVariabile() {
        System.out.println("sommaVariabile");
        char c = ' ';
        CalculatorModel instance = new CalculatorModel();
        instance.sommaVariabile(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of differenzaVariabile method, of class CalculatorModel.
     */
    @Test
    public void testDifferenzaVariabile() {
        System.out.println("differenzaVariabile");
        char c = ' ';
        CalculatorModel instance = new CalculatorModel();
        instance.differenzaVariabile(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of duplicazioneVariabile method, of class CalculatorModel.
     */
    @Test
    public void testDuplicazioneVariabile() {
        System.out.println("duplicazioneVariabile");
        char c = ' ';
        CalculatorModel instance = new CalculatorModel();
        instance.duplicazioneVariabile(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assegnaVaribile method, of class CalculatorModel.
     */
    @Test
    public void testAssegnaVaribile() {
        System.out.println("assegnaVaribile");
        char c = ' ';
        CalculatorModel instance = new CalculatorModel();
        instance.assegnaVariabile(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
