/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import EjemploPolimorfismo.*;


/**
 *
 * @author gaboh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Op_padre suma1 = new Op_suma();
        suma1.PedirDatos();
        suma1.Operaciones();
        
        Op_padre resta1 = new Op_resta();
        resta1.PedirDatos();
        resta1.Operaciones();
        
        Op_padre multiplicacion1 = new Op_multiplicacion();
        multiplicacion1.PedirDatos();
        multiplicacion1.Operaciones();
        
        Op_padre division1 = new Op_division();
        division1.PedirDatos();
        division1.Operaciones();
    }
    
}
