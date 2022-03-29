package operaciones;

public class Suma extends Operaciones{
    
    public Suma() {
        respuesta();
    }

    @Override
    public void respuesta() {
        this.numero1 = super.ingresarDouble("Ingrese el primer numero: ");
        this.numero2 = super.ingresarDouble("Ingrese el segundo numero: ");
        this.resultado = this.numero1 + this.numero2;
    }

    public double getResultado() {
        return this.resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operacion: Suma, ");
        sb.append(super.toString());
        sb.append(", Resultado de la suma: ").append(resultado);
        return sb.toString();
    }

}
