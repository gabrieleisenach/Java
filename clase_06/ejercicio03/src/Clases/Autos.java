/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author gaboh
 */
public class Autos extends Vehiculos{

    String tipoMotor;
    public Autos(String tipoMotor, String marca, int cantidadDeRuedas) {
        super(marca, cantidadDeRuedas);
        this.tipoMotor=tipoMotor;
    }

    @Override
    public void Arrancar() {

    }

    @Override
    public void Apagar() {

    }
    
}
