
package test;

import clases.Entrenadores;
import clases.Jugadores;
import clases.Muestra;

public class testInterfaces {


    
    public static void main(String[] args) {
        
        
        Jugadores j1= new Jugadores("Enzo Perez","River");
        
        Entrenadores e1= new Entrenadores("Gallardo","River");
        
        String j1Text=j1.Impresion();
        
        String e1Text=e1.Impresion();
        
        System.out.println(e1Text);
        
        System.out.println(j1Text);
        
        j1.Transferencia();
        e1.Transferencia();
        
        Muestra m1 = new Muestra(j1);
        Muestra m2 = new Muestra(e1);
        
        
        
        System.out.println("-----------------------------------------");
        
        
        
        
        m1.muestreo();
        m2.muestreo();
        
        
        
   
    }
    
}
