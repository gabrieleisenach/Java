package herencias;


public abstract class JuguetesPadre {
    
    //Si nuestra clase no tiene clases hijas usamos el private
    //Si tiene clases hijas usamos el protected
    //Clase abstracta no se representa por si misma sino que engloba a las clases hijas 
    
    //Campos 
    protected String material;
    protected String color;
    protected int precio;

    //Constructor
    public JuguetesPadre(String material, String color, int precio) {
        this.material = material;
        this.color = color;
        this.precio = precio;
    }

    
    //Metodos
    public abstract void vidaUtil();
    
    public abstract void sonido();
    
    public  abstract void encedido();
    
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Juguetes:");
        sb.append("material=").append(material);
        sb.append(", color=").append(color);
        sb.append(", precio=").append(precio);
        sb.append(" ");
        return sb.toString();
    }
    
}