package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio2 extends Ejercicios{
    
    int calificacion1;
    int calificacion2;
    int calificacion3;
    int calificacion4;
    int calificacion5;
    StringBuilder calificacionesIngresadas = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio2(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.calificacion1 = super.ingresarNumeroEntero("Ingrese la primer calificacion: ");
        this.calificacion2 = super.ingresarNumeroEntero("Ingrese la segunda calificacion: ");
        this.calificacion3 = super.ingresarNumeroEntero("Ingrese la tercera calificacion: ");
        this.calificacion4 = super.ingresarNumeroEntero("Ingrese la cuarta calificacion: ");
        this.calificacion5 = super.ingresarNumeroEntero("Ingrese la quinta calificacion: ");
        this.calificacionesIngresadas = calificacionesIngresadas;
        this.respuesta = respuesta;
    }

    @Override
    public void respuesta(){
        
        int lista[] = {this.calificacion1,this.calificacion2,this.calificacion3,this.calificacion4,this.calificacion5};
        String stringLista[] = {"primera calificacion = ", ", segunda calificacion = ", ", tercera calificacion = ", ", cuarta calificacion = ", ", quinta calificacion = "};

        for (int i = 0; i < lista.length; i++) {
            this.calificacionesIngresadas.append(stringLista[i]);
            this.calificacionesIngresadas.append(lista[i]);
        }
        double promedio = (this.calificacion1+this.calificacion2+this.calificacion3+this.calificacion4+this.calificacion5)/(lista.length);
        this.respuesta.append("El promedio del alumno es "+promedio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCalificaciones ingresadas: "+this.calificacionesIngresadas+"\n");
        sb.append("Respuesta: "+this.respuesta+"\n");
        return sb.toString();
    }

}
