/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator.controller;

import calculator.exception.NotEnoughElementException;
import calculator.model.CalculatorModel;
import calculator.view.CalculatorView;
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
     * Test of verifyNumericInput method, of class CalculatorController.
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
     * Test of verifyArithmeticOperation method, of class CalculatorController.
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
       result=controller.verifyArithmeticOperation(input);
       assertEquals(expResult, result);
        }
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
       result=controller.verifyArithmeticOperation(input);
       assertEquals(expResult, result);
        }
    
    @Test
    public void testVerifyArithmeticOperationProdotto() {
        System.out.println("testVerifyArithmeticOperationDifferenza");
        CalculatorModel model = new CalculatorModel();
        
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);
        model.insertNumber(2, 4);
        Boolean expResult = true;
        Boolean result;
        
       String input = "*";
       result=controller.verifyArithmeticOperation(input);
       assertEquals(expResult, result);
        }
    
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
       result=controller.verifyArithmeticOperation(input);
       assertEquals(expResult, result);
        }
    @Test
    public void testVerifyArithmeticOperationRadice() {
        System.out.println("testVerifyArithmeticOperationRadice");
        CalculatorModel model = new CalculatorModel();
        
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);
        model.insertNumber(2, 4);
        Boolean expResult = true;
        Boolean result;
        
       String input = "√";
       result=controller.verifyArithmeticOperation(input);
       assertEquals(expResult, result);
        }
    @Test
    public void testVerifyArithmeticOperationCambioSegno() {
        System.out.println("testVerifyArithmeticOperationCambioSegno");
        CalculatorModel model = new CalculatorModel();
        
        CalculatorController controller = new CalculatorController(model);
        model.insertNumber(1, 4);
        model.insertNumber(2, 4);
        Boolean expResult = true;
        Boolean result;
        
       String input = "+/-";
       result=controller.verifyArithmeticOperation(input);
       assertEquals(expResult, result);
        }

    /**
     * Test of verifyVariablesOperation method, of class CalculatorController.
     */
    @Test
    public void testVerifyVariablesOperationAssegnaVariabile() {
        System.out.println("testVerifyVariablesOperation>x");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        Boolean expResult = true;
        Boolean result;
        String input = "";

        for (char c = 'a'; c <= 'z'; c++) {
            input = ">x" + c;
            model.insertNumber(1, 4);
            result = controller.verifyVariablesOperation(input);
            assertEquals(expResult, result);
        }
    }
     
    @Test
    public void testVerifyVariablesOperationDuplicaVariabile() {
        System.out.println("testVerifyVariablesOperation<x");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        Boolean expResult = true;
        Boolean result;
        String input = "";

        for (char c = 'a'; c <= 'z'; c++) {
            input = "<x" + c;
            model.insertNumber(1, 4);
            model.assegnaVariabile(c);
            result = controller.verifyVariablesOperation(input);
            assertEquals(expResult, result);
        }
    }
    @Test
    public void testVerifyVariablesOperationSommaVariabile() {
        System.out.println("testVerifyVariablesOperation+x");
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
    }
    
    @Test
    public void testVerifyVariablesOperationDifferenzaVariabile() {
        System.out.println("testVerifyVariablesOperation-x");
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
    }
    
}
