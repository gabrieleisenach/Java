package main;

import clases.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Hernan");
        Persona persona2 = new Persona("Gabriel");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        if (persona1.getTirada() > persona2.getTirada()) {
            System.out.println("El ganador es: " + persona1.getNombreJugador());
        } else if (persona1.getTirada() < persona2.getTirada()) {
            System.out.println("El ganador es: " + persona2.getNombreJugador());
        } else {
            System.out.println("EMPATE!!!");
        }
        
    }
    
}
