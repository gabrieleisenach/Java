package operaciones;

import java.util.Scanner;

public abstract class Operaciones {
    protected double numero1;
    protected double numero2;
    protected double resultado;

    public Operaciones() {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
    
    public abstract void respuesta();
    
    public double ingresarDouble(String texto) {
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
                System.out.println("Error!!! Ingrese un numero por favor: ");
            } 
        }
        return 0;
    }

    public double getNumero1() {
        return this.numero1;
    }

    public double getNumero2() {
        return this.numero2;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("numero1: ").append(numero1);
        sb.append(", numero2: ").append(numero2);
        return sb.toString();
    }
    
    
    
}
// InputMismatchException