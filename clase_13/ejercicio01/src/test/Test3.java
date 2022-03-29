package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int numero1 = ingresarNumero("Ingrese un numero positivo entero: ");
        int factorial;
        for (int i = 1; i <= numero1; i++) {
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            System.out.println("Factorial de " + i + ": " + factorial);
        }
    }
    
    public static int ingresarNumero(String texto) {
        Scanner consola = new Scanner(System.in);
        System.out.print(texto);
        int numero = consola.nextInt();
        return numero;
    }
}
