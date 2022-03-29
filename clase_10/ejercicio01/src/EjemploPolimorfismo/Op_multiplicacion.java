package EjemploPolimorfismo;


public class Op_multiplicacion extends Op_padre{

    @Override
    public void Operaciones() {
        resultado=this.valor1 * this.valor2;
        
        System.out.println("El resultado de la multiplicacion es:"+resultado);
    }
    
    
    
}