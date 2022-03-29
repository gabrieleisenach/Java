package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        List<Integer> listaNumeros=new ArrayList<>();

        boolean ban=true;
        
        while(ban){
            
            String stringAgregar=ingresarNumero();
            if (stringAgregar!="") {
                int numeroAgregar=Integer.parseInt(stringAgregar);
                listaNumeros.add(numeroAgregar);
            } else {
                ban=false;
            }

        }

        System.out.println("Lista sin ordenar\n"+listaNumeros);
        burbuja(listaNumeros);
        System.out.println("Lista ordenada\n"+listaNumeros);        

    }
    
    public static String ingresarNumero(){
        
        Scanner leer=new Scanner (System.in);
        System.out.print("Ingrese un numero o presione Enter para finalizar: ");
        String numero=leer.nextLine();
        return numero;
    }

    public static void burbuja (List lista){

        int cuentaintercambios=0;
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.size()-1;i++){
                if ((int) lista.get(i)>(int) lista.get(i+1)){
                    int variableauxiliar=(int) lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, variableauxiliar);
                    cuentaintercambios++;
                }
            }
            if (cuentaintercambios==0){
                ordenado=true;
            }
            cuentaintercambios=0;
        }
    }
    
}
