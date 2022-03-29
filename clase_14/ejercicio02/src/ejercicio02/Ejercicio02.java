package ejercicio02;

import java.util.Random;

public class Ejercicio02 {

    public static void main(String[] args) {
        numeroPerfecto();
    }
    
    public static void numeroPerfecto() {
        StringBuilder multiplos = new StringBuilder();
        
        int numeroRandom = numeroRandom();
        System.out.println("Numero: " + numeroRandom);
        multiplos.append("Multiplos: ");
        int suma = 0;
        for (int i = 1; i < (numeroRandom); i++) {
            if (numeroRandom % i == 0) {
                multiplos.append(i).append(", ");
                suma += i;
            }
            
        }
        multiplos.append("\b\b");
        System.out.println(multiplos);
        System.out.println("Suma: " + suma);
        if (suma == numeroRandom) {
            System.out.println("Es un numero Perfecto");
        } else {
            System.out.println("No es un numero Perfecto");
        }
    }
    
    public static int numeroRandom() {
        Random claseRandom = new Random();
        int randomInt = claseRandom.nextInt(1,11);
        return randomInt;
    }
    
}
