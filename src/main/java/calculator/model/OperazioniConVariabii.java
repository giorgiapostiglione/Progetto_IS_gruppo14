/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculator.model;

/**
 *
 * @author Carlo Marna
 */
public interface OperazioniConVariabii {
 /**
 * Somma la variabile identificata dal carattere specificato.
 * @param c Carattere identificativo della variabile.
 */
void sommaVariabile(char c);

/**
 * Calcola la differenza della variabile identificata dal carattere specificato.
 * @param c Carattere identificativo della variabile.
 */
void differenzaVariabile(char c);

/**
 * Duplica il valore della variabile identificata dal carattere specificato.
 * @param c Carattere identificativo della variabile.
 */
void duplicazioneVariabile(char c);

/**
 * Assegna un valore alla variabile identificata dal carattere specificato.
 * @param c Carattere identificativo della variabile.
 */
void assegnaVariabile(char c);

}
