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
 * Eccezione personalizzata che rappresenta un tentativo di inserire un elemento in uno stack
 * che ha raggiunto la sua capacità massima.
 * Viene sollevata quando si tenta di aggiungere un elemento a uno stack che è già completamente occupato.
 */
public class StackFullException extends RuntimeException {

    public StackFullException() {
        super("Memoria piena");
    }
}
