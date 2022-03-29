package Test;

import java.util.Random;
import javax.swing.JOptionPane;

public class ejercicio08 {
    public static void main(String[] args) {
        int cantidad = numeroRandom(1, 11);
        int lista[] = new int[cantidad];
        cargarLista(lista);
        String caracter = ingresarTexto();
        controlCaracter(lista, caracter);
    }
    
    public static String ingresarTexto() {
        String stringTexto = JOptionPane.showInputDialog("Ingrese el caracter:");
        return stringTexto;
    }

    public static int numeroRandom(int min, int max) {
        Random generarRandom = new Random();
        int numero = generarRandom.nextInt(min, max);
        return numero;
    }
    
    public static void cargarLista(int lista[]) {
        int numeroCargar;
        for (int i = 0; i < lista.length; i++) {
            numeroCargar = numeroRandom(1, 11);
            lista[i] = numeroCargar;
        }
    }
    
    public static void procedimiento(int lista[], String caracter) {
        System.out.print("\b\b\n");
        for (int i : lista) {
            for (int j = 0; j < i; j++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
    
    public static void control(int lista[], String caracter) {
        System.out.println("Caracter: " + caracter);
        System.out.print("Lista: ");
        for (int i : lista) {
            System.out.print(i + ", ");
        }
    }
    
    public static void controlCaracter(int lista[], String caracter) {
        if (caracter.length() > 1) {
            JOptionPane.showMessageDialog(null, "Error!!! No ingreso un caracter");
        } else {
            control(lista, caracter);
            procedimiento(lista, caracter);
        }
    }
}
