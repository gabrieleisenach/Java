package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio6 extends Ejercicios{
    
    int datosA;
    int datosB;

    StringBuilder listaIngresada = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio6(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.datosA = super.ingresarNumeroEntero("Ingrese el primer numero: ");
        this.datosB = super.ingresarNumeroEntero("Ingrese el segundo numero: ");
        this.listaIngresada = listaIngresada;
        this.respuesta = respuesta;
    }
    
    @Override
    public void respuesta(){
        
        int lista[] = {this.datosA,this.datosB};
        String stringLista[] = {"datosA = ", "datosB = "};
        for (int i = 0; i < lista.length; i++) {
            this.listaIngresada.append(stringLista[i]);
            this.listaIngresada.append(lista[i]+", ");
        }
        double suma = this.datosA + this.datosB;
        double resta = this.datosA - this.datosB;
        double multiplicacion = this.datosA * this.datosB;
        double division = 0;
        try {
            division = this.datosA / this.datosB;
        } catch (ArithmeticException error){
            System.out.println("Error. No puede dividir por 0");
        }
        double resto = 0;
        try {
            resto = this.datosA % this.datosB;
        } catch (ArithmeticException error){
            System.out.println("Error. No puede dividir por 0");
        }        
        double listaRespuesta[] = {suma, resta, multiplicacion, division, resto};
        String stringListaRespuesta[] = {"\tLa suma de los numeros ingrasados es ", ", \n\t\tLa resta de los numeros ingrasados es ", ", \n\t\tLa multiplicacion de los numeros ingrasados es ", ", \n\t\tLa division de los numeros ingrasados es ", ", \n\t\tEl resto de los numeros ingrasados es "};
        for (int i = 0; i < listaRespuesta.length; i++) {
            this.respuesta.append(stringListaRespuesta[i]);
            this.respuesta.append(listaRespuesta[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nLista ingresada: "+this.listaIngresada+"\n");
        sb.append("Respuesta: "+this.respuesta+"\n");
        return sb.toString();
    }

}