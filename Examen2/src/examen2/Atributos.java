/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;
import javax.swing.JOptionPane;
/**
 *
 * @author Laboratorio
 */
public class Atributos {
    
    //Variables de matrices 
    private String Nombre;
    private int pasaporte;
    private String Nacionalidad;
    private String Letra;
    private int PrimeraClase[][];
    private int Business [][];
    private int Economica[][];

    public Atributos(String Nombre, int pasaporte, String Nacionalidad, String Letra, int[][] PrimeraClase, int[][] Business, int[][] Economica) {
        this.Nombre = Nombre;
        this.pasaporte = pasaporte;
        this.Nacionalidad = Nacionalidad;
        this.Letra = Letra;
        this.PrimeraClase = PrimeraClase;
        this.Business = Business;
        this.Economica = Economica;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public int[][] getPrimeraClase() {
        return PrimeraClase;
    }

    public int[][] getBusiness() {
        return Business;
    }

    public int[][] getEconomica() {
        return Economica;
    }

    public String getLetra() {
        return Letra;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setPrimeraClase(int[][] PrimeraClase) {
        this.PrimeraClase = PrimeraClase;
    }

    public void setBusiness(int[][] Business) {
        this.Business = Business;
    }

    public void setEconomica(int[][] Economica) {
        this.Economica = Economica;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    
    
    
    
    
    
    
    
    
    
}
