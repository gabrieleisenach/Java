package Test;

import java.util.Random;

public class ejercicio07 {
    public static void main(String[] args) {
        int cantidad = numeroRandom(1, 11);
        System.out.println("cantidad = " + cantidad);
        char caracter = (char)numeroRandom(65, 91);
        System.out.println("caracter = " + caracter);
        generarCaracteres(cantidad, caracter);
    }
    
    public static int numeroRandom(int min, int max) {
        Random generarRandom = new Random();
        int numero = generarRandom.nextInt(min, max);
        return numero;
    }
    
    public static void generarCaracteres(int cantidad, char caracter){
        for (int i = 0; i < cantidad; i++) {
            System.out.print(caracter);
            
        }
        System.out.println("");
        
    }
}
