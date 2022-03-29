package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio5 extends Ejercicios{
    
    double base;
    double altura;
    StringBuilder lados = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio5(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.base = super.ingresarNumeroFlotante("Ingrese la base del rectangulo: ");
        this.altura = super.ingresarNumeroFlotante("Ingrese la altura del rectangulo: ");
        this.lados = lados;
        this.respuesta = respuesta;
    }
    
    @Override
    public void respuesta(){
        
        double lista[] = {this.base,this.altura};
        String stringLista[] = {"Base = ", ", Altura = "};
        for (int i = 0; i < lista.length; i++) {
            this.lados.append(stringLista[i]);
            this.lados.append(lista[i]+", ");
        }
        double perimetro = (this.base *2) + (this.altura *2);
        double superficie = this.base * this.altura;
        double listaRespuesta[] = {perimetro, superficie};
        String stringListaRespuesta[] = {"El perimetro del rectangulo es ", ", La superficie del rectangulo es ", "cm", "cm²"};
        for (int i = 0; i < listaRespuesta.length; i++) {
            this.respuesta.append(stringListaRespuesta[i]);
            this.respuesta.append(listaRespuesta[i]+stringListaRespuesta[i+2]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nLados Ingresados: "+this.lados+"\n");
        sb.append("Respuesta: "+this.respuesta+"\n");
        return sb.toString();
    }

}