/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator.model;

import calculator.exception.NotEnoughElementException;
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
     * Test del metodo getSf della classe CalculatorModel.
     * Classe testata: CalculatorModel
     * Classe di equivalenza testata:
     *   Parte reale: qualsiasi numero reale
     *   Parte immaginaria: qualsiasi numero reale
     */
    @Test
    public void testGetSf() {
        // Test del metodo getSf che recupera lo stack del modello di calcolatrice.
        System.out.println("getSf");
        CalculatorModel instance = new CalculatorModel();
        Complex c = new Complex(4, 8);

        // Test della dimensione dello stack quando nessun numero è inserito.
        StackFinito result = instance.getSf();
        assertEquals(0, result.getSize());
        try {
            // Inserire un numero complesso e verificare se la dimensione e il contenuto dello stack sono corretti.
            instance.insertNumber(8, 4);
            assertEquals(c.toString(), result.viewElement(0).toString());
            assertEquals(1, result.getSize());

        } catch (StackFullException ex) {
            fail("Eccezione inaspettata: " + ex.getMessage());
        }
    }

    /**
     * Test del metodo toStringHM della classe CalculatorModel.
     * Classe testata: CalculatorModel
     * Classe di equivalenza testata:
     *   Parte reale: qualsiasi numero reale
     *   Parte immaginaria: qualsiasi numero reale
     */
    @Test
    public void testToStringHM() {
        // Test del metodo toStringHM che restituisce una rappresentazione stringa delle variabili assegnate.
        System.out.println("toStringHM");
        CalculatorModel instance = new CalculatorModel();
        instance.insertNumber(4, 7);
        instance.insertNumber(3, 5);
        try {
            instance.assegnaVariabile('c');
            instance.assegnaVariabile('d');
        } catch (StackUnderflowException ex) {
            fail("Eccezione inaspettata: " + ex.getMessage());
        }
        String expResult = "c=5.0 + 3.0j\nd=7.0 + 4.0j\n";
        String result = instance.toStringHM();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo insertNumber della classe CalculatorModel con numero positivo.
     * Classe testata: CalculatorModel
     * Classe di equivalenza testata:
     *   Parte reale: numero positivo
     *   Parte immaginaria: numero positivo
     */
    @Test
    public void testInsertNumberPositive() {
        // Test del metodo insertNumber con numero complesso positivo.
        System.out.println("testInsertNumberPositive");
        double im = 3.5;
        double re = 2.0;
        CalculatorModel instance = new CalculatorModel();

        try {
            instance.insertNumber(im, re);

        } catch (StackFullException ex) {
            fail("Eccezione inaspettata: " + ex.getMessage());
        }
    }

    /**
     * Test del metodo insertNumber della classe CalculatorModel con numero negativo.
     * Classe testata: CalculatorModel
     * Classe di equivalenza testata:
     *   Parte reale: numero negativo
     *   Parte immaginaria: numero negativo
     */
    @Test
    public void testInsertNumberNegative() {
        // Test del metodo insertNumber con numero complesso negativo.
        System.out.println("testInsertNumberNegative");
        double im = -1.5;
        double re = -4.0;
        CalculatorModel instance = new CalculatorModel();

        try {
            instance.insertNumber(im, re);

        } catch (StackFullException ex) {
            fail("Eccezione inaspettata: " + ex.getMessage());
        }
    }

    /**
     * Test del metodo insertNumber della classe CalculatorModel con numero zero.
     * Classe testata: CalculatorModel
     * Classe di equivalenza testata:
     *   Parte reale: numero zero
     *   Parte immaginaria: numero zero
     */
    @Test
    public void testInsertNumberZero() {
        // Test del metodo insertNumber con numero complesso zero.
        System.out.println("testInsertNumberZero");
        double im = 0.0;
        double re = 0.0;
        CalculatorModel instance = new CalculatorModel();

        try {
            instance.insertNumber(im, re);

        } catch (StackFullException ex) {
            fail("Eccezione inaspettata: " + ex.getMessage());
        }
    }

    /**
     * Test del metodo insertNumber della classe CalculatorModel con StackFullException.
     * Classe testata: CalculatorModel
     * Classe di equivalenza testata:
     *   Parte reale: qualsiasi numero reale
     *   Parte immaginaria: qualsiasi numero reale
     */
    @Test
    public void testInsertNumberStackFullException() {
        // Test del metodo insertNumber con StackFullException.
        System.out.println("testInsertNumberStackFullException");
        CalculatorModel instance = new CalculatorModel();

        try {
            for (int i = 0; i < 51; i++) {
                instance.insertNumber(i * 3.33, i * 2.41);
            }

            fail("Ci si aspetta StackFullException, ma non è stata lanciata.");
        } catch (StackFullException ex) {
            // Questo è il risultato atteso
        }
    }
    /**
     * Fine del test del metodo insertNumber della classe CalculatorModel.
     */


    /**
     * Test of somma method, of class CalculatorModel.
     * 
     * Metodo testato con classe d'equivalenza:
     * - Parte reale e immaginaria di entrambi i numeri complessi sono positivi.
     */
    @Test
    public void testSomma() {
        System.out.println("somma");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1, c2;
        c1 = new Complex(4, 9);
        c2 = new Complex(3, -3);
        sf.push(c1);
        sf.push(c2);
        try {
            // Metodo testato con numeri complessi validi
            instance.somma();
        } catch (NotEnoughElementException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
        // Verifica se la somma è corretta
        assertEquals(sf.viewElement(sf.getSize() - 1).toString(), Complex.add(c1, c2).toString());
    }

    /**
     * Test of sommaException method, of class CalculatorModel.
     * 
     * Metodo testato con classe d'equivalenza:
     * - Meno di due numeri complessi nello stack.
     */
    @Test
    public void testSommaException() {
        System.out.println("sommaException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1;
        c1 = new Complex(4, 9);

        sf.push(c1);

        try {
            // Metodo testato con meno di due numeri complessi nello stack
            instance.somma();
            // Fail se l'eccezione attesa non viene lanciata
            fail("Expected NotEnoughElementException");
        } catch (NotEnoughElementException ex) {
            // Se l'eccezione attesa viene lanciata, il test è corretto
        }
    }

    /**
     * Test of differenza method, of class CalculatorModel.
     * 
     * Metodo testato con classe d'equivalenza:
     * - Parte reale e immaginaria del primo numero complesso è maggiore del secondo.
     */
    @Test
    public void testDifferenza() {
        System.out.println("differenza");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1, c2;
        c1 = new Complex(4, 9);
        c2 = new Complex(3, 4);
        sf.push(c1);
        sf.push(c2);
        try {
            // Metodo testato con numeri complessi validi
            instance.differenza();
        } catch (NotEnoughElementException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
        // Verifica se la differenza è corretta
        assertEquals(sf.viewElement(sf.getSize() - 1).toString(), Complex.sub(c2, c1).toString());
    }

    /**
     * Test of differenzaException method, of class CalculatorModel.
     * 
     * Metodo testato con classe d'equivalenza:
     * - Meno di due numeri complessi nello stack.
     */
    @Test
    public void testDifferenzaException() {
        System.out.println("DifferenzaException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1;
        c1 = new Complex(4, 9);

        sf.push(c1);

        try {
            // Metodo testato con meno di due numeri complessi nello stack
            instance.differenza();
            // Fail se l'eccezione attesa non viene lanciata
            fail("Expected NotEnoughElementException");
        } catch (NotEnoughElementException ex) {
            // Se l'eccezione attesa viene lanciata, il test è corretto
        }
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
