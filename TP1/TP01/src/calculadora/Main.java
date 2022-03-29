package calculadora;

import java.util.*;
import operaciones.*;

public class Main {
    public static void main(String[] args) {
        List<Operaciones> listaOperaciones = new ArrayList();
        menu(listaOperaciones);
    }
    
    public static void menu(List lista){
                
        boolean flag = true;
        int opcion;
        String texto="----------------------\n"
                + "Menu de opciones:\n"
                + "-----------------\n"
                + "(1) Realizar operaciones\n"
                + "(2) Listar operaciones guardadas\n"
                + "(3) Salir\n"
                + "----------------------\n"
                + "Ingrese la opcion deseada: ";
        String textoEjercicio;//kk
        
        while (flag) {
            try {
                opcion = ingresarNumero(texto);

                switch (opcion) {
                    case 1:
                        menuCalculadora(lista);
                        break;
                    case 2:
                        GuardarResultados.mostrarResultados(lista);
                        continuar();
                        break;

                    case 3:
                        System.out.println("Gracias por usar el programa");
                        flag = false;
                        break;
                    default:
                        System.out.println("No ingreso un numero indicado");
                }

            } catch (Exception malIngreso) {//InputMismatchException
//
//                System.out.println("Realizo un mal ingreso:\nerror:" + malIngreso);
            }
        }
    }
    
    public static void menuCalculadora(List lista){
        boolean flag = true;
        int opcion;
        String texto="----------------------\n"
                + "Menu de opciones:\n"
                + "-----------------\n"
                + "(1) Suma\n"
                + "(2) Resta\n"
                + "(3) Multiplicacion\n"
                + "(4) Division\n"
                + "(5) Salir\n"
                + "----------------------\n"
                + "Ingrese la opcion deseada: ";
        while (flag) {
            try {
                opcion = ingresarNumero(texto);
                switch (opcion) {
                    case 1:
                        Operaciones calculadoraSuma = new Suma();
                        System.out.println("Resultado: " + calculadoraSuma.getResultado());
                        guardarOperacion(lista, calculadoraSuma);
                        continuar();
                        break;
                    case 2:
                        Operaciones calculadoraResta = new Resta();
                        System.out.println("Resultado: " + calculadoraResta.getResultado());
                        guardarOperacion(lista, calculadoraResta);
                        continuar();
                        break;
                    case 3:
                        Operaciones calculadoraMultiplicacion = new Multiplicacion();
                        System.out.println("Resultado: " + calculadoraMultiplicacion.getResultado());
                        guardarOperacion(lista, calculadoraMultiplicacion);
                        continuar();
                        break;
                    case 4:
                        Operaciones calculadoraDivision = new Division();
                        if (calculadoraDivision.getNumero2() != 0) {
                            System.out.println("Resultado: " + calculadoraDivision.getResultado());
                        } else {
                            System.out.println("Resultado: Error!!! No se puede dividir por 0");
                        }
                        guardarOperacion(lista, calculadoraDivision);
                        continuar();
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("No ingreso un numero indicado");
                }
            } catch (Exception malIngreso) {//InputMismatchException
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
    
    public static String ingresarString(String texto){
        Scanner consola = new Scanner(System.in);
        System.out.print(texto);
        String stringConsola = consola.nextLine();
        return stringConsola;
    }
    
    public static void continuar (){
        Scanner consola = new Scanner(System.in);
        System.out.print("Presione ENTER para continuar");
        String enter = consola.nextLine();
    }
    
    public static void guardarOperacion(List lista, Operaciones operacion) {
        boolean flag = true;
        while (flag) {
            String guardar = ingresarString("Desea guardar almacenar la operacion (S/N)?: ");
            if ("S".equalsIgnoreCase(guardar)) {
                GuardarResultados.guardarResultado(lista, operacion);
                flag = false;
            } else if ("N".equalsIgnoreCase(guardar)) {
                flag = false;
            } else {
                System.out.println("Error!!! Ingrese (S) para guardar o (N) para no guardar.");
            }
        }
    }
}
