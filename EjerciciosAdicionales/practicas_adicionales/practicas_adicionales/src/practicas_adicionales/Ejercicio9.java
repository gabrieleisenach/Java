package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio9 extends Ejercicios{
    
    double numero1;
    double numero2;
    double numero3;
    StringBuilder numerosIngresados = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio9(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.numero1 = super.ingresarNumeroFlotante("Ingrese primer numero: ");
        this.numero2 = super.ingresarNumeroFlotante("Ingrese segundo numero: ");
        this.numero3 = super.ingresarNumeroFlotante("Ingrese tercer numero: ");
        this.numerosIngresados = numerosIngresados;
        this.respuesta = respuesta;
    }

    @Override
    public void respuesta(){
        double lista[] = {this.numero1, this.numero2, this.numero3};
        String stringLista[] = {"Numero 1 = ", ", Numero 2 = ", ", Numero 3 = "};
        for (int i = 0; i < lista.length; i++) {
            this.numerosIngresados.append(stringLista[i]);
            this.numerosIngresados.append(lista[i]);
        }
        double suma = this.numero1 + this.numero2 + this.numero3;
        double promedio = suma / (lista.length);
        double listaRespuesta[] = {suma, promedio};
        String stringListaRespuesta[] = {"La suma de los numero ingresados es = ", ", El promedio de los numeros ingresados es = "};
        for (int i = 0; i < listaRespuesta.length; i++) {
            this.respuesta.append(stringListaRespuesta[i]);
            this.respuesta.append(listaRespuesta[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumeros ingresados : "+this.numerosIngresados+"\n");
        sb.append("Respuesta: "+this.respuesta+"\n");
        return sb.toString();
    }

}
