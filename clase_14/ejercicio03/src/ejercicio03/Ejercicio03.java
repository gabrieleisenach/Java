package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        String texto = ingresarString("Ingrese el texto: ");
        contarLetras(texto);
    }
    
    public static String ingresarString(String texto) {
        Scanner console = new Scanner(System.in);
        System.out.println(texto);
        String consoleString = console.nextLine();
        return consoleString;
    }
    
    public static void contarLetras(String texto) {
        int cantidadLetras = 0;
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            if (((int)caracter > 64 && (int)caracter < 91) || ((int)caracter > 96 && (int)caracter < 123)) {
                cantidadLetras++;
            }
        }
        System.out.println("Cantidad de letras: " + cantidadLetras);
    }
    
}
