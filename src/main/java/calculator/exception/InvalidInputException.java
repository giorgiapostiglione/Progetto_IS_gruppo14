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
 * Eccezione personalizzata che rappresenta un input non valido.
 * Viene sollevata quando viene rilevato un formato di input che non è conforme alle aspettative.
 */
public class InvalidInputException extends RuntimeException {

    public InvalidInputException() {
        super("Input non valido");
    }
}
