/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author gaboh
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner capturaPantalla=new Scanner(System.in);
        System.out.print("Escriba el nombre del alumno: ");

        String n_alumno=capturaPantalla.nextLine();
       
        //String n_alumno="Gabriel";
        
        double n1=cargarNota("primera");
        double n2=cargarNota("segunda");
        double n3=cargarNota("tercera");
        double n4=cargarNota("cuarta");
        double n5=cargarNota("quinta");
        
        double promedio=promediar (n1,n2,n3,n4,n5);

        System.out.println("Alumno: "+n_alumno);    
        System.out.println("Promedio: "+promedio);
    }
    
    public static double promediar(double n1, double n2, double n3, double n4, double n5){
         
        double suma=n1+n2+n3+n4+n5;

        double promedio=suma/5;
        
        return promedio;
        
    }
    
    public static double cargarNota(String orden){
        
        Scanner capturaPantalla=new Scanner(System.in);
        System.out.print("Escriba la "+orden+" nota del alumno: ");
        String strNota=capturaPantalla.nextLine();
        double nota=Double.parseDouble (strNota);
        return nota;
            
        }

    
}
