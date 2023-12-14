/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package calculator_new;

import calculator.controller.CalculatorController;
import calculator.model.CalculatorModel;
import calculator.view.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Carlo Marna
 */
/**
 * Classe principale che avvia l'applicazione della calcolatrice.
 */
public class Calculator_New extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creazione dell'interfaccia utente (View), del modello e del controller
        CalculatorView root = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model, root);
        Scene scene = new Scene(root, 650, 450);

        // Creazione della scena e impostazione dello stage
        primaryStage.setTitle("CALCOLATRICE POLACCA");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Avvio dell'applicazione
        launch(args);
    }
}
