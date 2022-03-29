package practicas_adicionales;

import java.util.Scanner;

/**
 *
 * @author Gabriel Eisenach
 */
public abstract class Ejercicios {
    
    protected String consigna;

    public Ejercicios(String consigna) {
        this.consigna = consigna;
    }
    
    public abstract void respuesta();
    
    public double ingresarNumeroFlotante(String texto){
        
        boolean flag = true;
        
        while(flag){
            try {
                Scanner consola = new Scanner(System.in);
                System.out.print(texto);
                String stringNumero = consola.nextLine();
                if (stringNumero.equals("")){
                    flag = false;
                } else {
                    double numero = Double.parseDouble(stringNumero);
                    flag = false;
                    return numero;
                }
            } catch (NumberFormatException error) {
                System.out.println("Error. Ingrese un numero por favor o presione Enter para omitir: ");
            } 
        }
        return 0;
    
    }
    public int ingresarNumeroEntero(String texto){
        
        boolean flag = true;
        
        while(flag){
            try {
                Scanner consola = new Scanner(System.in);
                System.out.print(texto);
                String stringNumero = consola.nextLine();
                if (stringNumero.equals("")){
                    flag = false;
                } else {
                    int numero = Integer.parseInt(stringNumero);
                    flag = false;
                    return numero;
                }
            } catch (NumberFormatException error) {
                System.out.println("Error. Ingrese un numero Entero por favor o presione Enter para omitir: ");
            } 
        }
        return 0;
    
    }
    public String ingresarString(String texto){
        
        boolean flag = true;
        
        while (flag) {

            Scanner consola = new Scanner(System.in);
            System.out.print(texto);
            String stringConsola = consola.nextLine();
            if (stringConsola.equals("")) {
                flag = false;
            } else {
                flag = false;
                return stringConsola;
            }
        }
        return "";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nConsigna: "+this.consigna+"\n");
        return sb.toString();
    }
    
       
        
}


