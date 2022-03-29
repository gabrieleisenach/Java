package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        menu();
        
    }
    
    public static void menu(){
        
        boolean flag = true;
        int opcion;
        String texto="----------------------\n"
                + ""
                + "Menu de opciones:\n"
                + "-----------------\n"
                + "(1) Suma\n"
                + "(2) Resta\n"
                + "(3) Multiplicacion\n"
                + "(4) Division\n"
                + "(0) Salir\n"
                + "----------------------\n"
                + "Ingrese la opcion deseada: ";
        String primerNumero = "Ingrese el primer numero: ";
        String segundoNumero = "Ingrese el segundo numero: ";
        
        while (flag) {
            
            try {

                opcion = ingresarNumero(texto);

                switch (opcion) {

                    case 1:
                        int numero1 = ingresarNumero(primerNumero);
                        int numero2 = ingresarNumero(segundoNumero);
                        int resultado = sumar(numero1, numero2);
                        System.out.println("El resultado de la suma es: " + resultado);
                        break;
                    case 2:
                        System.out.println("Se realizo el listado");
                        break;
                    case 3:
                        System.out.println("Se realizo el borrado");
                        break;
                    case 4:
                        System.out.println("Se realizo la mmuestra");
                        break;
                    case 0:
                        System.out.println("Gracias por usar el programa");
                        flag = false;
                        break;
                    default:
                        System.out.println("No ingreso un numero indicado");
                }

            } catch (InputMismatchException malIngreso) {

                System.out.println("Realizo un mal ingreso:\nerror:" + malIngreso);
            }
            
        }
        
    }
    public static int ingresarNumero(String texto){
        
        Scanner consola = new Scanner(System.in);
        System.out.println(texto);
        int numero = consola.nextInt();
        return numero;
        
    }
    public static int sumar (int numero1, int numero2){
        
        int resultado = numero1 + numero2;
        return resultado;
        
    }
    public static int resta (int numero1, int numero2){
        
    int resultado = numero1 - numero2;
    return resultado;
        
    }

}
