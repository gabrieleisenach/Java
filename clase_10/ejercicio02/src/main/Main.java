/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Random;

/**
 *
 * @author gaboh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Random ejemploUno = new Random();
//        int numeroUno = ejemploUno.nextInt(99,101);
//        System.out.println("numeroUno = " + numeroUno);
//        
//        int numeroRandom = (int)Math.floor(Math.random()*(0-10+1)+10);
//        System.out.println("numeroRandom = " + numeroRandom);

        StringBuilder texto = new StringBuilder();
        while (texto.length() < 11) {
            int numeroRandom = (int)Math.floor(Math.random()*(48-122+1)+122);
            if ((numeroRandom > 48 && numeroRandom < 58) || (numeroRandom > 65 && numeroRandom <91) || (numeroRandom > 97 && numeroRandom <122)){
                char caracter = (char)numeroRandom;
                texto.append(caracter);
            }
            
        }
        System.out.println("texto = " + texto);
    }
    
}
