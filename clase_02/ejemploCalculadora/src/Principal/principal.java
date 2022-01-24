package Principal;

import Clases.calculadora;
import java.util.Scanner;

public class principal {


    public static void main(String[] args) {

        /*Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        String numeroUno=leer.nextLine();
        double n1=Double.parseDouble(numeroUno);
 
        System.out.println("Ingrese el segundo numero: ");
        String numeroDos=leer.nextLine();
        double n2=Double.parseDouble(numeroDos);
        
        calculadora c1=new calculadora(n1,n2);
        
        c1.suma(n1,n2);
        
        c1.resta(n1,n2);
        
        c1.division(n1,n2);
        
        c1.multiplicacion(n1,n2);*/
        
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la pelicula: ");
        String pelicula=leer.nextLine();
 
        System.out.println("\nIngrese el autor de la pelicula: ");
        String autor=leer.nextLine();

        System.out.printf("\nLa pelicula: %s\nFue hecha por: %s\n\n", pelicula, autor);

    }
    
}
