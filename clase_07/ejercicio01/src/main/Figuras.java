package main;

public abstract class Figuras {
    
    public int validacion;

    public Figuras() {
        this.validacion = 0;
    }
    
    public abstract void area();
    
    public abstract void perimetro();

    @Override
    public String toString() {
        return "Figuras{" + '}';
    }
    

    
}
