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
 * Eccezione personalizzata che rappresenta un tentativo di eseguire un'operazione
 * che richiede un numero insufficiente di elementi nello stack.
 * Viene sollevata quando si tenta di eseguire un'operazione senza avere abbastanza elementi nello stack.
 */
public class NotEnoughElementException extends RuntimeException{

    public NotEnoughElementException() {
        super("Elementi insufficienti");
    }
}
