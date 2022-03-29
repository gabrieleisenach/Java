package Main;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        
            String nombreEmpleado=ingresarTexto("Ingrese el nombre del empleado: ");
            int sueldoEmpleado=ingresarInt("Ingrese el sueldo de "+nombreEmpleado+": ");
            int categoriaEmpleado=ingresarInt("Ingrese la categoria de "+nombreEmpleado+": ");
            double sueldoFinalEmpleado=0;
            
            Persona empleado1=new Persona(nombreEmpleado,sueldoEmpleado,categoriaEmpleado,sueldoFinalEmpleado);
            
            
            
            
    }
        
        public static String ingresarTexto (String texto){
            
            Scanner leer=new Scanner(System.in);
            System.out.println(texto);
            String textoIngresado=leer.nextLine();
            return textoIngresado;
            
        }
        
        public static int ingresarInt (String texto){
            
            Scanner leer=new Scanner(System.in);
            System.out.println(texto);
            String textoIngresado=leer.nextLine();
            int enteroIngresado=Integer.parseInt(textoIngresado);
            return enteroIngresado;            
            
        }
    
}
