package clases;

public class Entrenadores {
    
    private String nombre;
    private String equipo;

    public Entrenadores(String nombre, String equipo) {
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
        sb.append("Jugadores{nombre=").append(nombre);
        sb.append(", equipo=").append(equipo);
        sb.append('}');
        return sb.toString();
    }
    
    
            
    
    
}
