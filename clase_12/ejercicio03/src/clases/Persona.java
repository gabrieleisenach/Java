package clases;

import java.util.Random;

public class Persona {
    
    private int primeraTirada;
    private int segundaTirada;
    private int terceraTirada;
    private String nombreJugador;
    private int tirada;

    public Persona(String nombreJugador) {
        Random r1= new Random();
        this.primeraTirada = r1.nextInt(1,7);
        this.segundaTirada = r1.nextInt(1,7);
        this.terceraTirada = r1.nextInt(1,7);
        this.nombreJugador = nombreJugador;
        this.tirada = this.primeraTirada + this.segundaTirada + this.terceraTirada;
    }

    public int getTirada() {
        return tirada;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Jugador: ").append(nombreJugador);
        sb.append(", Primera tirada: ").append(primeraTirada);
        sb.append(", Segunda tirada: ").append(segundaTirada);
        sb.append(", Tercera tirada: ").append(terceraTirada);
        sb.append(", Suma: ").append(tirada);
        sb.append('}');
        return sb.toString();
    }
}
