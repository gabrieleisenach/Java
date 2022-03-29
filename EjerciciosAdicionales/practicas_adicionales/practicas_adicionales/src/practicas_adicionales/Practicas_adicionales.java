package practicas_adicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Eisenach
 */
public class Practicas_adicionales {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
                
        boolean flag = true;
        int opcion;
        String texto="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "----------------------\n"
                + "Menu de opciones:\n"
                + "-----------------\n"
                + "(1) Ejercicio 1\n"
                + "(2) Ejercicio 2\n"
                + "(3) Ejercicio 3\n"
                + "(4) Ejercicio 4\n"
                + "(5) Ejercicio 5\n"
                + "(6) Ejercicio 6\n"
                + "(7) Ejercicio 7\n"
                + "(8) Ejercicio 8\n"
                + "(9) Ejercicio 9\n"
                + "(10) Ejercicio 10\n"
                + "(0) Salir\n"
                + "----------------------\n"
                + "Ingrese la opcion deseada: ";
        String textoEjercicio;
        
        while (flag) {
            
            try {
                
                opcion = ingresarNumero(texto);

                switch (opcion) {

                    case 1:
                        textoEjercicio = "Dado los datos A, B, C y D que representan números enteros, escriba los mismos en orden inverso.";
                        Ejercicios e1 = new Ejercicio1 (textoEjercicio);
                        e1.respuesta();
                        System.out.println(e1.toString());
                        continuar();
                        break;
                    case 2:
                        textoEjercicio = "Dada 5 calificaciones de un alumno obtenidas a lo largo del semestre, construya un programa que imprima el promedio de sus calificaciones.";
                        Ejercicios e2 = new Ejercicio2 (textoEjercicio);
                        e2.respuesta();
                        System.out.println(e2.toString());
                        continuar();
                        break;
                    case 3:
                        textoEjercicio = "Dados el valor de una hora de trabajo y la cantidad de horas trabajadas el programa muestra el valor del sueldo bruto.";
                        Ejercicios e3 = new Ejercicio3 (textoEjercicio);
                        e3.respuesta();
                        System.out.println(e3.toString());
                        continuar();
                        break;
                    case 4:
                        textoEjercicio = "Escriba un programa que permita calcular e imprimir el cuadrado y el cubo de un numero entero positivo NUM.";
                        Ejercicios e4 = new Ejercicio4 (textoEjercicio);
                        e4.respuesta();
                        System.out.println(e4.toString());
                        continuar();
                        break;
                    case 5:
                        textoEjercicio = "Construya un programa tal que dado como datos la base y la altura de un rectángulo, calcule el perímetro y la superficie del mismo.";
                        Ejercicios e5 = new Ejercicio5 (textoEjercicio);
                        e5.respuesta();
                        System.out.println(e5.toString());
                        continuar();
                        break;
                    case 6:
                        textoEjercicio = "Dado dos identificadores A y B de tipo entero. Los valores iniciales serán 25 y 100 deberá mostrar por pantalla las siguientes operaciones aritméticas suma, resta, multiplicación, división y resto.";
                        Ejercicios e6 = new Ejercicio6 (textoEjercicio);
                        e6.respuesta();
                        System.out.println(e6.toString());
                        continuar();
                        break;
                    case 7:
                        textoEjercicio = "Dado el precio de costo de un artículo para ponerlo a la venta una empresa incrementa su valor en un 15%.";
                        Ejercicios e7 = new Ejercicio7 (textoEjercicio);
                        e7.respuesta();
                        System.out.println(e7.toString());
                        continuar();
                        break;
                    case 8:
                        textoEjercicio = "Si una compra supera los 1500 pesos se da un descuento del 10% mostrar el resultado por pantalla.";
                        Ejercicios e8 = new Ejercicio8 (textoEjercicio);
                        e8.respuesta();
                        System.out.println(e8.toString());
                        continuar();
                        break;
                    case 9:
                        textoEjercicio = "Se ingresan tres valores numéricos se muestra su suma y su promedio por pantalla.";
                        Ejercicios e9 = new Ejercicio9 (textoEjercicio);
                        e9.respuesta();
                        System.out.println(e9.toString());
                        continuar();
                        break;
                    case 10:
                        textoEjercicio = "Dado tres apellidos se muestran en orden alfabético.";
                        Ejercicios e10 = new Ejercicio10 (textoEjercicio);
                        e10.respuesta();
                        System.out.println(e10.toString());
                        continuar();
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
        System.out.print(texto);
        int numero = consola.nextInt();
        return numero;
    }
    
    public static void continuar (){
        
        Scanner consola = new Scanner(System.in);
        System.out.print("Presione ENTER para continuar");
        String enter = consola.nextLine();
    }

}
