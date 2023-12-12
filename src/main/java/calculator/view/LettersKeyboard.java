/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Carlo Marna
 */
public class LettersKeyboard extends VBox {

    public Button[] letters;
    public final int CHARACTERS = 26;
    public final int COLUMNS = 7;

    /**
     * Costruttore per la tastiera delle lettere. Inizializza e organizza i
     * bottoni della tastiera delle lettere.
     */
    public LettersKeyboard() {
        super();
        // Impostazione allineamento e spaziatura per la tastiera delle lettere
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);

        // Inizializzazione dei bottoni della tastiera delle lettere
        intitButtons();

        // Posizionamento dei bottoni nella tastier
        placeButtons();
    }

    /**
     * Inizializza i bottoni della tastiera delle lettere. Crea e configura i
     * bottoni con le lettere dell'alfabeto.
     */
    private void intitButtons() {
        // Inizializza i bottoni della tastiera delle lettere
        letters = new Button[CHARACTERS];

        // Ciclo per creare e configurare i bottoni con le lettere dell'alfabeto
        for (int i = 0; i < CHARACTERS; i++) {
            letters[i] = new Button();
            letters[i].setText(Character.toString((char) (97 + i))); // Usa il codice ASCII per ottenere le lettere da 'a' a 'z'
            letters[i].setPrefWidth(36);
        }
    }

    /**
     * Posiziona i bottoni della tastiera delle lettere all'interno di un
     * GridPane. Le lettere sono organizzate in un layout a griglia.
     */
    private void placeButtons() {
        // Crea un GridPane per organizzare i bottoni della tastiera
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        // Ciclo per posizionare i bottoni all'interno del GridPane
        for (int i = 0; i < CHARACTERS; i++) {
            // Se siamo all'ultima riga, le lettere devono essere messe di una colonna in avanti
            // in modo tale che l'ultima riga sia centrata
            if (i >= 21 && i <= 25) {
                pane.add(letters[i], (i % COLUMNS) + 1, i / COLUMNS);
            } else {
                pane.add(letters[i], i % COLUMNS, i / COLUMNS);
            }
        }
        // Aggiungi il GridPane contenente i bottoni alla vista corrente
        this.getChildren().add(pane);
    }
}
