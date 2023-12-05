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
public class StackFinitoTest {
    
    public StackFinitoTest() {
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
     * Test of push method, of class StackFinito.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Complex element = null;
        StackFinito instance = new StackFinito();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackFinito.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        Complex expResult = null;
        Complex result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class StackFinito.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        StackFinito instance = new StackFinito();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxSize method, of class StackFinito.
     */
    @Test
    public void testGetMaxSize() {
        System.out.println("getMaxSize");
        StackFinito instance = new StackFinito();
        int expResult = 0;
        int result = instance.getMaxSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewElement method, of class StackFinito.
     */
    @Test
    public void testViewElement() {
        System.out.println("viewElement");
        int index = 0;
        StackFinito instance = new StackFinito();
        Complex expResult = null;
        Complex result = instance.viewElement(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    /**
     * Test of stampaDodiceElementi method, of class StackFinito.
     */
    @Test
    public void testStampaDodiceElementi() {
        System.out.println("stampaDodiceElementi");
        StackFinito instance = new StackFinito();
        String expResult = "";
        String result = instance.stampaDodiceElementi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
