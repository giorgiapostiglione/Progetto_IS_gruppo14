/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator.model;

import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidInputException;
import calculator.exception.InvalidVariableException;
import calculator.exception.NotEnoughElementException;
import calculator.exception.StackFullException;
import calculator.exception.StackUnderflowException;
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
    * Classe d'equivalenza: Nessuna classe d'equivalenza specifica.
    * Descrizione del test: Verifica che il metodo getSf restituisca correttamente lo stack finito associato
    * all'istanza di CalculatorModel e che le operazioni su CalculatorModel influenzino l'oggetto StackFinito restituito.
    */
   @Test
   public void testGetSf() {
       System.out.println("getSf");
       CalculatorModel instance = new CalculatorModel();
       Complex c = new Complex(4, 8);

       StackFinito result = instance.getSf();
       assertEquals(0, result.getSize());
       try {
           instance.insertNumber(8, 4);
           assertEquals(c.toString(), result.viewElement(0).toString());
           assertEquals(1, result.getSize());
       } catch (StackFullException ex) {
           fail("Eccezione inaspettata: " + ex.getMessage());
       }
   }

   /**
    * Test del metodo toStringHM della classe CalculatorModel.
    * Classe d'equivalenza: CalculatorModel con variabili assegnate.
    * Descrizione del test: Verifica che il metodo toStringHM restituisca una stringa corretta rappresentante
    * le variabili assegnate in CalculatorModel.
    */
   @Test
   public void testToStringHM() {
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
    * Classe d'equivalenza: Numero positivo.
    * Descrizione del test: Verifica che il metodo insertNumber inserisca correttamente un numero complesso
    * positivo nello stack finito di CalculatorModel.
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
           fail("Eccezione inaspettata: " + ex.getMessage());
       }
   }

   /**
    * Test del metodo insertNumber della classe CalculatorModel con numero negativo.
    * Classe d'equivalenza: Numero negativo.
    * Descrizione del test: Verifica che il metodo insertNumber inserisca correttamente un numero complesso
    * negativo nello stack finito di CalculatorModel.
    */
   @Test
   public void testInsertNumberNegative() {
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
    * Classe d'equivalenza: Numero zero.
    * Descrizione del test: Verifica che il metodo insertNumber inserisca correttamente un numero complesso
    * con parte reale e immaginaria uguali a zero nello stack finito di CalculatorModel.
    */
   @Test
   public void testInsertNumberZero() {
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
    * Classe d'equivalenza: StackFinito pieno.
    * Descrizione del test: Verifica che il lancio di un'eccezione StackFullException
    *  avvenga correttamente quando si tenta di inserire un numero oltre la capacità dello stack.
    */
   @Test
   public void testInsertNumberStackFullException() {
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
    * Test del metodo somma della classe CalculatorModel.
    * Classe d'equivalenza: StackFinito con almeno due elementi.
    * Descrizione del test: Verifica che il metodo somma esegua correttamente la somma
    * tra gli ultimi due elementi dello stack finito di CalculatorModel.
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
           instance.somma();
       } catch (NotEnoughElementException ex) {
           fail("Unexpected exception: " + ex.getMessage());
       }
       assertEquals(sf.viewElement(sf.getSize() - 1).toString(), Complex.add(c1, c2).toString());
   }


    /**
     * Test del metodo sommaException della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito vuoto.
     * Descrizione del test: Verifica che il lancio di un'eccezione NotEnoughElementException
     * avvenga correttamente quando si tenta di eseguire la somma con uno stack vuoto.
     */
    @Test
    public void testSommaException() {
        System.out.println("sommaException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(4, 9);

        sf.push(c1);

        try {
            instance.somma();
            fail("Expected NotEnoughElementException");
        } catch (NotEnoughElementException ex) {
        }
    }

    /**
     * Test del metodo differenza della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con almeno due elementi.
     * Descrizione del test: Verifica che il metodo differenza esegua correttamente la sottrazione
     * tra gli ultimi due elementi dello stack.
     */
    @Test
    public void testDifferenza() {
        System.out.println("differenza");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(4, 9);
        Complex c2 = new Complex(3, 4);
        sf.push(c1);
        sf.push(c2);
        try {
            instance.differenza();
        } catch (NotEnoughElementException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
        assertEquals(sf.viewElement(sf.getSize() - 1).toString(), Complex.sub(c2, c1).toString());
    }

    /**
     * Test del metodo differenzaException della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con meno di due elementi.
     * Descrizione del test: Verifica che il lancio di un'eccezione NotEnoughElementException
     *  avvenga correttamente quando si tenta di eseguire la differenza con meno di due elementi nello stack.
     */
    @Test
    public void testDifferenzaException() {
        System.out.println("DifferenzaException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(4, 9);

        sf.push(c1);

        try {
            instance.differenza();
            fail("Expected NotEnoughElementException");
        } catch (NotEnoughElementException ex) {
        }
    }

    /**
     * Test del metodo prodotto della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con almeno due elementi.
     * Descrizione del test: Verifica che il metodo prodotto esegua correttamente la moltiplicazione
     * tra gli ultimi due elementi dello stack.
     */
    @Test
    public void testProdotto() {
        System.out.println("prodotto");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(11, 3);
        Complex c2 = new Complex(3.2, -7.2);
        sf.push(c1);
        sf.push(c2);
        try {
            instance.prodotto();
        } catch (NotEnoughElementException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
        assertEquals(sf.viewElement(sf.getSize() - 1).toString(), Complex.mul(c2, c1).toString());
    }

    /**
     * Test del metodo prodottoException della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con meno di due elementi.
     * Descrizione del test: Verifica che il lancio di un'eccezione NotEnoughElementException
     * avvenga correttamente quando si tenta di eseguire il prodotto con meno di due elementi nello stack.
     */
    @Test
    public void testProdottoException() {
        System.out.println("ProdottoException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(14, 2);

        sf.push(c1);

        try {
            instance.prodotto();
            fail("Expected NotEnoughElementException");
        } catch (NotEnoughElementException ex) {
        }
    }

    /**
     * Test del metodo rapporto della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con almeno due elementi, non divisore zero.
     * Descrizione del test: Verifica che il metodo rapporto esegua correttamente la divisione
     * tra gli ultimi due elementi dello stack, evitando una DivisionByZeroException.
     */
    @Test
    public void testRapporto() {
        System.out.println("rapporto");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(11, 3);
        Complex c2 = new Complex(2.8, -7.2);
        sf.push(c1);
        sf.push(c2);
        try {
            instance.rapporto();
        } catch (NotEnoughElementException | DivisionByZeroException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
        assertEquals(sf.viewElement(sf.getSize() - 1).toString(), Complex.div(c2, c1).toString());
    }

    /**
     * Test del metodo rapportoUnderflowException della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con meno di due elementi.
     * Descrizione del test: Verifica che il lancio di un'eccezione NotEnoughElementException
     * avvenga correttamente quando si tenta di eseguire il rapporto con meno di due elementi nello stack.
     */
    @Test
    public void testRapportoUnderflowException() {
        System.out.println("RapportoException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(14, 2);

        sf.push(c1);

        try {
            instance.rapporto();
            fail("Expected NotEnoughElementException");
        } catch (NotEnoughElementException ex) {
        }
    }

    /**
     * Test del metodo rapportoDivisionByZeroException della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con almeno due elementi, divisore zero.
     * Descrizione del test: Verifica che il lancio di un'eccezione DivisionByZeroException
     * avvenga correttamente quando si tenta di eseguire il rapporto con un divisore zero.
     */
    @Test
    public void testRapportoDivisionByZeroExceptionExcpetion() {
        System.out.println("rapporto");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(11, 3);
        Complex c2 = new Complex(0, 0);
        sf.push(c1);
        sf.push(c2);
        try {
            instance.rapporto();
            fail("Expected DivisionByZeroExceptionExcpetion");
        } catch (DivisionByZeroException ex) {
        }
    }

    /**
     * Test del metodo radice della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con almeno un elemento e meno di 50 elementi.
     * Descrizione del test: Verifica che il metodo radice esegua correttamente la radice quadrata
     * dell'elemento presente in cima allo stack e lo inserisca nello stack.
     */
    @Test
    public void testRadice() {
        System.out.println("radice");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1 = new Complex(11, 3);

        sf.push(c1);
        assert (sf.getSize() < 50);
        try {
            instance.radice();
        } catch (StackUnderflowException | StackFullException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
        Complex[] c = Complex.sqrt(c1);
        assertEquals(sf.viewElement(sf.getSize() - 1).toString(), c[1].toString());
        assertEquals(sf.viewElement(sf.getSize() - 2).toString(), c[0].toString());
    }

    /**
     * Test del metodo radiceStackUnderflowException della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito vuoto.
     * Descrizione del test: Verifica che il lancio di un'eccezione NotEnoughElementException
     *  avvenga correttamente quando si tenta di eseguire la radice con uno stack vuoto.
     */
    @Test
    public void testRadiceStackUnderflowException() {
        System.out.println("RadiceStackUnderflowException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        assert (sf.getSize() == 0);

        try {
            instance.radice();
            fail("Expected NotEnoughElementException");
        } catch (StackUnderflowException ex) {
        }
    }

    /**
     * Test del metodo radiceStackFullException della classe CalculatorModel.
     * Classe d'equivalenza: StackFinito con 50 elementi.
     * Descrizione del test: Verifica che il lancio di un'eccezione StackFullException
     * avvenga correttamente quando si tenta di eseguire la radice con uno stack pieno.
     */
    @Test
    public void testRadiceStackFullException() {
        System.out.println("RadiceStackFullException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        for (int i = 0; i < 50; i++) {
            instance.insertNumber(i * 1.3, i * -12.41);
        }
        assert (sf.getSize() == 50);

        try {
            instance.radice();
            fail("Expected StackFullException");
        } catch (StackFullException ex) {
        }
    }

    /**
     * Test del metodo cambioSegno, della classe CalculatorModel.
     * Classe d'equivalenza: Uno stack con almeno un numero complesso.
     * Descrizione del test: Si inserisce un numero complesso nello stack,
     * si chiama il metodo cambioSegno e si verifica che il numero complesso nello stack sia cambiato di segno.
     */
    @Test
    public void testCambioSegno() {
        System.out.println("cambioSegno");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1;
        
        c1 = new Complex(11, 3);
        sf.push(c1);
       try{
        instance.cambioSegno();
       }catch(StackUnderflowException ex){
           fail("Eccezione non prevista: " + ex.getMessage());
       }
         assertEquals(sf.viewElement(sf.getSize() - 1).toString(), Complex.change(c1).toString());
    }

    /**
     * Test del metodo cambioSegno, della classe CalculatorModel, con gestione dell'eccezione StackUnderflowException.
     * Classe d'equivalenza: Uno stack vuoto.
     * Descrizione del test: Si verifica che il metodo cambioSegno sollevi correttamente un'eccezione di tipo StackUnderflowException
     * quando chiamato su uno stack vuoto.
     */
    @Test
    public void testCambioSegnoException() {
        System.out.println("CambioSegnoException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        
        assert(sf.getSize()==0);
        
        try {
            // Metodo testato con 0 complessi nello stack
            instance.cambioSegno();
            // Fail se l'eccezione attesa non viene lanciata
            fail("Prevista eccezione NotEnoughElementException");
        } catch (StackUnderflowException ex) {
            // Se l'eccezione attesa viene lanciata, il test è corretto
        }
        
    
    }

    /**
     * Test del metodo clear, della classe CalculatorModel.
     * Classe d'equivalenza: Uno stack con almeno un numero complesso.
     * Descrizione del test: Si inseriscono 50 numeri complessi nello stack,
     * si chiama il metodo clear e si verifica che lo stack sia vuoto dopo la chiamata al metodo.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        for (int i = 0; i < 50; i++) {
                instance.insertNumber(i * 1.3, i * -12.41);
            }
        instance.clear();
        assert(sf.getSize()==0);
        try{
            sf.pop();
            fail("Prevista eccezione StackUnderflowException");
        }catch(StackUnderflowException ex){
            
        }
    }

    /**
     * Test del metodo swap, della classe CalculatorModel.
     * Classe d'equivalenza: Uno stack con almeno due numeri complessi.
     * Descrizione del test: Si inseriscono due numeri complessi nello stack,
     * si chiama il metodo swap e si verifica che i due numeri nello stack siano stati scambiati.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
         Complex c1,c2;
         c1= new Complex(-2,4);
         c2= new Complex(12, 8);
         assert(sf.getSize()<48);
         sf.push(c1);
         sf.push(c2);
         try{
        instance.swap();
         }catch(NotEnoughElementException ex){
             fail("Eccezione non prevista: " + ex.getMessage());
         }
         assertEquals(sf.viewElement(sf.getSize()-1).toString(),c1.toString());
       assertEquals(sf.viewElement(sf.getSize()-2).toString(),c2.toString());
    }
    
    /**
     * Test del metodo swap, della classe CalculatorModel, con gestione dell'eccezione NotEnoughElementException.
     * Classe d'equivalenza: Uno stack con meno di due numeri complessi.
     * Descrizione del test: Si verifica che il metodo swap sollevi correttamente un'eccezione di tipo NotEnoughElementException
     * quando chiamato su uno stack con meno di due numeri complessi.
     */
    @Test
    public void testSwapException() {
        System.out.println("swap");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
         Complex c1;
         c1= new Complex(-2,4);
         assert(sf.getSize()==0);
         sf.push(c1);
         
         try{
        instance.swap();
         fail("Prevista eccezione NotEnoughElementException");
         }catch(NotEnoughElementException ex){
            
         }
         
    }
    /**
     * Test del metodo drop, della classe CalculatorModel.
     * Classe d'equivalenza: Uno stack con almeno un numero complesso.
     * Descrizione del test: Si inseriscono due numeri complessi nello stack, 
     * si chiama il metodo drop e si verifica che il secondo numero complesso nello stack è stato eliminato.
     */
    @Test
    public void testDrop() {
        System.out.println("drop");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
         Complex c1,c2;
         c1= new Complex(-2,4);
         c2= new Complex(12, 8);
         assert(sf.getSize()<48);
         sf.push(c1);
         sf.push(c2);
         try{
        instance.drop();
         }catch(NotEnoughElementException ex){
             fail("Eccezione non prevista: " + ex.getMessage());
         }
          assertEquals(sf.viewElement(sf.getSize()-1).toString(),c1.toString());
    }

    /**
     * Test del metodo drop, della classe CalculatorModel, con gestione dell'eccezione NotEnoughElementException.
     * Classe d'equivalenza: Uno stack vuoto.
     * Descrizione del test: Si verifica che il metodo drop sollevi correttamente un'eccezione di tipo NotEnoughElementException 
     * quando chiamato su uno stack vuoto.
     */
    @Test
    public void testDropException() {
        System.out.println("DropException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        
        instance.clear();
        assert(sf.getSize()==0);
        try{
            instance.drop();
            fail("Prevista eccezione StackUnderflowException");
        }catch(StackUnderflowException ex){
            
        }
    }
    /**
     * Test del metodo dup, della classe CalculatorModel.
     * Classe d'equivalenza: Uno stack con almeno un numero complesso.
     * Descrizione del test: Si inserisce un numero complesso nello stack,
     * si chiama il metodo dup e si verifica che il numero complesso nello stack sia duplicato.
     */
    @Test
    public void testDup() {
        System.out.println("dup");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1=new Complex(3,4);
        assert(sf.getSize()<sf.getMaxSize());
        sf.push(c1);
        try{
        instance.dup();
        }catch(StackUnderflowException ex){
            fail("Eccezione non prevista: " + ex.getMessage());
        }catch(StackFullException ex){
            fail("Eccezione non prevista: " + ex.getMessage());
        }
        assertEquals(sf.viewElement(sf.getSize()-1).toString(),sf.viewElement(sf.getSize()-2).toString());
    }

    /**
     * Test del metodo dup, della classe CalculatorModel, con gestione dell'eccezione StackUnderflowException.
     * Classe d'equivalenza: Uno stack vuoto.
     * Descrizione del test: Si verifica che il metodo dup sollevi correttamente un'eccezione di tipo StackUnderflowException 
     * quando chiamato su uno stack vuoto.
     */
    @Test
    public void testDupStackUnderflowException() {
        System.out.println("DupStackUnderflowException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        
        assert(sf.getSize()==0);
        
        try {
            // Metodo testato con 0 complessi nello stack
            instance.dup();
            // Fail se l'eccezione attesa non viene lanciata
            fail("Prevista eccezione StackUnderflowException");
        } catch (StackUnderflowException ex) {
            // Se l'eccezione attesa viene lanciata, il test è corretto
        }
        
    
    }
    
    /**
     * Test del metodo dup, della classe CalculatorModel, con gestione dell'eccezione StackFullException.
     * Classe d'equivalenza: Uno stack con al massimo un numero complesso disponibile prima del test.
     * Descrizione del test: Si riempie lo stack al massimo della sua capacità, 
     * si chiama il metodo dup e si verifica che il metodo sollevi correttamente un'eccezione di tipo StackFullException.
     */
    @Test
    public void testDupStackFullException() {
        System.out.println("DupStackFullException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        for (int i = 0; i < 50; i++) {
                instance.insertNumber(i * 1.3, i * -12.41);
            }
        assert(sf.getSize()==50);
        
        try {
            // Metodo testato con 50 complessi nello stack
            instance.dup();
            // Fail se l'eccezione attesa non viene lanciata
            fail("Prevista eccezione StackFullException");
        } catch (StackFullException ex) {
            // Se l'eccezione attesa viene lanciata, il test è corretto
        }
        
    
    }
    /**
     * Test del metodo over, della classe CalculatorModel.
     * Classe d'equivalenza: Uno stack con almeno due numeri complessi.
     * Descrizione del test: Si inseriscono due numeri complessi nello stack, 
     * si chiama il metodo over e si verifica che il secondo numero complesso nello stack è duplicato e posto in cima allo stack.
     */
    @Test
    public void testOver() {
       System.out.println("over");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Complex c1=new Complex(3,4);
        Complex c2=new Complex(1,10);
        assert(sf.getSize()+2<sf.getMaxSize());
        sf.push(c1);
        sf.push(c2);
        try{
        instance.over();
        }catch(NotEnoughElementException ex){
            fail("Eccezione non prevista: " + ex.getMessage());
        }catch(StackFullException ex){
            fail("Eccezione non prevista: " + ex.getMessage());
        }
        assertEquals(sf.viewElement(sf.getSize()-1).toString(),sf.viewElement(sf.getSize()-3).toString());
    }
    
    /**
     * Test del metodo over, della classe CalculatorModel, con gestione dell'eccezione NotEnoughElementException.
     * Classe d'equivalenza: Uno stack con meno di due numeri complessi.
     * Descrizione del test: Si verifica che il metodo over sollevi correttamente 
     * un'eccezione di tipo NotEnoughElementException quando chiamato su uno stack con meno di due numeri complessi.
     */
    @Test
    public void testOverNotEnoughElementException() {
        System.out.println("OverNotEnoughElementException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        
        assert(sf.getSize()<2);
        
        try {
            // Metodo testato con 0 complessi nello stack
            instance.over();
            // Fail se l'eccezione attesa non viene lanciata
            fail("Prevista eccezione NotEnoughElementException");
        } catch (NotEnoughElementException ex) {
            // Se l'eccezione attesa viene lanciata, il test è corretto
        }
        
    
    }
    
    /**
     * Test del metodo over, della classe CalculatorModel, con gestione dell'eccezione StackFullException.
     * Classe d'equivalenza: Uno stack con al massimo un numero complesso disponibile prima del test.
     * Descrizione del test: Si riempie lo stack al massimo della sua capacità, 
     * si chiama il metodo over e si verifica che il metodo sollevi correttamente un'eccezione di tipo StackFullException.
     */
    @Test
    public void testOverStackFullException() {
        System.out.println("OverStackFullException");
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        for (int i = 0; i < 50; i++) {
                instance.insertNumber(i * 1.3, i * -12.41);
            }
        assert(sf.getSize()==sf.getMaxSize());
        
        try {
            // Metodo testato con 50 complessi nello stack
            instance.dup();
            // Fail se l'eccezione attesa non viene lanciata
            fail("Prevista eccezione StackFullException");
        } catch (StackFullException ex) {
            // Se l'eccezione attesa viene lanciata, il test è corretto
        }
        
    
    }
    /**
     * Test del metodo sommaVariabile, della classe CalculatorModel.
     * Classe d'equivalenza: Variabili correttamente assegnate e stack non vuoto.
     * Descrizione del test: Si verifica se il metodo sommaVariabile somma correttamente
     * due variabili precedentemente assegnate e aggiunge il risultato alla stack.
     */
    @Test
    public void testSommaVariabile() {
        System.out.println("sommaVariabile");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Map var = instance.getMap();

        Complex c1 = new Complex(-3, 8);
        Complex c2 = new Complex(1, 7);

        assert(sf.getSize() + 1 < sf.getMaxSize());
        sf.push(c1);
        sf.push(c2);

        assert(sf.getSize() > 0);
        instance.assegnaVariabile(c);

        try {
            instance.sommaVariabile(c);
        } catch (StackUnderflowException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        } catch (InvalidInputException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }

        assertEquals(var.get(c).toString(), Complex.add(c1, c2).toString());
    }

    /**
     * Test del metodo sommaVariabile, della classe CalculatorModel, con StackUnderflowException.
     * Classe d'equivalenza: Stack vuoto.
     * Descrizione del test: Si verifica se il metodo gestisce correttamente l'eccezione
     * StackUnderflowException quando la stack è vuota.
     */
    @Test
    public void testSommaVariabileStackUnderflowException() {
        System.out.println("SommaVariabileStackUnderflowException");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        Complex c1 = new Complex(-3, 8);

        assert(sf.getSize() < sf.getMaxSize());
        sf.push(c1);

        assert(sf.getSize() > 0);
        instance.assegnaVariabile(c);

        try {
            instance.sommaVariabile(c);
            fail("Expected StackUnderflowException");
        } catch (StackUnderflowException ex) {

        }
    }

    /**
     * Test del metodo sommaVariabile, della classe CalculatorModel, con InvalidVariableException.
     * Classe d'equivalenza: Variabile non assegnata.
     * Descrizione del test: Si verifica se il metodo gestisce correttamente l'eccezione
     * InvalidVariableException quando si cerca di sommare una variabile non assegnata.
     */
    @Test
    public void testSommaVariabileInvalidVariableException() {
        System.out.println("testSommaVariabileInvalidVariableException");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        Complex c1 = new Complex(-3, 8);
        Complex c2 = new Complex(1, 7);

        assert(sf.getSize() + 1 < sf.getMaxSize());
        sf.push(c1);
        sf.push(c2);

        try {
            instance.sommaVariabile(c);
            fail("Expected InvalidVariableException");
        } catch (InvalidVariableException ex) {

        }
    }



    /**
     * Test del metodo differenzaVariabile, della classe CalculatorModel.
     * Classe d'equivalenza: Variabili correttamente assegnate e stack non vuoto.
     * Descrizione del test: Si verifica se il metodo differenzaVariabile calcola correttamente
     * la differenza tra due variabili precedentemente assegnate e aggiunge il risultato alla stack.
     */
    @Test
    public void testDifferenzaVariabile() {
        System.out.println("testDifferenzaVariabile");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Map var = instance.getMap();

        Complex c1 = new Complex(15, -8);
        Complex c2 = new Complex(1, 7);

        assert(sf.getSize() + 1 < sf.getMaxSize());
        sf.push(c1);
        sf.push(c2);

        assert(sf.getSize() > 0);
        instance.assegnaVariabile(c);

        try {
            instance.differenzaVariabile(c);
        } catch (StackUnderflowException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        } catch (InvalidInputException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }

        assertEquals(var.get(c).toString(), Complex.sub(c1, c2).toString());
    }

    /**
     * Test del metodo differenzaVariabile, della classe CalculatorModel, con StackUnderflowException.
     * Classe d'equivalenza: Stack vuoto.
     * Descrizione del test: Si verifica se il metodo gestisce correttamente l'eccezione
     * StackUnderflowException quando la stack è vuota.
     */
    @Test
    public void testDifferenzaVariabileStackUnderflowException() {
        System.out.println("testDifferenzaVariabileStackUnderflowException");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        Complex c1 = new Complex(-3, 8);

        assert(sf.getSize() < sf.getMaxSize());
        sf.push(c1);

        assert(sf.getSize() > 0);
        instance.assegnaVariabile(c);

        try {
            instance.differenzaVariabile(c);
            fail("Expected StackUnderflowException");
        } catch (StackUnderflowException ex) {

        }
    }

    /**
     * Test del metodo differenzaVariabile, della classe CalculatorModel, con InvalidVariableException.
     * Classe d'equivalenza: Variabile non assegnata.
     * Descrizione del test: Si verifica se il metodo gestisce correttamente l'eccezione
     * InvalidVariableException quando si cerca di calcolare la differenza di una variabile non assegnata.
     */
    @Test
    public void testDifferenzaVariabileInvalidVariableException() {
        System.out.println("testDifferenzaVariabileInvalidVariableException");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        Complex c1 = new Complex(-3, 8);
        Complex c2 = new Complex(1, 7);

        assert(sf.getSize() + 1 < sf.getMaxSize());
        sf.push(c1);
        sf.push(c2);

        try {
            instance.differenzaVariabile(c);
            fail("Expected InvalidVariableException");
        } catch (InvalidVariableException ex) {

        }
    }

    /**
     * Test del metodo duplicazioneVariabile, della classe CalculatorModel.
     * Classe d'equivalenza: Variabile correttamente assegnata e stack non vuoto.
     * Descrizione del test: Si verifica se il metodo duplicazioneVariabile duplica correttamente
     * il valore di una variabile precedentemente assegnata e aggiunge il risultato alla stack.
     */
    @Test
    public void testDuplicazioneVariabile() {
        System.out.println("testDuplicazioneVariabile");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();
        Map var = instance.getMap();

        Complex c1 = new Complex(15, -8);

        assert(sf.getSize() < sf.getMaxSize());
        sf.push(c1);

        assert(sf.getSize() > 0);
        instance.assegnaVariabile(c);

        try {
            instance.duplicazioneVariabile(c);
        } catch (StackFullException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        } catch (InvalidInputException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }

        assertEquals(var.get(c).toString(), sf.viewElement(sf.getSize() - 1).toString());
    }

    /**
     * Test del metodo duplicazioneVariabile, della classe CalculatorModel, con StackFullException.
     * Classe d'equivalenza: Stack pieno.
     * Descrizione del test: Si verifica se il metodo gestisce correttamente l'eccezione
     * StackFullException quando la stack è piena.
     */
    @Test
    public void testDuplicazioneVariabileStackFullException() {
          System.out.println("testDuplicazioneVariabileStackFullException");
        char c = 'a';
       
        CalculatorModel instance = new CalculatorModel();
        StackFinito sf=instance.getSf();
        
        
        Complex c1=new Complex(-3, 8);
        assert(sf.getSize()<sf.getMaxSize());
        sf.push(c1);
        assert(sf.getSize()>0);
        instance.assegnaVariabile(c);
        assert(sf.getSize()==0);
        for (int i = 0; i < 50; i++) {
                instance.insertNumber(i * -2, i * 6.41);
            }

        try {
            instance.duplicazioneVariabile(c);
            fail("Expected StackFullException");
        } catch (StackFullException ex) {

        }
    }

    /**
     * Test del metodo duplicazioneVariabile, della classe CalculatorModel, con InvalidVariableException.
     * Classe d'equivalenza: Variabile non assegnata.
     * Descrizione del test: Si verifica se il metodo gestisce correttamente l'eccezione
     * InvalidVariableException quando si cerca di duplicare una variabile non assegnata.
     */
    @Test
    public void testDuplicazioneVariabileInvalidVariableException() {
        System.out.println("testDuplicazioneVariabileInvalidVariableException");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        assert(sf.getSize() < sf.getMaxSize());

        try {
            instance.duplicazioneVariabile(c);
            fail("Expected InvalidVariableException");
        } catch (InvalidVariableException ex) {

        }
    }

    /**
     * Test del metodo assegnaVariabile, della classe CalculatorModel.
     * Classe d'equivalenza: Stack non vuoto.
     * Descrizione del test: Si verifica se il metodo assegnaVariabile assegna correttamente
     * il valore dalla cima della stack a una variabile.
     */
    @Test
    public void testAssegnaVaribile() {
        System.out.println("testAssegnaVaribile");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        Complex c1 = new Complex(-3, 8);

        assert(sf.getSize() < sf.getMaxSize());
        sf.push(c1);

        Map var = instance.getMap();
        try {
            instance.assegnaVariabile(c);
        } catch (StackUnderflowException ex) {
            fail("Unexpected exception: " + ex.getMessage());
        }
        assertEquals(var.get(c).toString(), c1.toString());
    }

    /**
     * Test del metodo assegnaVariabile, della classe CalculatorModel, con StackUnderflowException.
     * Classe d'equivalenza: Stack vuoto.
     * Descrizione del test: Si verifica se il metodo gestisce correttamente l'eccezione
     * StackUnderflowException quando la stack è vuota.
     */
    @Test
    public void testAssegnaVaribileException() {
        System.out.println("testAssegnaVaribileException");
        char c = 'a';

        CalculatorModel instance = new CalculatorModel();
        StackFinito sf = instance.getSf();

        assert(sf.getSize() == 0);

        try {
            instance.assegnaVariabile(c);
            fail("Expected exception: ");
        } catch (StackUnderflowException ex) {

        }
    }
       
}
