
package clases;

//Implementacion

import interfaces.ICambioDeClub;
import interfaces.ICasoImpresora;

//public class nombreClase implements nombreInteface
public class Jugadores implements ICasoImpresora,ICambioDeClub{
    
    private String nombre;
    private String equipo;

    public Jugadores(String nombre, String equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugadores{");
        sb.append("nombre=").append(nombre);
        sb.append(", equipo=").append(equipo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String Impresion() {

        
        String texto="El jugador("+this.nombre+") pertenece a:"+this.equipo;
        return texto;

    }

    @Override
    public void Transferencia() {
        
           String texto = "El Jugador(" + this.nombre + ") fue transferido a:Barracas";
           System.out.println(texto);

    }
    
   
    
    
    
    
    
    
    
}
