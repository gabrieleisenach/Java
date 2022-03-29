package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio4 extends Ejercicios{
    
    int numeroEntero;
    StringBuilder numeroIngresado = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio4(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.numeroEntero = super.ingresarNumeroEntero("Ingrese un numero Entero: ");
        this.numeroIngresado = numeroIngresado;
        this.respuesta = respuesta;
    }

    @Override
    public void respuesta(){
        
        int lista[] = {this.numeroEntero};
        for (int i = 0; i < lista.length; i++) {
            this.numeroIngresado.append(lista[i]);
        }
        double cuadrado = Math.pow(this.numeroEntero,2);
        double cubo = Math.pow(this.numeroEntero,3);
        double listaRespuesta[] = {cuadrado, cubo};
        String stringListaRespuesta[] = {"El cuadrado de ", ", El cubo de "};
        for (int i = 0; i < listaRespuesta.length; i++) {
            this.respuesta.append(stringListaRespuesta[i]+this.numeroEntero+" es ");
            this.respuesta.append(listaRespuesta[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEl numero ingresado es: "+this.numeroIngresado+"\n");
        sb.append("Respuesta: "+this.respuesta+"\n");
        return sb.toString();
    }

}
