/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculator.model;

/**
 *
 * @author Carlo Marna
 */
public interface OperazioniStrutturaDati {
/**
 * Cancella tutti gli elementi dalla struttura dati.
 */
void clear();

/**
 * Scambia la posizione degli ultimi due elementi nella struttura dati.
 */
void swap();

/**
 * Rimuove l'elemento dalla cima della struttura dati.
 */
void drop();

/**
 * Duplica l'elemento dalla cima della struttura dati.
 */
void dup();

/**
 * Copia il'penuelemento elemento e lo aggiunge in cima alla struttura dati.
 */
void over();
}
