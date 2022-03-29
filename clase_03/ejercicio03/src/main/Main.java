package main;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        
            String promedioAlumno=promrdio();
            String clificacionAlumno=calificacion(promedioAlumno);
        
            System.out.println("La calificacion del alumno es: "+clificacionAlumno);
        
    }
    
    public static String promrdio(){
        
        Scanner leerPantalla=new Scanner(System.in);
        System.out.println("Ingrese el promedio del alumno: ");
        String promedio=leerPantalla.nextLine();
        return promedio;
        
    }

    public static String calificacion(String nota){
    
        String calificacion="Desconocida";
        
        switch(nota){
            case "10":
                calificacion="A";
                break;
            case "8": case "9":
                calificacion="B";   
                break;
            case "7": case "6":
                calificacion="C";   
                break;
            case "5":
                calificacion="D";    
                break;
            case "1": case "2": case "3": case "4":
                calificacion="F";    
                break;
            default:
                calificacion="Calificacion incorrecta";
                
        }
    
        return calificacion;
        
    }
       
}
