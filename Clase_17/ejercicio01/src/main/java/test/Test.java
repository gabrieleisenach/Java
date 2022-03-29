package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StringBuilder serie = new StringBuilder();
//        serieFibonacci(cantidad(), serie);
        int numeroFibonacci1 = 0;
        int numeroFibonacci2 = 1;
        int contador = 1;
        serie.append(numeroFibonacci1).append(", ").append(numeroFibonacci2);
        serieFibonaccioRecursiva(cantidad(), numeroFibonacci1, numeroFibonacci2, serie, contador);
        System.out.println("serie = " + serie);
    }
    
    public static void serieFibonacci(int casos, StringBuilder serie) {
        int numeroFibonacci1 = 0;
        int numeroFibonacci2 = 1;
        serie.append(numeroFibonacci1).append(", ").append(numeroFibonacci2);
        int aux;
        for (int i = 0; i < casos-2; i++) {
            aux = numeroFibonacci2;
            numeroFibonacci2 = numeroFibonacci1 + numeroFibonacci2;
            numeroFibonacci1 = aux;
            serie.append(", ").append(numeroFibonacci2);
        }
        System.out.println("serie = " + serie);
    }
    
    public static int cantidad(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        int cantidad = teclado.nextInt();
        return cantidad;
    }
    
    public static void serieFibonaccioRecursiva(int casos, int numeroFibonacci1, int numeroFibonacci2, StringBuilder serie, int contador){
        int aux;
        if (contador < casos-1){
            aux = numeroFibonacci2;
            numeroFibonacci2 = numeroFibonacci1 + numeroFibonacci2;
            numeroFibonacci1 = aux;
            serie.append(", ").append(numeroFibonacci2);
            serieFibonaccioRecursiva(casos, numeroFibonacci1, numeroFibonacci2, serie, contador+1);
        }
    }
}
