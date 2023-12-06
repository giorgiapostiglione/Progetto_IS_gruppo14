/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Carlo Marna
 */
public class NumbersKeyboard extends VBox{
    public Button[] numop;

    public final int ELEMENTS = 28;
    public final int COLUMNS = 5;

    /**
     * Costruttore per la tastiera numerica.
     * Inizializza e organizza i bottoni della tastiera numerica.
     */    
    public NumbersKeyboard() { 
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
     * Inizializza i bottoni delle operazioni numeriche.
     * Crea e configura i bottoni con testi e larghezze prefissate.
     * Aggiunge tooltip per fornire informazioni aggiuntive su alcuni bottoni.
     */
    private void intitButtons(){
        // Inizializza i bottoni delle operazioni numeriche
        numop = new Button[ELEMENTS];
        // Ciclo per creare e configurare i bottoni
        for(int i = 0; i < ELEMENTS; i++){
            numop[i] = new Button();
            numop[i].setPrefWidth(50);
        }
        
        // Imposta i testi per i bottoni delle operazioni numeriche
        numop[0].setText("MO");
        numop[1].setText("MS");
        numop[2].setText("MU");
        numop[3].setText("MC");
        numop[4].setText("C");
        numop[5].setText(">x");
        numop[6].setText("MD");
        numop[7].setText("+/-");
        numop[8].setText("√");
        numop[9].setText("÷");
        numop[10].setText("<x");
        numop[11].setText("7");
        numop[12].setText("8");
        numop[13].setText("9");
        numop[14].setText("*");
        numop[15].setText("+x");
        numop[16].setText("4");
        numop[17].setText("5");
        numop[18].setText("6");
        numop[19].setText("-");
        numop[20].setText("-x");
        numop[21].setText("1");
        numop[22].setText("2");
        numop[23].setText("3");
        numop[24].setText("+");
        numop[25].setText(".");
        numop[26].setText("0");
        numop[27].setText("EXE");
        
        // Aggiunge tooltip per fornire informazioni aggiuntive su alcuni bottoni
        Tooltip.install(numop[0], new Tooltip("Over"));
        Tooltip.install(numop[1], new Tooltip("Swap"));
        Tooltip.install(numop[2], new Tooltip("Dup"));
        Tooltip.install(numop[3],  new Tooltip("Clear"));
        Tooltip.install(numop[4], new Tooltip("Clear Display"));
        Tooltip.install(numop[5], new Tooltip("Assegna Variabile"));
        Tooltip.install(numop[6], new Tooltip("Drop"));
        Tooltip.install(numop[10], new Tooltip("Duplica Variabile"));
        Tooltip.install(numop[15], new Tooltip("Somma com variabile"));
        Tooltip.install(numop[20],  new Tooltip("Differenza con variabil"));
    }
    
    /**
     * Posiziona i bottoni delle operazioni numeriche all'interno di un GridPane.
     * Alcuni bottoni vengono posizionati in modo personalizzato, come '0' e 'EXE'.
     */    
    private void placeButtons(){
        // Crea un GridPane per organizzare i bottoni delle operazioni numeriche
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        
        // Ciclo per posizionare i bottoni nella griglia
        for(int i = 0; i < ELEMENTS; i++){
            if (i == 26) {
                 //Se stiamo posizomnando il bottone '0' personalizza larghezza e imposta che prende tre colonne
                numop[i].setPrefWidth(150);
                pane.add(numop[i], i % COLUMNS, i / COLUMNS,3,1);          
            } else if (i == 27) {
                 //Se stiamo posizomnando il bottone 'EXE' personalizza la poszione
                pane.add(numop[i], 4, i / COLUMNS);
            }else {
                 // Altrimenti, posiziona il pulsante normalmente nella griglia
                pane.add(numop[i], i % COLUMNS, i / COLUMNS);
            }
        }
        // Aggiungi il GridPane contenente i bottoni alla vista corrente
        this.getChildren().add(pane); 
    }
}
