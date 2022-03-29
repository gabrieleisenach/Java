package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                
        int ladosCuadrado=lados("Ingrese uno de los lados del cuadrado: ");
        
        area(ladosCuadrado,ladosCuadrado,"cuadrado");
        perimetro(ladosCuadrado,ladosCuadrado,ladosCuadrado,ladosCuadrado,"cuadrado");
    
        int ladoRectangulo1=lados("Ingrese el lado del rectangulo: ");        
        int ladoRectangulo2=lados("Ingrese alto del rectangulo: ");   
        
        area(ladoRectangulo1,ladoRectangulo2,"rectangulo");
        perimetro(ladoRectangulo1,ladoRectangulo2,ladoRectangulo1,ladoRectangulo2,"rectangulo");
        
    }
   
    public static int lados(String texto){
        
        Scanner leerPantalla=new Scanner(System.in);
        System.out.println(texto);
        String strlados=leerPantalla.nextLine();
        int lados=Integer.parseInt(strlados);
        return lados;
        
    }
    
    public static void area(int n1,int n2,String texto){
        
        System.out.println("El area del "+texto+" es "+(n1*n2));
    }
    
    public static void perimetro(int n1,int n2,int n3, int n4,String texto){
        
        System.out.println("El area del "+texto+" es "+(n1+n2+n3+n4));
    }
    
}
