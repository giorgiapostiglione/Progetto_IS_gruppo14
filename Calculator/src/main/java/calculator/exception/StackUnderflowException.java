/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package calculator.exception;

/**
 *
 * @author Carlo Marna
 */
/**
 * Eccezione personalizzata che rappresenta un tentativo di rimuovere un elemento da uno stack vuoto.
 * Viene sollevata quando si tenta di estrarre un elemento da uno stack che non contiene alcun elemento.
 */
public class StackUnderflowException extends RuntimeException{

    public StackUnderflowException() {
        super("Nessun elemento memorizzato");
    }
}
