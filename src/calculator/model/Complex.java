/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.model;

/**
 *
 * @author Carlo Marna
 */
public class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    /**
     * Restituisce una rappresentazione testuale del numero complesso.
     * @return Rappresentazione testuale del numero complesso.
     */
    @Override
    public String toString() {
        if (im == 0) return re + "\n";
        if (re == 0) return im + "j\n";
        if (im <  0) return re + " - " + (-im) + "j\n";
        return re + " + " + im + "j\n";
    }
   
    /**
     * Esegue l'operazione di addizione tra due numeri complessi.
     * @param a Primo numero complesso.
     * @param b Secondo numero complesso.
     * @return Nuovo numero complesso risultante dall'addizione di a e b.
     */
    public static Complex add(Complex a, Complex b){

        double real = a.getRe() + b.getRe();
        double imag = a.getIm()+ b.getIm();
        return new Complex(real, imag);    
    } 
   
    /** Esegue l'operazione di sottrazione tra due numeri complessi.
     * @param b Numero complesso da sottrarre.
     * @param a Numero complesso dal quale sottrarre.
     * @return Nuovo numero complesso risultante dalla sottrazione di b da a.
     */
    public static Complex sub(Complex b, Complex a){
        double imag = a.getIm() - b.getIm();
        double real = a.getRe() - b.getRe();
        return new Complex(real, imag);    
    } 
   
    /**
     * Esegue l'operazione di moltiplicazione tra due numeri complessi.
     * @param a Primo numero complesso.
     * @param b Secondo numero complesso.
     * @return Nuovo numero complesso risultante dalla moltiplicazione di a e b.
     */   
    public static Complex mul(Complex a, Complex b){
        double real = a.getRe() * b.getRe() - a.getIm() * b.getIm();
        double imag = a.getRe()* b.getIm() + a.getIm() * b.getRe();
        return new Complex(real, imag);    
    }
   
    /**
     * Calcola il reciproco di un numero complesso.
     * @param b Numero complesso per il quale calcolare il reciproco.
     * @return Nuovo numero complesso risultante dal calcolo del reciproco di b.
     */   
    private static Complex reciproco(Complex b){
        double scale = b.getRe()*b.getRe() + b.getIm()*b.getIm();
        double realPart =b.getRe() / scale;
        double imaginaryPart = -b.getIm() / scale;
        return new Complex(realPart, imaginaryPart);
    }
   
    /**
     * Esegue l'operazione di divisione tra due numeri complessi.
     * @param b Numeratore.
     * @param a Denominatore.
     * @return Nuovo numero complesso risultante dalla divisione di b per a.
     */
   public static Complex div(Complex b, Complex a){
       return mul(a, reciproco(b));
   }
   
    /**
     * Calcola la radice quadrata di un numero complesso.
     * @param a Numero complesso per il quale calcolare la radice quadrata.
     * @return Nuovo numero complesso risultante dal calcolo della radice quadrata di a.
     */  
    public static Complex sqrt(Complex a){
        // Calcola il modulo e l'angolo del numero complesso
        double modulo = Math.sqrt(a.getRe()*a.getRe() + a.getIm() * a.getIm());
        double angolo = Math.atan2(a.getIm(), a.getRe());
        
        // Calcola la radice quadrata del modulo e l'angolo diviso per 2
        double sqrtModulo = Math.sqrt(modulo);
        double sqrtAnglolo = angolo / 2.0;
        
        // Calcola la parte reale e immaginaria del risultato
        double realPart = sqrtModulo * Math.cos(sqrtAnglolo);
        double imaginaryPart = sqrtModulo * Math.sin(sqrtAnglolo);
        
        // Arrotonda i valori a tre cifre decimali
        realPart = Math.round(realPart * 1000.0) / 1000.0;
        imaginaryPart = Math.round(imaginaryPart * 1000.0) / 1000.0;

        return new Complex(realPart,imaginaryPart);
    }

    /**
     * Cambia il segno di un numero complesso.
     * @param a Numero complesso da cui cambiare il segno.
     * @return Nuovo numero complesso risultante dal cambio del segno di a.
     */
    public static Complex change(Complex a){
      return new Complex(-a.getRe(),-a.getIm());
    }
}
