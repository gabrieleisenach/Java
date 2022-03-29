package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int numero1 = ingresarNumero("Ingrese un numero positivo entero: ");
        recursividad(numero1);
    }
    
    public static int ingresarNumero(String texto) {
        Scanner consola = new Scanner(System.in);
        System.out.print(texto);
        int numero = consola.nextInt();
        return numero;
    }
    
    public static int recursividad (int numero) {
//        int recursivedad;
//        if (numero1 > 1){
//            recursivedad = numero1 * recursividad(numero1-1);
//            System.out.println(recursivedad);
//            
//            
//        }
        int res;

        if (numero == 1) {
            //Se termina la recursion
            System.out.println(1);
            return 1;
        } else {
            //Se llama a si misma la función con el parametro numero menos 1
            res = numero * recursividad(numero - 1);
            System.out.println(res);
        }

        //Devuelve el resultado
        return res;
    }


}
