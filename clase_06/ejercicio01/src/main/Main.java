/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.*;

/**
 *
 * @author gaboh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Diferencias
        
        //DEfinicion
        //Clasica
        //tipoDeDato[] nombreLista= new tipoDato[tamaño];
        //List<tipoDato> nombreLista = new ArrayList<>[];
        //List es una clase no hay que pasarle un tamaño 
        //Cambios
        //Size() length 
        //Retorno de archivos por get
        //Carga de datos por add
        
        //List<tipoValor> nombreLista= new ArrayList<>();
        
        List<String> diasDeLaSemana= new ArrayList<>();
        
        //int Integer
        //double Double
        //boolean Boolean
        List<Integer> numero = new ArrayList<>(); 
        int[] numeros = new int[5];
        
        //add
        
        //nombreLista.add(Dato a pasar)
        
        numeros[0]=cargarNumero("Ingrese un numero:");    
        numeros[1]=1;
        numeros[2]=1;
        numeros[3]=1;
        numeros[4]=1;
                
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miercoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        
        //get traer un valor
        //set cambair valor
        
        
        System.out.println("Elemento en la posicion (0):"+diasDeLaSemana.get(0));
        
        System.out.println("El elemento de la lista numero(0):"+numeros[0]);
        
        int carga;
        boolean ban=true;

        while(ban){
            carga=cargarDatos();
            if (carga==0) {
                ban=false;
            } else {
               numero.add(carga);
            }
        }
        
        System.out.println("Se finalizo el programa");
        
        //size() remplaza  a length
        mostrarLista((ArrayList)numero);
        
    }
    
    public static int cargarNumero(String texto){

        Scanner leer =  new Scanner(System.in);
        System.out.println(texto);
        int numero= leer.nextInt();

        return numero;
    
    }
    
    public static int cargarDatos(){
        
        int carga;
        System.out.println("Cargar un 0 para finalizar");
        carga=cargarNumero("Ingrese el numero a agregar:");
        return carga;
        
    }
    
    public static void mostrarLista(ArrayList numero){
                for (int i = 0; i < numero.size(); i++) {
            
            //para traer el elemento siempre con get
            String texto="El numero en la posicion("+(i+1)+") es: "+numero.get(i);
            System.out.println(texto);
            
        }
    }
    
}