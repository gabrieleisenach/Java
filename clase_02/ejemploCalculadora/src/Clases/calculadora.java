package Clases;

public class calculadora {
    
    //Campos
    
    public double n1;
    public double n2;

    public calculadora(double n1, double n2) {
        n1 = this.n1;
        n2 = this.n2;
    }
    
    public static void suma(double n1, double n2){
        
        double suma=n1+n2;
        
        System.out.println(suma);
                
    }

       public static void resta(double n1, double n2){
        
        double resta=n1-n2;
        
        System.out.println(resta);
                
    } 
    
    public static void division(double n1, double n2){
        
        double division=n1/n2;
        
        System.out.println(division);
                
    }

    public static void multiplicacion(double n1, double n2){
        
        double multiplicacion=n1*n2;
        
        System.out.println(multiplicacion);
                
    }
       
}
