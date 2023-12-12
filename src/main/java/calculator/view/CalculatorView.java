/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Carlo Marna
 */
public class CalculatorView extends VBox {

    public LettersKeyboard letKeyboard;
    public NumbersKeyboard numKeyboard;
    public Label display;
    public TextArea memory;
    public TextArea variableMemory;

    /**
     * Costruttore per la vista della calcolatrice. Inizializza e organizza gli
     * elementi grafici per la calcolatrice.
     */
    public CalculatorView() {
        // Impostazione allineamento e spaziatura per la vista principale
        super();
        this.setAlignment(Pos.CENTER);
        this.setSpacing(5);

        // Creazione degli elementi GUI
        letKeyboard = new LettersKeyboard();
        numKeyboard = new NumbersKeyboard();

        display = new Label();
        display.setText("");
        display.setPadding(new Insets(10));
        display.setStyle("-fx-background-color: white;");
        display.setStyle("-fx-border-color: black;");
        display.setPrefHeight(50);
        display.setPrefWidth(580);
        display.setFont((new Font(25)));

        memory = new TextArea();
        memory.setEditable(false);
        memory.setPrefWidth(150);
        memory.setPrefHeight(320);
        memory.setFont((new Font(20)));

        variableMemory = new TextArea();
        variableMemory.setEditable(false);
        variableMemory.setPrefWidth(150);
        variableMemory.setPrefHeight(320);
        variableMemory.setFont((new Font(20)));

        Label textMemory = new Label();
        textMemory.setText("Memory");
        textMemory.setStyle("-fx-font-weight: bold;");
        Label textVariable = new Label();
        textVariable.setText("Variables");
        textVariable.setStyle("-fx-font-weight: bold;");

        // Aggiunta degli elementi alla vista principale
        this.getChildren().addAll(display);

        HBox body = new HBox();

        VBox bodyL = new VBox();
        VBox tasti = new VBox();
        VBox bodyR = new VBox();

        VBox.setMargin(numKeyboard, new Insets(20, 0, 0, 0));
        bodyL.setAlignment(Pos.CENTER);
        bodyR.setAlignment(Pos.CENTER);

        bodyL.getChildren().addAll(textMemory, memory);
        bodyR.getChildren().addAll(textVariable, variableMemory);
        tasti.getChildren().addAll(numKeyboard, letKeyboard);

        // Impostazione dello spaziamento tra gli elementi nei layout
        body.setSpacing(15);
        tasti.setSpacing(5);

        body.getChildren().addAll(bodyL, tasti, bodyR);
        body.setAlignment(Pos.CENTER);
        this.getChildren().add(body);

    }
}
