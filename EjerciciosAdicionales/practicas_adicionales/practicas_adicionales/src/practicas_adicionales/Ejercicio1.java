package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio1 extends Ejercicios{
    
    int datosA;
    int datosB;
    int datosC;
    int datosD;
    StringBuilder listaIngresada = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio1(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.datosA = super.ingresarNumeroEntero("Ingrese el primer numero: ");
        this.datosB = super.ingresarNumeroEntero("Ingrese el segundo numero: ");
        this.datosC = super.ingresarNumeroEntero("Ingrese el tercer numero: ");
        this.datosD = super.ingresarNumeroEntero("Ingrese el cuarto numero: ");
        this.listaIngresada = listaIngresada;
        this.respuesta = respuesta;
    }
    
    @Override
    public void respuesta(){
        
        int lista[] = {this.datosA,this.datosB,this.datosC,this.datosD};
        String stringLista[] = {"datosA = ", "datosB = ", "datosC = ", "datosD = "};
        for (int i = 0; i < lista.length; i++) {
            this.listaIngresada.append(stringLista[i]);
            this.listaIngresada.append(lista[i]+", ");
        }
        for (int i = (lista.length)-1; i >= 0; i--) {
            this.respuesta.append(stringLista[i]);
            this.respuesta.append(lista[i]+", ");
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
