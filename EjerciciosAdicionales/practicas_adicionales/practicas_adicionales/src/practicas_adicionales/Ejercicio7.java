package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio7 extends Ejercicios{
    
    double costo;
    StringBuilder costoIngresado = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio7(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.costo = super.ingresarNumeroFlotante("Ingrese el costo del producto: ");
        this.costoIngresado = costoIngresado;
        this.respuesta = respuesta;
    }

    @Override
    public void respuesta(){
        double lista[] = {this.costo};
        for (int i = 0; i < lista.length; i++) {
            this.costoIngresado.append(lista[i]);
        }
        double precioVenta = (this.costo * 0.15)+this.costo;
        double listaRespuesta[] = {precioVenta};
        String stringListaRespuesta[] = {"El precio de venta es "};
        for (int i = 0; i < listaRespuesta.length; i++) {
            this.respuesta.append(stringListaRespuesta[i]);
            this.respuesta.append(listaRespuesta[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEl costo del producto es : "+this.costoIngresado+"$\n");
        sb.append("Respuesta: "+this.respuesta+"$\n");
        return sb.toString();
    }

}
