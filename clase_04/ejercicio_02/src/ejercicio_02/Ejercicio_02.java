/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author gaboh
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*

        Se pide generar una lista de 4 notas para un alumno y mostrarlas por pantalla
        las notas deben ser cargadas en la lista de forma dinamica 

        */
        int[] notas = new int[4];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i]=cargarNotas(i+1);
        }
        /*for (int i = 0; i < notas.length; i++) {
            System.out.println((i+1)+"° nota: "+notas[i]);
            
        }*/
        
        int i=1;
        for (int nota : notas) {
            System.out.println(i+"° nota: "+nota);
            i+=1;
        }
        
    }
    public static int cargarNotas(int indideNota){
    
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la "+indideNota+"° nota: ");
        int  numero=leer.nextInt();
        return numero;
        
    }
}
