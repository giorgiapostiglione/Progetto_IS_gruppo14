/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.model;

import calculator.exception.*;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Carlo Marna
 */
public class CalculatorModel implements OperazioniAritmetiche, OperazioniConVariabii, OperazioniStrutturaDati {

    private final StackFinito sf;
    private final  Map <Character,Complex> variabili;

    /**
     * Costruttore della classe CalculatorModel.
     * Inizializza uno stack finito (sf) e una mappa per le variabili (variabili).
     */    
    public CalculatorModel() {
        sf = new StackFinito();
        variabili = new HashMap <>();
    }
    
    public StackFinito getSf(){
        return sf;
    }

    /**
     * Restituisce una rappresentazione in formato stringa delle variabili e dei loro valori complessi.
     * La rappresentazione è nel formato "variabile1=valore1, variabile2=valore2, ...".
     * @return Una stringa che rappresenta le variabili e i loro valori complessi.
     */
    public String toStringHM(){
        StringBuffer sb = new StringBuffer();
        
        // Itera attraverso le variabili e i loro valori complessi
        for(Map.Entry<Character, Complex> element : variabili.entrySet()){
            // Costruisce una stringa nel formato "variabile=valore"
            String s = element.getKey()+"="+element.getValue().toString();
            // Aggiunge la stringa al buffer
            sb.append(s);
         }
        // Restituisce la rappresentazione in formato stringa delle variabili e dei loro valori complessi
        return sb.toString();
    }
    
    /**
     * Inserisce un nuovo numero complesso nello stack.
     * @param re La parte reale del numero complesso.
     * @param im La parte immaginaria del numero complesso.
     * @throws StackFullException Se lo stack è pieno e non può accettare nuovi elementi.
     */
    public void  insertNumber(double im, double re) throws StackFullException{
        sf.push(new Complex(re,im));
    }
    
    /**
     * Esegue un'operazione di somma su due numeri complessi nello stack.
     * Lancia un'eccezione NotEnoughElementException se non ci sono abbastanza elementi nello stack.
     * @throws NotEnoughElementException Se non ci sono abbastanza elementi nello stack per eseguire l'operazione.
     */
    @Override
    public void somma() throws NotEnoughElementException{
        if(sf.getSize()<2)
            throw new NotEnoughElementException();
       sf.push(Complex.add(sf.pop(),sf.pop()));  
    }

    /**
     * Esegue un'operazione di differenza su due numeri complessi nello stack.
     * Lancia un'eccezione NotEnoughElementException se non ci sono abbastanza elementi nello stack.
     * @throws NotEnoughElementException Se non ci sono abbastanza elementi nello stack per eseguire l'operazione.
     */
    @Override
    public void differenza() throws NotEnoughElementException{
        if(sf.getSize()<2)
            throw new NotEnoughElementException();
        sf.push(Complex.sub(sf.pop(),sf.pop()));
    }

    /**
     * Esegue un'operazione di moltiplicazione su due numeri complessi nello stack.
     * Lancia un'eccezione NotEnoughElementException se non ci sono abbastanza elementi nello stack.
     * @throws NotEnoughElementException Se non ci sono abbastanza elementi nello stack per eseguire l'operazione.
     */
    @Override
    public void prodotto() throws NotEnoughElementException{
         if(sf.getSize()<2)
            throw new NotEnoughElementException();
        sf.push(Complex.mul(sf.pop(),sf.pop()));
    }
    
    /**
     * Esegue un'operazione di divisione su due numeri complessi nello stack.
     * Lancia un'eccezione NotEnoughElementException se non ci sono abbastanza elementi nello stack.
     * Lancia un'eccezione DivisionByZeroException se il denominatore è zero.
     * @throws NotEnoughElementException Se non ci sono abbastanza elementi nello stack per eseguire l'operazione.
     * @throws DivisionByZeroException Se il denominatore è zero.
     */
    @Override
    public void rapporto() throws NotEnoughElementException, DivisionByZeroException{
         if(sf.getSize()<2)
            throw new NotEnoughElementException();
         // Verifica se il denominatore è zero
         if (sf.viewElement(sf.getSize()-1).getIm()==0 && sf.viewElement(sf.getSize()-1).getRe()==0)   
            throw new DivisionByZeroException();
         
        sf.push(Complex.div(sf.pop(),sf.pop()));    
    }

    /**
     * Esegue un'operazione di calcolo della radice quadrata su un numero complesso nello stack.
     * Lancia un'eccezione StackUnderflowException se lo stack è vuoto.
     * @throws StackUnderflowException Se lo stack è vuoto.
     */
    @Override
    public void radice() throws StackUnderflowException{
       if(sf.getSize()==0)
            throw new StackUnderflowException();
        sf.push(Complex.sqrt(sf.pop()));
    }

    /**
     * Esegue un'operazione di cambio di segno su un numero complesso nello stack.
     * Lancia un'eccezione StackUnderflowException se lo stack è vuoto.
     * @throws StackUnderflowException Se lo stack è vuoto.
     */
    @Override
    public void cambioSegno() throws StackUnderflowException{
        if(sf.getSize()==0)
            throw new StackUnderflowException();
        sf.push(Complex.change(sf.pop()));
    }

    /**
     * Cancella tutti gli elementi presenti nello stack.
     */
    @Override
    public void clear() {
        int dim = sf.getSize();
        for(int i = 0; i < dim; i++){
            sf.pop();
        }
    }

    /**
     * Scambia gli ultimi due elementi nello stack.
     * Lancia un'eccezione NotEnoughElementException se non ci sono abbastanza elementi nello stack.
     * @throws NotEnoughElementException Se non ci sono abbastanza elementi nello stack per eseguire l'operazione.
     */
    @Override
    public void swap() throws NotEnoughElementException{
      if(sf.getSize()<2)
            throw new NotEnoughElementException();
      Complex a = sf.pop();
      Complex b = sf.pop();
      sf.push(a);
      sf.push(b);
    }

    /**
     * Rimuove l'ultimo elemento presente nello stack.
     * Lancia un'eccezione StackUnderflowException se lo stack è vuoto.
     * @throws StackUnderflowException Se lo stack è vuoto.
     */
    @Override
    public void drop() throws  StackUnderflowException{
        if(sf.getSize()==0)
           throw new StackUnderflowException();
        sf.pop();
    }

    /**
     * Duplica l'ultimo elemento presente nello stack.
     * Lancia un'eccezione StackUnderflowException se lo stack è vuoto.
     * Lancia un'eccezione StackFullException se lo stack è pieno.
     * @throws StackUnderflowException Se lo stack è vuoto.
     * @throws StackFullException Se lo stack è pieno.
     */
    @Override
    public void dup()  throws StackUnderflowException,StackFullException {
        if(sf.getSize()==0)
           throw new StackUnderflowException();
        if (sf.getSize()==sf.getMaxSize())
           throw new StackFullException();
        sf.push(sf.viewElement(sf.getSize()-1));
    }

    /**
     * Sovrapponi l'elemento penultimo con l'ultimo elemento presente nello stack.
     * Lancia un'eccezione NotEnoughElementException se ci sono meno di due elementi nello stack.
     * Lancia un'eccezione StackFullException se lo stack è pieno.
     * @throws NotEnoughElementException Se ci sono meno di due elementi nello stack.
     * @throws StackFullException Se lo stack è pieno.
     */
    @Override
    public void over()  throws NotEnoughElementException, StackFullException {
        if(sf.getSize()<2)
           throw new NotEnoughElementException();
        if (sf.getSize()==sf.getMaxSize())
           throw new StackFullException();
        sf.push(sf.viewElement(sf.getSize()-2));
    }

    /**
     * Esegue un'operazione di somma tra il valore della variabile specificata e il valore presente nello stack,
     * quindi aggiorna il valore della variabile con il risultato.
     * Lancia un'eccezione InvalidVariableException se la variabile specificata non esiste.
     * Lancia un'eccezione StackUnderflowException se lo stack è vuoto.
     * @param c Il carattere rappresentante la variabile.
     * @throws InvalidVariableException Se la variabile specificata non esiste.
     * @throws StackUnderflowException Se lo stack è vuoto.
     */
    @Override
    public void sommaVariabile(char c) throws  InvalidInputException, StackUnderflowException {
        if(!variabili.containsKey(c))
            throw new InvalidVariableException ();
        if(sf.getSize()==0)
           throw new StackUnderflowException();
        variabili.replace(c,Complex.add(sf.pop(), variabili.get(c))); 
    }

    /**
     * Esegue un'operazione di differenza tra il valore della variabile specificata e il valore presente nello stack,
     * quindi aggiorna il valore della variabile con il risultato.
     * Lancia un'eccezione InvalidVariableException se la variabile specificata non esiste.
     * Lancia un'eccezione StackUnderflowException se lo stack è vuoto.
     * @param c Il carattere rappresentante la variabile.
     * @throws InvalidVariableException Se la variabile specificata non esiste.
     * @throws StackUnderflowException Se lo stack è vuoto.
     */
    @Override
    public void differenzaVariabile(char c) throws  InvalidInputException, StackUnderflowException {
        if(!variabili.containsKey(c))
            throw new InvalidVariableException ();
        if(sf.getSize()==0)
           throw new StackUnderflowException();
        variabili.replace(c,Complex.sub(sf.pop(), variabili.get(c)));
    }

    /**
     * Duplica il valore della variabile specificata e lo inserisce nello stack.
     * Lancia un'eccezione InvalidVariableException se la variabile specificata non esiste.
     * Lancia un'eccezione StackFullException se lo stack è pieno.
     * @param c Il carattere rappresentante la variabile.
     * @throws InvalidVariableException Se la variabile specificata non esiste.
     * @throws StackFullException Se lo stack è pieno.
     */
    @Override
    public void duplicazioneVariabile(char c) throws  InvalidInputException,StackFullException {
        if(!variabili.containsKey(c))
            throw new InvalidVariableException ();
        if (sf.getSize()==sf.getMaxSize())
           throw new StackFullException();
        sf.push(variabili.get(c));
    }

    /**
     * Assegna il valore presente nello stack alla variabile specificata.
     * Se la variabile esiste già, ne aggiorna il valore.
     * Se la variabile non esiste, la crea e le assegna il valore presente nello stack.
     * Lancia un'eccezione StackUnderflowException se lo stack è vuoto.
     * @param c Il carattere rappresentante la variabile.
     * @throws StackUnderflowException Se lo stack è vuoto.
     */
    @Override
    public void assegnaVaribile(char c) throws StackUnderflowException{
        if(sf.getSize()==0)
            throw new StackUnderflowException();
        if(variabili.containsKey(c))
            variabili.replace(c, sf.pop());
        else
            variabili.put(c, sf.pop());
    }
    
}
