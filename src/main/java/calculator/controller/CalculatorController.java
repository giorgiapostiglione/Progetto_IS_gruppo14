/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.controller;
import calculator.exception.InvalidInputException;
import calculator.model.*;
import calculator.view.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

/**
 *
 * @author Carlo Marna xxx
 */
public class CalculatorController {
    private final CalculatorModel model;
    private final CalculatorView view;
    
    /**
     * Costruttore della classe CalculatorController.
     * Riceve un modello (CalculatorModel) e una vista (CalculatorView) come argomenti.
     * Inizializza i membri model e view con i rispettivi argomenti e chiama i metodi per inizializzare i pulsanti e le associazioni.
     * @param model Il modello associato al controller.
     * @param view La vista associata al controller.
     */
    
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        // Inizializza il modello e la vista con gli argomenti forniti
        this.model = model;
        this.view = view;
        
        initButtons();
        initBindings();
    }

    /**
     * Inizializza le azioni degli eventi per i pulsanti nella tastiera numerica e nella tastiera delle lettere.
     * Associa le azioni degli eventi ai metodi appropriati del controller.
     */    
    private void initButtons(){
        
        for(int i = 0; i < 5; i++){
            view.numKeyboard.numop[i].setOnAction(e -> buttonPressedAction(e));
        }
        
        view.numKeyboard.numop[5].setOnAction(e -> buttonPressedDisplay(e));
        
         // Associa le azioni degli eventi per il pulsante "MU" nella tastiera numerica
        view.numKeyboard.numop[6].setOnAction(e -> buttonPressedAction(e));
        
        for(int i = 7; i < 27; i++){
            view.numKeyboard.numop[i].setOnAction(e -> buttonPressedDisplay(e));
        }
        
        // Associa le azioni degli eventi per il pulsante "EXE" nella tastiera numerica
        view.numKeyboard.numop[27].setOnAction(e -> buttonPressedAction(e));
        
        // Associa le azioni degli eventi per i pulsanti nella tastiera delle lettere
        for(int i = 0; i < 26 ; i++){
            view.letKeyboard.letters[i].setOnAction(e -> buttonPressedDisplay(e));
        } 
    }

    /**
     * Gestisce l'azione quando un pulsante nella tastiera numerica o delle lettere viene premuto.
     * Aggiunge il testo del pulsante al campo di visualizzazione della calcolatrice.
     * @param e L'evento di azione generato dal pulsante premuto.
     */    
    private void buttonPressedDisplay(ActionEvent e){
        Button b = (Button) e.getSource();
        view.display.setText(view.display.getText()+b.getText());
    }

    /**
     * Gestisce l'azione quando un pulsante di controllo (C, MC, MO, MS, MD, MU, EXE) viene premuto.
     * Modifica lo stato della calcolatrice in base al pulsante premuto.
     * Aggiorna il campo di visualizzazione, disabilita alcuni pulsanti in caso di errore e aggiorna la memoria.
     * @param e L'evento di azione generato dal pulsante premuto.
     */
    
    private void buttonPressedAction(ActionEvent e){
        Button b = (Button) e.getSource();
        try{
            String value = b.getText();
            switch(value){
                case "C":
                     initBindings();
                     break;
                case "MC":
                    model.clear();
                    break;
                case "MO":
                    model.over();
                    break;
                case "MS":
                    model.swap();
                    break;
                case "MD":
                    model.drop();
                    break;
                case "MU":
                    model.dup();
                    break;
                case "EXE":
                    String inputDisplay = view.display.getText();
                    view.display.setText("");
                    // Verifica e processa l'input nel campo di visualizzazione
                    if(!verifyNumericInput(inputDisplay))
                        if(!verifyArithmeticOperation(inputDisplay))
                            if(!verifyVariablesOperation(inputDisplay))
                                throw new InvalidInputException(); 
                                         // Pulisce il campo di visualizzazione e inizializza le associazioni

                    break;
            }
        }catch (RuntimeException ex){
                // Gestisce eventuali eccezioni mostrando il messaggio di errore nel campo di visualizzazione
                view.display.setText(ex.getMessage());
                
                // Disabilita alcuni pulsanti in caso di errore
                for(int i = 0; i < view.numKeyboard.ELEMENTS; i++){
                    if(i!=4)
                        view.numKeyboard.numop[i].disableProperty().bind(Bindings.equal(ex.getMessage(), view.display.textProperty()));
                }
                
                for(int i = 0; i < view.letKeyboard.CHARACTERS; i++){
                        view.letKeyboard.letters[i].disableProperty().bind(Bindings.equal(ex.getMessage(), view.display.textProperty()));   
                 }
            }
            // Aggiorna la memoria nel campo di visualizzazione
            view.memory.setText(model.getSf().stampaDodiceElementi());    
        }

    /**
     * Verifica e processa l'input inserito nella calcolatrice.
     * Se l'input corrisponde a un numero complesso, lo inserisce nello stack della calcolatrice.
     *
     * @param input L'input inserito nella calcolatrice.
     * @throws RuntimeException Se si verifica un'eccezione durante l'elaborazione.
     */    
    public boolean verifyNumericInput(String input) throws RuntimeException{        
            // Regex per verificare se l'input corrisponde a un numero complesso
            // ([+-]?\\d*\\.?\\d+) questa parte corrisponde alla parte reale di un numero complesso.
            // ([+-]?\\d*\\.?\\d*j) questa parte corrisponde alla parte immaginaria di un numero complesso.
            String regex = "([+-]?\\d*\\.?\\d+)?([+-]?\\d*\\.?\\d*j)?";
           
            Pattern pattern = Pattern.compile(regex);
            
            // Cerca la corrispondenza tra l'input e la regex
            Matcher matcher = pattern.matcher(input);
            
            // Se l'input corrisponde a un numero complesso, lo inserisce nello stack
            if (matcher.matches()){
                String realPart = matcher.group(1);
                String imagPart = matcher.group(2);
                
                // Tratta il caso in cui l'input contiene solo una parte immaginaria (es. "j" o "1j")
                if(input.matches("([+-]?\\d*\\.?\\d*j)")){
                    imagPart=input;
                    realPart="";
                } 
                
                // Se la parte immaginaria non è nulla, la processa
                if(imagPart != null){
                    imagPart = imagPart.replace("j", "");
                    if(imagPart.isEmpty() || (((imagPart.charAt(0)=='+' || imagPart.charAt(0)=='-')&& imagPart.length() == 1))){
                           imagPart+="1";
                    }
                }
                // Converte le parti reali e immaginarie in double
                double real = (realPart != null && !realPart.isEmpty()) ? Double.parseDouble(realPart) : 0.0;
                double imag = (imagPart != null && !imagPart.isEmpty()) ? Double.parseDouble(imagPart) : 0.0;
                
                // Inserisce il numero complesso nello stack della calcolatrice
                model.insertNumber(imag, real);   
                return true;
            }
                return false;
            }
    
    /**
     * Verifica e processa l'input inserito nella calcolatrice.
     * Se l'input corrisponde a un'operazione matematica esegue l'operazione corrispondente.
     *
     * @param input L'input inserito nella calcolatrice.
     * @throws RuntimeException Se si verifica un'eccezione durante l'elaborazione.
     */      
    public boolean verifyArithmeticOperation(String input) throws RuntimeException{ 
             if (input.matches("[-+*÷√]|\\+/-")){
                // Se l'input corrisponde a un'operazione matematica, la esegue
                        switch(input){
                            case "*":
                                model.prodotto();
                                break;
                            case "÷":
                                model.rapporto();
                                break;
                            case "-":
                                model.differenza();
                                break;
                            case "+":
                                model.somma();
                                break;
                            case "√":
                                model.radice();
                                break;
                            case "+/-":
                                model.cambioSegno();
                                break;
                        }
                        return true;
                }
             return false;}
     /**
      * Verifica e processa l'input inserito nella calcolatrice.
      * Se l'input corrisponde a una manipolazione delle variabili, esegue l'operazione corrispondente.
      *
      * @param input L'input inserito nella calcolatrice.
      * @throws RuntimeException Se si verifica un'eccezione durante l'elaborazione.
      */  
    public boolean verifyVariablesOperation(String input) throws RuntimeException{
                if (input.matches("[-+<>]x[a-z]")){
                    view.display.setText("");
                    // Se l'input corrisponde a una manipolazione delle variabili, la esegue
                            String primaParte = input.substring(0, 2);
                            char secondaParte = input.charAt(2);
                            switch (primaParte){
                                case("<x"):
                                    model.duplicazioneVariabile(secondaParte);
                                    break;
                                case(">x"):
                                    model.assegnaVariabile(secondaParte);
                                    break;
                                case("+x"):
                                    model.sommaVariabile(secondaParte);
                                    break;
                                case("-x"):
                                    model.differenzaVariabile(secondaParte);
                                    break;                   
                            }
                            // Se l'input corrisponde a una manipolazione delle variabili, la esegue
                            view.variableMemory.setText(model.toStringHM());
                            return true;
                }
              return false;
        }
     
    /**
     * Inizializza le proprietà di disabilitazione per alcuni pulsanti della tastiera numerica
     * in base al contenuto del campo di visualizzazione della calcolatrice.
     * Alcuni pulsanti sono disabilitati quando il campo di visualizzazione è vuoto.
     */
    private void initBindings(){
        // Disabilita i pulsanti per fare le operazioni sulla struttura dati quando il campo di visualizzazione è vuoto
        for(int i = 0; i < 4; i++)
            view.numKeyboard.numop[i].disableProperty().bind(Bindings.notEqual("", view.display.textProperty()));
        
        // Disabilita i pulsanti numerici della seconda riga quando il campo di visualizzazione non è vuoto
        for(int i = 5; i <=10; i++)
            view.numKeyboard.numop[i].disableProperty().bind(Bindings.notEqual("", view.display.textProperty()));
        
        // Disabilita i pulsanti numerici  per effettuare le operazioni su variabili quando il campo di visualizzazione non è vuoto
        for(int i = 10; i <=20; i+=5)
            view.numKeyboard.numop[i].disableProperty().bind(Bindings.notEqual("", view.display.textProperty()));
        
        // Disabilita il pulsante '*' quando il campo di visualizzazione non è vuoto
        view.numKeyboard.numop[14].disableProperty().bind(Bindings.notEqual("", view.display.textProperty()));
        
         // Disabilita il pulsante 'EXE' quando il campo di visualizzazione è vuoto
        view.numKeyboard.numop[27].disableProperty().bind(Bindings.equal("", view.display.textProperty()));
        
        // Disabilita il pulsante 'C' quando il campo di visualizzazione è vuoto
        view.numKeyboard.numop[4].disableProperty().bind(Bindings.equal("", view.display.textProperty()));  
    }
    
}
