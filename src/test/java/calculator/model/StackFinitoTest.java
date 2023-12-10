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
     * Test del metodo push della classe StackFinito.
     * Verifica che l'elemento presente in cima allo stack sia uguale a quello inserito.
     * Classe d'equivalenza testata: Parte reale e immaginaria con valori arbitrari (-55.603, 81).
     */
    @Test
    public void testPush_elem() {
        System.out.println("push");
        Complex element = new Complex(-55.603, 81);
        StackFinito instance = new StackFinito();
        instance.push(element);
        assertEquals(instance.viewElement(instance.getSize()-1), element);
    }

    /**
     * Test del metodo push della classe StackFinito.
     * Verifica che gli ultimi elementi presenti in cima allo stack siano uguali a quelli inseriti.
     * Classe d'equivalenza testata: Parte reale e immaginaria con valori arbitrari per quattro elementi diversi.
     */
    @Test
    public void testPush_elems() {
        System.out.println("push");
        Complex element1 = new Complex(-73.65, 94.26);
        Complex element2 = new Complex(36.881, 1201.39);
        Complex element3 = new Complex(-908.1379, 3489);
        Complex element4 = new Complex(-5025, -3098.22);
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

    /**
     * Test del metodo push della classe StackFinito.
     * Verifica che la condizione di stack pieno venga riconosciuta.
     * Classe d'equivalenza testata: Inserimento di 50 elementi casuali.
     */
    @Test
    public void testPush_full() {
        System.out.println("push");
        StackFinito instance = new StackFinito();
        try{
        for(int i=0; i<50; i++){
            instance.push(new Complex(Math.random()*i, Math.random()*i));
        }
        instance.push(new Complex(-478.884, 891.65));
        fail("Eccezione non lanciata come previsto");}
        catch(StackFullException ex){
        }
    }

    /**
     * Test del metodo push della classe StackFinito.
     * Verifica che la dimensione dello stack aumenti dopo la push.
     * Classe d'equivalenza testata: Inserimento di un elemento con parte reale e immaginaria specifici.
     */
    @Test
    public void testPush_size() {
        System.out.println("push");
        StackFinito instance = new StackFinito();
        int expResult=instance.getSize()+1;
        Complex number = new Complex(63.09,-76.17);
        instance.push(number);
        int result=instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo pop della classe StackFinito.
     * Verifica che l'elemento inserito sia uguale a quello prelevato dalla pop in caso di stack vuoto.
     * Classe d'equivalenza testata: Nessun elemento nello stack.
     */
    @Test
    public void testPop_emptyStack() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        try{
            Complex result = instance.pop();
            fail("L'eccezione è stata chiamata come previsto");
        }
        catch(StackUnderflowException ex){
        }
    }

    /**
     * Test del metodo pop della classe StackFinito.
     * Verifica che l'elemento inserito sia uguale a quello prelevato dalla pop in caso di stack con un elemento.
     * Classe d'equivalenza testata: Un elemento nello stack con parte reale e immaginaria specifici.
     */
    @Test
    public void testPop_elem() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(254.034, -188.2095));
        Complex expResult = instance.viewElement(instance.getSize()-1);
        Complex result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo pop della classe StackFinito.
     * Verifica che l'elemento inserito sia uguale a quello prelevato dalla pop in caso di stack con più elementi.
     * Classe d'equivalenza testata: Più elementi nello stack con parti reali e immaginarie specifiche.
     */
    @Test
    public void testPop_elems() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(-738, -233.6983));
        instance.push(new Complex(524.3692, 1002.24));
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

    /**
     * Test del metodo pop della classe StackFinito.
     * Verifica che la dimensione dello stack diminuisca dopo la pop.
     * Classe d'equivalenza testata: Rimozione di un elemento dallo stack.
     */
    @Test
    public void testPop_size() {
        System.out.println("pop");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(23.79,-59.83));
        Complex number = instance.pop();
        int expResult=0;
        int result=instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo getSize della classe StackFinito.
     * Verifica che getSize restituisca la dimensione effettiva dello stack dopo una push.
     * Classe d'equivalenza testata: Inserimento di tre elementi nello stack.
     */
    @Test
    public void testGetSize_push() {
        System.out.println("getSize");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(-22.1056, -34.2));
        instance.push(new Complex(-57, 24));
        instance.push(new Complex(89, 93.480));
        int expResult = 3;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo getSize della classe StackFinito.
     * Verifica che getSize restituisca la dimensione effettiva dello stack dopo una push e una pop.
     * Classe d'equivalenza testata: Inserimento di tre elementi e rimozione di uno.
     */
    @Test
    public void testGetSize_pushAndPop() {
        System.out.println("getSize");
        StackFinito instance = new StackFinito();
        instance.push(new Complex(-33.467, -64.23));
        instance.push(new Complex(-85.33, 26));
        instance.push(new Complex(77, 32.47));


     Complex number=instance.pop();
        int expResult = 2;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo getSize della classe StackFinito.
     * Verifica che getSize restituisca 0 essendo lo stack vuoto.
     * Classe d'equivalenza testata: Stack vuoto.
     */
    @Test
    public void testGetSize_emptyStack() {
        System.out.println("getSize");
        StackFinito instance = new StackFinito();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo getMaxSize della classe StackFinito.
     * Verifica che getMaxSize prelevi correttamente l'attributo privato maxSize.
     * Classe d'equivalenza testata: Nessuna inserzione o rimozione di elementi.
     */
    @Test
    public void testGetMaxSize() {
        System.out.println("getMaxSize");
        StackFinito instance = new StackFinito();
        int expResult = 50;
        int result = instance.getMaxSize();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo viewElement della classe StackFinito.
     * Verifica che viewElement restituisca correttamente un elemento presente nello stack con un solo elemento.
     * Classe d'equivalenza testata: Stack con un solo elemento.
     */
    @Test
    public void testViewElement_elem() {
        System.out.println("viewElement");
        StackFinito instance = new StackFinito();
        Complex expResult = new Complex(3069.55, -2674.083);
        instance.push(expResult);
        Complex result = instance.viewElement(instance.getSize()-1);
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo viewElement della classe StackFinito.
     * Verifica che viewElement restituisca correttamente un elemento presente nello stack con più elementi.
     * Classe d'equivalenza testata: Stack con più elementi.
     */
    @Test
    public void testViewElement_elems() {
        System.out.println("viewElement");
        StackFinito instance = new StackFinito();
        Complex c1=new Complex(-1874.39, -5036.3398);
        Complex expResult = new Complex(-2679, 9452.3390);
        Complex c2=new Complex(-5206.45, 36);
        instance.push(c1);
        instance.push(expResult);
        instance.push(c2);
        Complex result = instance.viewElement(instance.getSize()-2);
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo stampaDodiceElementi della classe StackFinito.
     * Verifica che stampaDodiceElementi restituisca una stringa vuota per uno stack vuoto.
     * Classe d'equivalenza testata: Stack vuoto.
     */
    
    
    @Test
    public void testStampaDodiceElementi_stackEmpty() {
        System.out.println("stampaDodiceElementi");
        StackFinito instance = new StackFinito();
        String result = instance.stampaDodiceElementi();
        String expResult = "";
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test del metodo stampaDodiceElementi della classe StackFinito.
     * Verifica che stampaDodiceElementi restituisca una stringa con gli unici dodici elementi presenti nello stack.
     * Classe d'equivalenza testata: StackFinito.
     */
    
    @Test
    public void testStampaDodiceElementi_twelveElements() {
        System.out.println("stampaDodiceElementi");
        StackFinito instance = new StackFinito();
        for(int i=0; i<12; i++){
            instance.push(new Complex(Math.random()*i, -Math.random()*i));
        }
        String result = instance.stampaDodiceElementi();
        String expResult = "";
        for(int i=0; i<12; i++){
            expResult+=instance.pop();
        }
        assertEquals(expResult, result);    
    }
    
    /**
     * Test del metodo stampaDodiceElementi della classe StackFinito.
     * Verifica che stampaDodiceElementi restituisca una stringa con i primi dodici elementi presenti in cima allo stack.
     * Classe d'equivalenza testata: StackFinito.
     */
    
    @Test
    public void testStampaDodiceElementi_moreThanTwelveElements() {
        System.out.println("stampaDodiceElementi");
        StackFinito instance = new StackFinito();
        for(int i=0; i<16; i++){
            instance.push(new Complex(-Math.random()*i, -Math.random()*i));
        }
        String result = instance.stampaDodiceElementi();
        String expResult = "";
        for(int i=0; i<12; i++){
            expResult+=instance.pop();
        }
        assertEquals(expResult, result);
    }
}
