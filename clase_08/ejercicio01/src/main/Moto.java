package main;

class Moto extends Vehiculo{
    
    private int cilindrada;

    public Moto(int cilindrada, String marca, String combustible) {
        super(marca, combustible);
        this.cilindrada = cilindrada;
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
        sb.append("Moto{cilindrada=").append(cilindrada);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
