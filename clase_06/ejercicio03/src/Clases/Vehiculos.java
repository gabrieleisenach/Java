/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author gaboh
 */
public abstract class Vehiculos {
    
    public String marca;
    public int cantidadDeRuedas;

    public Vehiculos(String marca, int cantidadDeRuedas) {
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
    }
    
    public abstract void Arrancar();
    public abstract void Apagar();
    
    public String toString(){
        
    }
    
}
