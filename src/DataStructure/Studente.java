/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructure;
import java.text.DecimalFormat;
/**
 *
 * @author Andrea
 */
public class Studente {
    private String nome;
    private final String matricola;
    private double votoMedio;
    
    public Studente(String nome, String matricola, double votoMedio){
        this.nome = nome;
        this.matricola = matricola;
        this.votoMedio = votoMedio;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricola(){
        return matricola;
    }
    
    public double getVotoMedio(){
        return votoMedio;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setVotoMedio(double votoMedio){
        this.votoMedio = votoMedio;
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        DecimalFormat formatoVoto = new DecimalFormat("#.##");
        sb.append("Nome: ");
        sb.append(nome);
        sb.append("-");
        sb.append("Matricola: ");
        sb.append(matricola);
        sb.append("-");
        sb.append("Voto Medio: ");
        sb.append(formatoVoto.format(votoMedio));
        sb.append("\n");
        return sb.toString();
    }
    
    
}
