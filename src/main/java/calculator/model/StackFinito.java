/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.model;

import calculator.exception.StackFullException;
import calculator.exception.StackUnderflowException;
import java.util.Stack;

/**
 *
 * @author Carlo Marna
 */
public class StackFinito {
    private final Stack <Complex> memoria;
    private final int maxSize;
    
    StackFinito(){
        memoria = new Stack <Complex>();
        maxSize = 50;
    }

    /**
     * Aggiunge un elemento alla cima dello stack.
     * @param element Elemento di tipo Complex da aggiungere allo stack.
     * @throws StackFullException Se lo stack è pieno e non può accettare ulteriori elementi.
     */
    public void push(Complex element) throws StackFullException{
        
        if(memoria.size() < maxSize)
            memoria.add(element);
        else
            throw new StackFullException();
    }
   
    /**
     * Estrae e restituisce l'elemento dalla cima dello stack.
     * @return Elemento di tipo Complex dalla cima dello stack.
     * @throws StackUnderflowException Se lo stack è vuoto.
     */
    public Complex  pop() throws StackUnderflowException{
     if(!memoria.empty())
           return memoria.pop();
        else
            throw new StackUnderflowException();
    }
   
    public int getSize(){
       return memoria.size();
    }

    public int getMaxSize() {
        return maxSize;
    }

    /**
     * Restituisce l'elemento alla posizione specificata nello stack.
     * @param index Indice dell'elemento da visualizzare.
     * @return Elemento di tipo Complex alla posizione specificata nello stack.
     */
    public Complex viewElement(int index)  throws  ArrayIndexOutOfBoundsException
    { 
        return memoria.get(index);
    }
      
    /**
     * Restituisce una stringa contenente la rappresentazione di dodici elementi dello stack.
     * @return Stringa contenente la rappresentazione di dodici elementi dello stack.
     */
    public String stampaDodiceElementi() {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i = memoria.size()-1; i >=0 ; i--){
            if(count<12){
                sb.append(memoria.get(i).toString());
                count++;  
            }
        }
        return  sb.toString() ; 
    }  
}
