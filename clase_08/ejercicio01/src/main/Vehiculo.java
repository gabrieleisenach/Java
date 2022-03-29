package main;

public abstract class Vehiculo {
    
    protected String marca;
    protected String combustible;

    public Vehiculo(String marca, String combustible) {
        this.marca = marca;
        this.combustible = combustible;
    }
    
    public abstract void encender();
    
    public abstract void acelerar();
    
    public abstract void frenar();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{marca=").append(marca);
        sb.append(", combustible=").append(combustible);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
