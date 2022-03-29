package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Se le pide que ingrese dos numero. El primero de los numeros debe ser menor al segundo");
        boolean flag = true;
        int numero1 = 0;
        int numero2 = 0;
        while(flag) {
            numero1 = ingresarNumero("Ingrese el primer numero: ");
            numero2 = ingresarNumero("Ingrese el segundo numero: ");
            if (numero2 > numero1) {
                flag = false;
            } else { 
                System.out.println("Error!!! El primer numero debe ser inferior al segundo. Vuelva a intentarlo por favor.");
            }
        }
        System.out.print("Multiplos de " + numero1 + ": ");
        for (int i = numero1; i <= numero2; i+=numero1) {
            System.out.print(i + ", ");
        }
        System.out.print("\b\b.\n");
    }
    
    public static int ingresarNumero(String texto) {
        Scanner consola = new Scanner(System.in);
        System.out.print(texto);
        int numero = consola.nextInt();
        return numero;
    }
}
