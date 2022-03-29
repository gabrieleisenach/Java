package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Se le pide que ingrese una hora valida");
        int hora = 0;
        int minutos = 00;
        int segundos = 00;
        boolean flag = true;
        hora = ingresarNumero("Ingrese una hora: ");
        minutos = ingresarNumero("Ingrese los minutos: ");
        segundos = ingresarNumero("Ingrese los segundos: ");
        if (segundos >= 0 && segundos <= 60) {//
            if (segundos == 60) {
                minutos = minutos + 1;
                segundos = 0;
            }
            if (minutos >= 0 && minutos <= 60) {//
                if (minutos == 60) {
                    hora = hora + 1;
                    minutos = 0;
                }
                if (hora >= 0 && hora <= 24) {
                    if (hora == 24) {
                        hora = 0;
                    }
                    flag = false;
                } else {
                    System.out.println("Error!!! Hora invalida. Vuelva a intentarlo por favor.");
                }
            } else {
                System.out.println("Error!!! minutos invalidos. Vuelva a intentarlo por favor.");
            }
        } else {
            System.out.println("Error!!! Segundos invalidos. Vuelva a intentarlo por favor.");
        }
        System.out.println("Hora ingresada: " + hora + ":" + minutos + ":" + segundos);
    }
    
    public static int ingresarNumero(String texto) {
        Scanner consola = new Scanner(System.in);
        System.out.print(texto);
        int numero = consola.nextInt();
        return numero;
    }
}
