package EjemploPolimorfismo;


public class Op_resta extends Op_padre{

    @Override
    public void Operaciones() {
        resultado=this.valor1 - this.valor2;
        
        System.out.println("El resultado de la resta es:"+resultado);
    }
    
    
    
}