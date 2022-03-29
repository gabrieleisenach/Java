package ejercicio01;

import java.util.Random;

public class Ejercicio01 {

    public static void main(String[] args) {
        numeroPrimo();
    }
    
    public static void numeroPrimo() {
        int numeroRandom = numeroRandom();
        System.out.println("Numero = " + numeroRandom);
        int contadorMultiplos = 0;
        boolean numeroPrimo = false;
        for (int i = 1; i <= numeroRandom; i++) {
            if (numeroRandom % i == 0) {
                ++contadorMultiplos;
                if (contadorMultiplos > 2) {
                    numeroPrimo = true;
                    break;
                }
            }
        }
        if (numeroPrimo) {
            System.out.println("No es numero Primo");
        } else {
            System.out.println("Es numero Primo");
        }
    }
    
    public static int numeroRandom() {
        Random claseRandom = new Random();
        int randomInt = claseRandom.nextInt(0,101);
        return randomInt;
    }
    
}
