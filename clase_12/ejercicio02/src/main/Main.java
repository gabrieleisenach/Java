package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota1 = ingresarNotas("Ingrese la primera nota: ");
        double nota2 = ingresarNotas("Ingrese la segunda nota: ");
        double nota3 = ingresarNotas("Ingrese la tercera nota: ");
        double nota4 = ingresarNotas("Ingrese la cuarta nota: ");
        double promedio = promedio(nota1, nota2, nota3, nota4);
        System.out.println("promedio = " + promedio);
        int promedioRedondeado = (int) Math.round(promedio);
        System.out.println("promedioRedondeado = " + promedioRedondeado);
        if (promedioRedondeado > 7) {
            System.out.println("El alumno esta promocionado");
        } else if (promedioRedondeado < 7 && promedioRedondeado > 4) {
            System.out.println("El alumno esta aprobado");
        } else {
            System.out.println("El alumno esta reprobado");
        }
        
    }
    
    public static double ingresarNotas(String texto) {
        boolean notaInvalida = true;
        while (notaInvalida) {
            double nota;
            try {
                Scanner consola = new Scanner(System.in);
                System.out.println(texto);
                nota = consola.nextDouble();
                if (nota > 0 && nota < 11) {
                    return nota;
                } else {
                    System.out.println("Nota invalida, vuelva a ingresar la nota por favor.");
                }
            } catch (Exception e) {
                System.out.println("Nota invalida, vuelva a ingresar la nota por favor." + e);
            }
        }
        return 0;
    }
    
    public static double promedio (double nota1, double nota2, double nota3, double nota4){
        double promedio = ((nota1 + nota2 + nota3 + nota4)/4);
        return promedio;
    }
}
