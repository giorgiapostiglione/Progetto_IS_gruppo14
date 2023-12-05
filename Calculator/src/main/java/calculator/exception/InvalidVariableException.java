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
 * Eccezione personalizzata che rappresenta un tentativo di operare su una variabile inesistente.
 * Viene sollevata quando si tenta di eseguire un'operazione su una variabile che non è stata precedentemente dichiarata.
 */
public class InvalidVariableException extends RuntimeException {

    public InvalidVariableException() {
        super("La variabile non esiste ");
    }
}
