package EjemploPolimorfismo;

import java.util.Scanner;


public abstract class Op_padre {
    
    
    protected int valor1, valor2 ,resultado;
    
    Scanner sn= new Scanner(System.in);
    
    
    
    public void PedirDatos(){
    
        System.out.println("Dame el primero valor ");
        valor1=sn.nextInt();
        
        System.out.println("Dame el segundo valor ");
        valor2=sn.nextInt();
        
        
        
    }
    
    //Generamos solo el metodo con variacioens como operador 
    public abstract void Operaciones();
    
        
    public void mostrarResultado(){
    
        System.out.println(this.resultado);
    
    }
    
}