package main;

public class Triangulo extends Figuras{
    
    public int lado1;
    public int lado2;
    public int lado3;
    public static int contadoorTriangulos;
    public int idTriangulos;

    public Triangulo(int lado1, int lado2, int lado3) {
        super();
        this.idTriangulos=++Triangulo.contadoorTriangulos;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    

    @Override
    public void area() {
        int semiperimetro = (this.lado1 + this.lado2 + this.lado3)/2;
        int areapreliminar = semiperimetro * (semiperimetro - this.lado1) * (semiperimetro - this.lado2) * (semiperimetro - this.lado3);
        double area = Math.sqrt(areapreliminar);
        System.out.println("El area del triangulo es es: " + area);
    }

    @Override
    public void perimetro() {
        int perimetro = this.lado1 + this.lado2 + this.lado3;
        System.out.println("El perimetro del triangulo es: " + perimetro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangulo{lado1=").append(lado1);
        sb.append(", lado2=").append(lado2);
        sb.append(", lado3=").append(lado3);
        sb.append(", idTriangulos=").append(idTriangulos);
        sb.append('}');
        return sb.toString();
    }
    
    
}
