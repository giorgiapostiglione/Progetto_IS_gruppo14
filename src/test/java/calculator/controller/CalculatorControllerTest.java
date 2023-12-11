/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator.controller;

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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyNumericInput method, of class CalculatorController.
     */
    @Test
    public void testVerifyNumericInput() {
        CalculatorModel model= new CalculatorModel();
        CalculatorView view= new CalculatorView();
        CalculatorController controller= new CalculatorController(model,view);
        System.out.println("verifyNumericInput");
        String input = "3+2j";
        boolean expResult = true;
        boolean result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "1.23";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-5i";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "0.5";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "+3.14";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "123  i";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = " 0.01";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "2e3";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "5e-2";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "-1E4";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "3 - 4i";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "5.6 + 7i";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);

        input = "9i";
        expResult = true;
        result = controller.verifyNumericInput(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of verifyArithmeticOperation method, of class CalculatorController.
     */
    @Test
    public void testVerifyArithmeticOperation() {
        System.out.println("verifyArithmeticOperation");
        String input = "";
        CalculatorController instance = null;
        boolean expResult = false;
        boolean result = instance.verifyArithmeticOperation(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyVariablesOperation method, of class CalculatorController.
     */
    @Test
    public void testVerifyVariablesOperation() {
        System.out.println("verifyVariablesOperation");
        String input = "";
        CalculatorController instance = null;
        boolean expResult = false;
        boolean result = instance.verifyVariablesOperation(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
