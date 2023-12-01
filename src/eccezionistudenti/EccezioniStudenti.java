package eccezionistudenti;
import DataStructure.*;
import Exceptions.*;
/**
 *
 * @author Andrea
 */
public class EccezioniStudenti {

    public static void main(String[] args) throws StackException{
        Studente s1,s2,s3,s4;
        s1 = new Studente("Andrea Vitolo", "AV001", 18);
        s2 = new Studente("Giorgia Postiglioe", "GP002", 29.5);
        s3 = new Studente("Carlo Marna", "CM003", 28.6);
        s4 = new Studente("Sergio Lembo", "ASL004", 27);
        
        Stack array = new Stack(3);
        
        try{
            array.push(s1);
            array.push(s2);
            array.push(s3);
            array.push(s4);
        }catch (FullStackException e){
            System.out.println("Stack pieno");
        }
        try{
            array.pop();
            array.pop();
            array.pop();
            array.pop();
        }catch (EmptyStackException e){
            System.out.println("Stack vuoto.");
        }//ho fatto solo la stampe per gli errori, mi scocciavo di stampare ogni pop ecc...
    }
    
}
