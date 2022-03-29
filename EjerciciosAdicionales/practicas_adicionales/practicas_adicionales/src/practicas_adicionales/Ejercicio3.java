package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio3 extends Ejercicios{
    
    double sueldoPorHora;
    double horasTrabajadas;
    StringBuilder datos = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio3(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.sueldoPorHora = super.ingresarNumeroFlotante("Ingrese el valor de la hora trabajada: ");
        this.horasTrabajadas = super.ingresarNumeroFlotante("Ingrese la cantidad de horas trabajadas: ");
        this.datos = datos;
        this.respuesta = respuesta;
    }

    @Override
    public void respuesta(){
        
        double lista[] = {this.sueldoPorHora,this.horasTrabajadas};
        String stringLista[] = {"Valor de la hora trabajada = ", ", Cantidad de horas trabajadas = "};

        for (int i = 0; i < lista.length; i++) {
            this.datos.append(stringLista[i]);
            this.datos.append(lista[i]);
        }
        double sueldo = this.sueldoPorHora*this.horasTrabajadas;
        this.respuesta.append("El sueldo bruto del empleado es "+sueldo+"$");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDatos ingresados: "+this.datos+"\n");
        sb.append("Respuesta: "+this.respuesta+"\n");
        return sb.toString();
    }

}
