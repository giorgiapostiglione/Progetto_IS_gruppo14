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
    //verifico che  l'elemento presente in cima allo stack è uguale a quello inserito
    public void testPush_elem() {
        System.out.println("push");
        Complex element = new Complex(-55, 81);
        StackFinito instance = new StackFinito();
        instance.push(element);
        assertEquals(instance.viewElement(instance.getSize()-1), element);
    }
    @Test
    //verifico che  gli ultimi elementi presenti in cima allo stack sono uguali a quelli inseriti
    public void testPush_elems() {
        System.out.println("push");
        Complex element1 = new Complex(-73, 94);
        Complex element2 = new Complex(36, 1201);
        Complex element3 = new Complex(-908, 3489);
        Complex element4 = new Complex(-5025, -3098);
        StackFinito instance = new StackFinito();
        instance.push(element1);
        instance.push(element2);
        instance.push(element3);
        instance.push(element4);
        assertEquals(instance.viewElement(instance.getSize()-4), element1);
        assertEquals(instance.viewElement(instance.getSize()-3), element2);
        assertEquals(instance.viewElement(instance.getSize()-2), element3);
        assertEquals(instance.viewElement(instance.getSize()-1), element4);
    }
    @Test
    //verifico che la dimensione dello stack aumenti dopo la push
    public void testPush_size() {
        System.out.println("push");
        StackFinito instance = new StackFinito();
        int expResult=instance.getSize()+1;
        Complex number = new Complex(63,-76);
        int result=instance.getSize();
        assertEquals(expResult, result);
    }
    /**
     * Test of pop method, of class StackFinito.
     */
    @Test
    //verifico che l'elemento inserito sia uguale a quello prelevato dalla pop: stack vuoto
    public void testPop_emptyStack() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        Complex expResult = instance.viewElement(instance.getSize()-1);
        Complex result = instance.pop();
        assertEquals(expResult, result);
    }
    @Test
    //verifico che l'elemento inserito sia uguale a quello prelevato dalla pop: stack con un elemento
    public void testPop_elem() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(254, -188));
        Complex expResult = instance.viewElement(instance.getSize()-1);
        Complex result = instance.pop();
        assertEquals(expResult, result);
    }
    @Test
    //verifico che l'elemento inserito sia uguale a quello prelevato dalla pop: stack con più elementi
    public void testPop_elems() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(-738, -233));
        instance.push(new Complex(524, 1002));
        instance.push(new Complex(935, -347));
        Complex expResult1 = instance.viewElement(instance.getSize()-1);
        Complex expResult2 = instance.viewElement(instance.getSize()-2);
        Complex expResult3 = instance.viewElement(instance.getSize()-3);
        Complex result1 = instance.pop();
        Complex result2 = instance.pop();
        Complex result3 = instance.pop();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }
    @Test
    //verifico che la dimensione dello stack diminuisca dopo la pop
    public void testPop_size() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        int expResult=instance.getSize()-1;
        Complex number = instance.pop();
        int result=instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSize method, of class StackFinito.
     */
    @Test
    //verfico che la getSize restituisca la dimensione effettiva dello stack
    public void testGetSize_push() {
        System.out.println("getSize");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(-22, -34));
        instance.push(new Complex(-57, 24));
        instance.push(new Complex(89, 93));
        int expResult = 3;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
    @Test
    //verfico che la getSize restituisca la dimensione effettiva dello stack
    public void testGetSize_pushAndPop() {
        System.out.println("getSize");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(-33, -64));
        instance.push(new Complex(-85, 26));
        instance.push(new Complex(77, 32));
        Complex number=instance.pop();
        int expResult = 2;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxSize method, of class StackFinito.
     */
    @Test
    //verifico che getMaxSize prelevi correttamente l'attributo privato maxSize
    public void testGetMaxSize() {
        System.out.println("getMaxSize");
        StackFinito instance = new StackFinito();
        int expResult = 50;
        int result = instance.getMaxSize();
        assertEquals(expResult, result);
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
