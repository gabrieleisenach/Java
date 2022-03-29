package Test;

import java.util.Random;

public class ejercicio04 {
    public static void main(String[] args) {
        int n1 = numerosRandom();
        int n2 = numerosRandom();
        System.out.println(n1 + " X " + n2 + ": ");
        multiplicar(n1,n2);
    }
    
    public static int numerosRandom() {
        Random generarRandom = new Random();
        int numeroRandom = generarRandom.nextInt(0,100);
        return numeroRandom;
    }
    
    public static void multiplicar(int numero1, int numero2) {
        int n1 = 0;
        int n2 = 0;
        int producto = 0;
        if (n1 < n2) {
            n1 = numero1;
            n2 = numero2;
        } else {
            n1 = numero2;
            n2 = numero1;
        }
        for (int i = 0; i < n1; i++) {
            producto += n2;
        }
        System.out.println("Resultado de la multiplicacion: " + producto);
    }
}
