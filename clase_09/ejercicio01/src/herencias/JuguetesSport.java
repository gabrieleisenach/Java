package herencias;

public class JuguetesSport extends JuguetesPadre{

    public JuguetesSport(String material, String color, int precio) {
        super(material, color, precio);
    }

    @Override
    public void vidaUtil() {
        if (super.precio > 500){
            System.out.println("Es de mucha vida util");
        } else if (super.precio > 250 && super.precio < 500){
            System.out.println("Es de media vida util");
        } else {
            System.out.println("Es de corta vida util");
        }
    }

    @Override
    public void sonido() {

    }

    @Override
    public void encedido() {

    }
    
    
    
}
