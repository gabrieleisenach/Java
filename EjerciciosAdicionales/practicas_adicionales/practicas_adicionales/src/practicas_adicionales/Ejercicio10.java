package practicas_adicionales;

/**
 *
 * @author Gabriel Eisenach
 */
public class Ejercicio10 extends Ejercicios{
    
    String apellido1;
    String apellido2;
    String apellido3;
    StringBuilder listaApellidos = new StringBuilder();
    StringBuilder respuesta = new StringBuilder();

    public Ejercicio10(String consigna) {
        super(consigna);
        System.out.println(super.toString());
        this.apellido1 = super.ingresarString("Ingrese el primer apellido: ");
        this.apellido2 = super.ingresarString("Ingrese el segundo apellido: ");
        this.apellido3 = super.ingresarString("Ingrese el tercer apellido: ");
        this.listaApellidos = listaApellidos;
        this.respuesta = respuesta;
    }
    
    @Override
    public void respuesta(){
        String lista[] = {this.apellido1,this.apellido2,this.apellido3};
        String stringLista[] = {"Apellido 1 = ", ", Apellido 2 = ", ", Apellido 3 = "};
        for (int i = 0; i < lista.length; i++) {
            this.listaApellidos.append(stringLista[i]);
            this.listaApellidos.append(lista[i]);
        }
        burbuja(lista);
        for (int i = 0; i < lista.length; i++) {
            this.respuesta.append(stringLista[i]);
            this.respuesta.append(lista[i]);
        }
    }
    
    public static void burbuja (String[] lista){
        int cuentaintercambios=0;
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.length-1;i++){
                if (lista[i].compareToIgnoreCase(lista[i+1])>0){
                    String aux=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=aux;
                    cuentaintercambios++;
                }
            }
            if (cuentaintercambios==0){
                ordenado=true;
            }
            cuentaintercambios=0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nLista de apellidos ingresada: "+this.listaApellidos+"\n");
        sb.append("Respuesta:\nLista de apellidos ordenada alfabeticamente: "+this.respuesta+"\n");
        return sb.toString();
    }

}