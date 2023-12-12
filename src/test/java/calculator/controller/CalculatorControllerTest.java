/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator.controller;

import calculator.exception.NotEnoughElementException;
import calculator.model.CalculatorModel;
import calculator.model.Complex;
import calculator.view.CalculatorView;
import java.util.Map;
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
public class CalculatorControllerTest {

    public CalculatorControllerTest() {

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
     * Test del metodo verifyNumericInput della classe CalculatorController.
     * Classe d'equivalenza: Inserimento di input contenenti numeri complessi,
     * reali, interi, e parte immaginaria. Descrizione del test: Si verifica se
     * il metodo riconosce correttamente input validi di diversi tipi numerici.
     */
    @Test
    public void testVerifyNumericInput() {
        CalculatorModel model = new CalculatorModel();

        CalculatorController controller = new CalculatorController(model);
        System.out.println("verifyNumericInput");
        String input = "";

        input = "3+2j";
        boolean expResult = true;
        boolean result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-2+5j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "1.23";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "3";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-0.5";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-3";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "8j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-1j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-0.3j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "0.897j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "3-4j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "5.6+7j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "9j";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo verifyArithmeticOperation della classe
     * CalculatorController per l'operazione di somma. Classe d'equivalenza:
     * Inserimento del carattere "+" per l'operazione di somma. Descrizione del
     * test: Si verifica se il metodo riconosce correttamente l'operazione di
     * somma. Inoltre viene verificata la corretta integrazione del sistema
     */
    @Test
    public void testVerifyArithmeticOperationSomma() {
        System.out.println("testVerifyArithmeticOperationSomma");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);
        model.insertNumber(2, 4);
        Boolean expResult = true;
        Boolean result;

        String input = "+";
        result = controller.verifyArithmeticOperation(input);
        assertEquals(expResult, result);

        /*Verifico integrazione sistema controllando che la somma sia stata effettuata e 
        correttamente inserita
         */
        Complex c1 = new Complex(4, 1);
        Complex c2 = new Complex(4, 2);
        Complex sum = Complex.add(c1, c2);
        assertEquals(sum.toString(), model.getSf().viewElement(0).toString());
    }

    /**
     * Test del metodo verifyArithmeticOperation della classe
     * CalculatorController per l'operazione di differenza. Classe
     * d'equivalenza: Inserimento del carattere "-" per l'operazione di
     * differenza. Descrizione del test: Si verifica se il metodo riconosce
     * correttamente l'operazione di differenza. Inoltre viene verificata la
     * corretta integrazione del sistema
     */
    @Test
    public void testVerifyArithmeticOperationDifferenza() {
        System.out.println("testVerifyArithmeticOperationDifferenza");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);
        model.insertNumber(2, 4);
        Boolean expResult = true;
        Boolean result;

        String input = "-";
        result = controller.verifyArithmeticOperation(input);
        assertEquals(expResult, result);

        /*Verifico integrazione sistema controllando che la differenza sia stata effettuata e 
        correttamente inserita
         */
        Complex c1 = new Complex(4, 1);
        Complex c2 = new Complex(4, 2);
        Complex sub = Complex.sub(c2, c1);
        assertEquals(sub.toString(), model.getSf().viewElement(0).toString());
    }

    /**
     * Test del metodo verifyArithmeticOperation della classe
     * CalculatorController per l'operazione di prodotto. Classe d'equivalenza:
     * Inserimento del carattere "*" per l'operazione di prodotto. Descrizione
     * del test: Si verifica se il metodo riconosce correttamente l'operazione
     * di prodotto. Inoltre viene verificata la corretta integrazione del
     * sistema
     */
    @Test
    public void testVerifyArithmeticOperationProdotto() {
        System.out.println("testVerifyArithmeticOperationProdotto");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);
        model.insertNumber(2, 4);
        Boolean expResult = true;
        Boolean result;

        String input = "*";
        result = controller.verifyArithmeticOperation(input);
        assertEquals(expResult, result);

        /*Verifico integrazione sistema controllando che il prodotto sia stata effettuato e 
        correttamente inserito
         */
        Complex c1 = new Complex(4, 1);
        Complex c2 = new Complex(4, 2);
        Complex prodotto = Complex.mul(c1, c2);
        assertEquals(prodotto.toString(), model.getSf().viewElement(0).toString());
    }

    /**
     * Test del metodo verifyArithmeticOperation della classe
     * CalculatorController per l'operazione di rapporto. Classe d'equivalenza:
     * Inserimento del carattere "÷" per l'operazione di rapporto. Descrizione
     * del test: Si verifica se il metodo riconosce correttamente l'operazione
     * di rapporto.
     */
    @Test
    public void testVerifyArithmeticOperationRapporto() {
        System.out.println("testVerifyArithmeticOperationRapporto");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);
        model.insertNumber(2, 4);
        Boolean expResult = true;
        Boolean result;

        String input = "÷";
        result = controller.verifyArithmeticOperation(input);
        assertEquals(expResult, result);

        /*Verifico integrazione sistema controllando che il rapporto sia stata effettuato e 
        correttamente inserito
         */
        Complex c1 = new Complex(4, 1);
        Complex c2 = new Complex(4, 2);
        Complex div = Complex.div(c2, c1);
        assertEquals(div.toString(), model.getSf().viewElement(0).toString());
    }

    /**
     * Test del metodo verifyArithmeticOperation della classe
     * CalculatorController per l'operazione di radice quadrata. Classe
     * d'equivalenza: Inserimento del carattere "√" per l'operazione di radice
     * quadrata. Descrizione del test: Si verifica se il metodo riconosce
     * correttamente l'operazione di radice quadrata.
     */
    @Test
    public void testVerifyArithmeticOperationRadice() {
        System.out.println("testVerifyArithmeticOperationRadice");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);

        Boolean expResult = true;
        Boolean result;

        String input = "√";
        result = controller.verifyArithmeticOperation(input);
        assertEquals(expResult, result);

        /*Verifico integrazione sistema controllando che la radice sia stata effettuata e 
        i risultati correttamente inseriti
         */
        Complex c1 = new Complex(4, 1);
        Complex rad[] = new Complex[2];
        rad = Complex.sqrt(c1);
        assertEquals(rad[1].toString(), model.getSf().viewElement(model.getSf().getSize() - 1).toString());
        assertEquals(rad[0].toString(), model.getSf().viewElement(model.getSf().getSize() - 2).toString());
    }

    /**
     * Test del metodo verifyArithmeticOperation della classe
     * CalculatorController per l'operazione di cambio di segno. Classe
     * d'equivalenza: Inserimento del carattere "+/-" per l'operazione di cambio
     * di segno. Descrizione del test: Si verifica se il metodo riconosce
     * correttamente l'operazione di cambio di segno.
     */
    @Test
    public void testVerifyArithmeticOperationCambioSegno() {
        System.out.println("testVerifyArithmeticOperationCambioSegno");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);

        Boolean expResult = true;
        Boolean result;

        String input = "+/-";
        result = controller.verifyArithmeticOperation(input);
        assertEquals(expResult, result);
        /*Verifico integrazione sistema controllando che il cambio segno sia stato effettuato e 
        il risultato correttamente inserito
         */
        Complex c = new Complex(-4, -1);
        assertEquals(c.toString(), model.getSf().viewElement(0).toString());
    }

    /**
     * Test del metodo verifyVariablesOperation della classe
     * CalculatorController per l'assegnazione di variabili. Classe
     * d'equivalenza: Inserimento di input nel formato ">x" seguito da una
     * lettera da 'a' a 'z'. Descrizione del test: Si verifica se il metodo
     * riconosce correttamente l'assegnazione di variabili. Inoltre viene
     * verificata l'integration del sistema
     */
    @Test
    public void testVerifyVariablesOperationAssegnaVariabile() {
        System.out.println("testVerifyVariablesOperationAssegnaVariabile");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        Boolean expResult = true;
        Boolean result;
        String input = "";
        int i = 0;
        /*
        Verifico l'operazione di assegnazione di tutte le variabili e 
        assegno un valore diverso ad ognuna
         */
        for (char c = 'a'; c <= 'z'; c++) {
            input = ">x" + c;
            model.insertNumber(1 + i, 4 - i);

            result = controller.verifyVariablesOperation(input);
            assertEquals(expResult, result);
            i++;
        }
        Map map = model.getMap();

        /*verifico che tutte le variabili siano state instanziate a valore
        corretto nella map
         */
        i = 0;
        for (char c = 'a'; c <= 'z'; c++) {

            Complex n = new Complex(4 - i, 1 + i);
            i++;

            assertEquals(map.get(c).toString(), n.toString());
        }

    }

    /**
     * Test del metodo verifyVariablesOperation della classe
     * CalculatorController per la duplicazione di variabili. Classe
     * d'equivalenza: Inserimento di input nel formato "<x" seguito da una
     * lettera da 'a' a 'z'. Descrizione del test: Si verifica se il metodo
     * riconosce correttamente la duplicazione di variabili. Inoltre viene
     * verificata la corretta integrazione del sistema
     */
    @Test
    public void testVerifyVariablesOperationDuplicaVariabile() {
        System.out.println("testVerifyVariablesOperationDuplicaVariabile");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        Boolean expResult = true;
        Boolean result;
        String input = "";
        int i = 0;
        /*
        Verifico l'operazione di duplicazione di tutte le variabili e 
        assegno un valore diverso ad ognuna
         */
        for (char c = 'a'; c <= 'z'; c++) {
            input = "<x" + c;
            model.insertNumber(1 - i, 4 + i);
            i++;
            model.assegnaVariabile(c);
            result = controller.verifyVariablesOperation(input);
            assertEquals(expResult, result);
        }

        i--;
        int j = 1;
        /*
        Verifico che tutte le variabili duplicate siano state inserite nello stack, avrò
        quindi in cima il valore di z essendo l'ultima duplicata e in fondo il valore di a
        
         */
        for (char c = 'a'; c <= 'z'; c++) {
            Complex n = new Complex(4 + i, 1 - i);
            assertEquals(n.toString(), model.getSf().viewElement(model.getSf().getSize() - j).toString());
            i--;
            j++;
        }
    }

    /**
     * Test del metodo verifyVariablesOperation della classe
     * CalculatorController per l'operazione di somma con variabili. Classe
     * d'equivalenza: Inserimento di input nel formato "+x" seguito da una
     * lettera da 'a' a 'z'. Descrizione del test: Si verifica se il metodo
     * riconosce correttamente l'operazione di somma con variabili. Inoltre
     * viene verificata la corretta integrazione del sistema
     */
    @Test
    public void testVerifyVariablesOperationSommaVariabile() {
        System.out.println("testVerifyVariablesOperationSommaVariabile");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        Boolean expResult = true;
        Boolean result;
        String input = "";

        for (char c = 'a'; c <= 'z'; c++) {
            input = "+x" + c;
            model.insertNumber(1, 4);
            model.insertNumber(2, 1);
            model.assegnaVariabile(c);
            result = controller.verifyVariablesOperation(input);
            assertEquals(expResult, result);
        }
        Map map = model.getMap();
        //somma dei due inserimenti precedenti
        Complex c1 = new Complex(5, 3);
        /*
        Verifico che ogni variabile sia stata correttamente sommata
         */

        for (char c = 'a'; c <= 'z'; c++) {
            assertEquals(map.get(c).toString(), c1.toString());
        }
    }

    /**
     * Test del metodo verifyVariablesOperation della classe
     * CalculatorController per l'operazione di differenza con variabili. Classe
     * d'equivalenza: Inserimento di input nel formato "-x" seguito da una
     * lettera da 'a' a 'z'. Descrizione del test: Si verifica se il metodo
     * riconosce correttamente l'operazione di differenza con variabili. Inoltre
     * viene verificata la corretta integrazione del sistema
     */
    @Test
    public void testVerifyVariablesOperationDifferenzaVariabile() {
        System.out.println("testVerifyVariablesOperationDifferenzaVariabile");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        Boolean expResult = true;
        Boolean result;
        String input = "";

        for (char c = 'a'; c <= 'z'; c++) {
            input = "-x" + c;
            model.insertNumber(1, 4);
            model.insertNumber(2, 1);
            model.assegnaVariabile(c);
            result = controller.verifyVariablesOperation(input);
            assertEquals(expResult, result);
        }
        Map map = model.getMap();
        //differenza dei due inserimenti precedenti
        Complex c1 = new Complex(-3, 1);
        /*
        Verifico che ogni variabile sia stata correttamente sottratta
         */

        for (char c = 'a'; c <= 'z'; c++) {
            assertEquals(map.get(c).toString(), c1.toString());
        }
    }

}
