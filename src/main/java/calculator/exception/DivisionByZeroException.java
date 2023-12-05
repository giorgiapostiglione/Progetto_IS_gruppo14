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
 * Eccezione personalizzata che rappresenta un tentativo di divisione per zero.
 * Viene sollevata quando si cerca di eseguire una divisione in cui il dividendo è pari a zero.
 */
public class DivisionByZeroException extends RuntimeException{

    public DivisionByZeroException() {
        super("Attenzione dividendo pari a zero");
    }
 }
