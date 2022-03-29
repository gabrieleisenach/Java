package main;

import java.util.*;

public class Main {

        public static void main(String[] args) {

        List<String> equipos = new ArrayList<>(); 

        String carga;
        boolean ban=true;

        while(ban){
            carga=listaEquipos();
            if (carga=="") {
                ban=false;
            } else {
               equipos.add(carga);
            }
        }
        
        System.out.println("Se finalizo el programa");
        
        //size() remplaza  a length
        mostrarLista((ArrayList)equipos);
        
    }
    
    public static String cargarEquipo(String texto){

        Scanner leer= new Scanner(System.in);
        System.out.println(texto);
        String equipo=leer.nextLine();

        return equipo;
    
    }
    
    public static String listaEquipos(){
        
        String carga;
        carga=cargarEquipo("Ingrese el nombre del equipo o presione Enter para finalizar: ");
        return carga;
        
    }
    
    public static void mostrarLista(ArrayList equipos){
        
        System.out.println("Los equipos de la lista son:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(equipos.get(i));
            
        }
    }
    
}
