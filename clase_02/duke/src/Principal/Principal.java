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
public class Principal {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
    
        int st1=recibirStock("Recibir el stock: ");
        
        String nPrenda=recibirPrenda("Recibir el prenda: ");
       
        double pr1=recibirPrecio("Recibir el precio: ");

        
        duke d1=new duke(st1,nPrenda,pr1);
   
        d1.display();
        
    }
    
    public static int recibirStock(String texto){
        
        Scanner s1=new Scanner (System.in);
        System.out.println(texto);
        String strStock=s1.nextLine();
        int stock=Integer.parseInt(strStock);
        return stock;
    }
    
    public static String recibirPrenda(String texto){
        
        Scanner s1=new Scanner (System.in);
        System.out.println(texto);
        String nombrePrenda=s1.nextLine();
    
        return nombrePrenda;
    }    
    
    public static double recibirPrecio(String texto){
        
        Scanner s1=new Scanner (System.in);
        System.out.println(texto);
        String strPrecio=s1.nextLine();
        double precio=Double.parseDouble(strPrecio);
        return precio;
    }*/
    public class Persona{
        
    /*    Cargue una persona

Esta tiene
Nombre
Sexo
oficio
Edad

metodo 
Calcular el año de nacimiento de la persona;

Calcular la cantidad de dias de vida de la persona;*/

        String nombre=recibirTexto("Escriba su nombre: ");
        String sexo=recibirTexto("Escriba el sexo de "+nombre+": ");        
        String oficio=recibirTexto("Escriba el oficio de"+nombre+": ");
        int edad=recibirEdad("Escriba la edad de "+nombre+": ");

        }

    public static int recibirEdad(String texto){
        
        Scanner s1=new Scanner (System.in);
        System.out.println(texto);
        String strEdad=s1.nextLine();
        int edad=Integer.parseInt(strEdad);
        return edad;
        
    }
 
    public static String recibirTexto(String texto){
        
        Scanner s1=new Scanner (System.in);
        System.out.println(texto);
        String datos=s1.nextLine();
    
        return datos;
    
    }
    
}
