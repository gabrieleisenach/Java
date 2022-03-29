/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author gaboh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1=ingrasarNumero("Ingresar el primer numero: ");
        int n2=ingrasarNumero("Ingresar el segundo numero: ");
        int n3=ingrasarNumero("Ingresar el tercer numero: ");   
        
        numeroMayor(n1,n2,n3);
        
    }
    
    public static int ingrasarNumero(String tipoDeDato){
        
        Scanner capturarConsola=new Scanner(System.in);
        System.out.print("Ingrese "+tipoDeDato);
        String captura=capturarConsola.nextLine();
        int numero=Integer.parseInt(captura);
        return numero;
        
    }
    
    public static void numeroMayor(int n1,int n2,int n3){
        
        int mayor=n1;
        
        if (n2>n3){
            if (n2>n3){
                mayor=n2;
                
            }
        }
        else if (n2>n1){
            mayor=n3;
            
        }
        
        System.out.println("El mayor numero es: "+mayor);
        
    }

}
