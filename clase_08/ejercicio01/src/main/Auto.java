package main;

public class Auto extends Vehiculo{
    
    private int kilometros;

    public Auto(int kilometros, String marca, String combustible) {
        super(marca, combustible);
        this.kilometros = kilometros;
    }
    
    @Override
    public void encender() {
        System.out.println("Se encendio Auto");
    }

    @Override
    public void acelerar() {
        System.out.println("Se acelero Auto");
    }

    @Override
    public void frenar() {
        System.out.println("Se freno Auto");
    }

    public int getKilometros() {
        return kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public String getCombustible() {
        return combustible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto");
        sb.append(super.toString());
        sb.append("\b, kilometros=").append(kilometros);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
