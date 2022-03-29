package main;

class Camion extends Vehiculo{
    
    private int carga;

    public Camion(int carga, String marca, String combustible) {
        super(marca, combustible);
        this.carga = carga;
    }

    @Override
    public void encender() {
    }

    @Override
    public void acelerar() {
    }

    @Override
    public void frenar() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camion{carga=").append(carga);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
