package Clases;

public class Rectangulo extends Figura {
    
    public static int contadorRectangulo;
    public int idRectangulo;
    public int ladosHorizontales;
    public int ladosVerticales;

    public Rectangulo(int idRectangulo, int ladosHorizontales, int ladosVerticales) {
        this.idRectangulo = ++Rectangulo.contadorRectangulo;
        this.ladosHorizontales = ladosHorizontales;
        this.ladosVerticales = ladosVerticales;
    }
    
    @Override
    public void Area(){
        
        int area=this.ladosHorizontales*this.ladosVerticales;
        return area
        
    }
    
}
