package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio8 extends Ejercicios{
    
    double precio;
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio8(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.precio = super.ingresarNumeroFlotante("Ingrese el precio del producto: ");
        this.respuesta = respuesta;
    }

    @Override
    public void respuesta(){
        double precioFinal;
        String descuento;
        if (this.precio > 1500) {
            precioFinal = this.precio - (this.precio * 0.1);
            descuento = ", Descuento del 10%";
        } else {
            precioFinal = this.precio;
            descuento = ", Sin descuento";
        }
        this.respuesta.append("Precio final: "+precioFinal+"$");
        this.respuesta.append(descuento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPrecio ingresado: "+this.precio+"$\n");
        sb.append("Respuesta: "+this.respuesta+"\n");
        return sb.toString();
    }

}
