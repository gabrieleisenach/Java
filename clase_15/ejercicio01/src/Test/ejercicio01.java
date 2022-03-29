package Test;

import java.util.Random;

public class ejercicio01 {
    public static void main(String[] args) {
        int n1 = numerosRandom();
        int n2 = numerosRandom();
        int n3;
        System.out.println("Numeros: " + n1 + " y " + n2);
        numeroMayor(n1, n2, -1, "2");
        n1 = numerosRandom();
        n2 = numerosRandom();
        n3 = numerosRandom();
        System.out.println("Numeros: " + n1 + " , " + n2 + " y " + n3);
        numeroMayor(n1, n2, n3, "3");
        
    }
    
    public static int numerosRandom() {
        Random generarRandom = new Random();
        int numeroRandom = generarRandom.nextInt(0,100);
        return numeroRandom;
    }
    

    
    public static void numeroMayor(int numero1, int numero2, int numero3, String cantidadNumeros) {
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1 + " es el mayor de los " + cantidadNumeros);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 + " es el mayor de los " + cantidadNumeros);
        } else if (numero3 > numero1 && numero3 > numero1) {
            System.out.println(numero3 + " es el mayor de los " + cantidadNumeros);
        } else if (numero1 == numero2 && numero1 > numero3) {
            System.out.println(numero1 + " y " + numero2 + "Son los mayores de los " + cantidadNumeros);
        } else if (numero1 == numero3 && numero1 > numero2) {
            System.out.println(numero1 + " y " + numero3 + "Son los mayores de los " + cantidadNumeros);
        } else if (numero2 == numero3 && numero2 > numero2) {
            System.out.println(numero2 + " y " + numero3 + "Son los mayores de los " + cantidadNumeros);
        } else {
            System.out.println("Los " + cantidadNumeros + " numeros son iguales");
        }
    }
}
