package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        List<Figuras>listaFiguras = new ArrayList<>();
        cargarLista(listaFiguras);
        mostrarLista(listaFiguras);
        
        
        
    }
    
    public static int cargarLados (String texto){
        
        Scanner consola = new Scanner(System.in);
        System.out.println(texto);
        int lado = consola.nextInt();
        return lado;
    }
    
    public static Figuras cargarFigura(){
        
        int lado1;
        int lado2;
        int lado3;
        
        String texto = "Ingrese:\n"
                +"(1) para Triangulo\n"
                +"(2) para un rectangulo\n"
                +"-------------------------------\n";
        int opcion = cargarLados(texto);
        switch(opcion){
            case 1:
                lado1 = cargarLados("Ingrese el lado 1 del triangulo: ");
                lado2 = cargarLados("Ingrese el lado 2 del triangulo: ");
                lado3 = cargarLados("Ingrese el lado 3 del triangulo: ");
                Figuras t1 = new Triangulo(lado1, lado2, lado3);
                return t1;
            
            case 2:
                lado1 = cargarLados("Ingrese el lado vertical del rectangulo: ");
                lado2 = cargarLados("Ingrese el lado horizontal del rectangulo: ");
                Figuras r1 = new Rectangulo(lado1, lado2);
                return r1;
        
            default:
                System.out.println("Ingreso mal los datos");
                Figuras f1 = new Rectangulo(1,2);
                f1.validacion = 1;
                return f1;

        }

    }
    
    public static void cargarLista(List lista){
        
        boolean flag = true;
        System.out.println("Ingrese 0 para cortar o ingrese cualquier numero para seguir cargando figuras: ");

        int opcion = 1;
        while(flag){
            if (opcion !=0) {
                Figuras f1 = cargarFigura();
                if (f1.validacion == 0) {
                    lista.add(f1);

                } else {
                    continue;
                }

            } else {
                flag = false;
            }
            opcion = cargarLados("Ingrese cualquier numero para seguir o 0 para finalezar");
             
        }

    }
    
    public static void mostrarLista(List lista){
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
            
        }

    }
    
}
