package EjemploPolimorfismo;


public class Op_suma extends Op_padre{
    //Rescribiendo o cambiando el contenido a un metodo/funcion de una clase superior
    
    
    
    @Override
    public void Operaciones() {

            resultado= this.valor1+this.valor2;
            System.out.println("La suma nos deja como resultado:"+resultado);
    }
    
}