package Test;

import java.util.Random;

public class ejercicio03 {
    public static void main(String[] args) {
        int lista[] = new int[5];
        cargarLista(lista);
        numeroMayor(lista);
        
    }
    
    public static int numerosRandom() {
        Random generarRandom = new Random();
        int numeroRandom = generarRandom.nextInt(0,100);
        return numeroRandom;
    }
    
    public static void cargarLista(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = numerosRandom();
        }
        for (int i : lista) {
            System.out.print(i + ", ");
        }
        System.out.print("\b\b\n");
    }
    
    public static void numeroMayor(int lista[]) {
        int mayor = 0;
        for (int i : lista) {
            if (i > mayor) {
                mayor = i;
            }
        }
        System.out.println("El mayor numero del arreglo es: " + mayor);
    }
}
