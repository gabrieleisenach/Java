package operaciones;

public class Division extends Operaciones{
    
    public Division() {
        respuesta();
    }

    @Override
    public void respuesta() {
        this.numero1 = super.ingresarDouble("Ingrese el primer numero: ");
        this.numero2 = super.ingresarDouble("Ingrese el segundo numero: ");
        this.resultado = this.numero1 / this.numero2;
    }

    public double getResultado() {
        return this.resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operacion: Division, ");
        sb.append(super.toString());
        if (this.numero2 != 0) {
            sb.append(", Resultado de la division: ").append(resultado);
        } else {
            sb.append(", Resultado de la division: Error!!! No se puede dividir por 0");
        }
        return sb.toString();
    }
}
