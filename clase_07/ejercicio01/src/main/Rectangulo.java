package main;

public class Rectangulo extends Figuras{
    
    public int ladoHorizontal;
    public int ladoVertical;
    public static int contadorRectangulos;
    public int idRectangulo;

    public Rectangulo(int ladoHorizontal, int ladoVertical) {
        super();
        this.idRectangulo=++Rectangulo.contadorRectangulos;
        this.ladoHorizontal = ladoHorizontal;
        this.ladoVertical = ladoVertical;
        
    }

    
    @Override
    public void area() {
        int area = this.ladoHorizontal * this.ladoVertical;
        System.out.println("El area del rectanfulo es: " + area);
    }

    @Override
    public void perimetro() {
        int perimetro = (this.ladoHorizontal) + (this.ladoVertical);
        System.out.println("El perimetro es: " + perimetro);
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{ladoHorizontal=").append(ladoHorizontal);
        sb.append(", ladoVertical=").append(ladoVertical);
        sb.append(", idRectangulo=").append(idRectangulo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
