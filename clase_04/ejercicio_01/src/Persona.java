public class Persona {
    
    public String nombre;
    public int categoria;
    public int sueldoInicial;
    public double sueldoFinal;

    public Persona(String nombre, int categoria, int sueldoInicial, double sueldoFinal) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.sueldoInicial = sueldoInicial;
        this.sueldoFinal = sueldoFinal;
    }

   
public double calcularAumento(){

    switch(this.categoria){
        
        case 1:
            this.sueldoFinal=(this.sueldoInicial*0.2)+sueldoInicial;
            break;
        case 2:
            this.sueldoFinal=(this.sueldoInicial*0.15)+sueldoInicial;
            break;
        case 3:
            this.sueldoFinal=(this.sueldoInicial*0.1)+sueldoInicial;
            break;
        case 4:
            this.sueldoFinal=(this.sueldoInicial*0.05)+sueldoInicial;
            break;
        case 5:
            this.sueldoFinal=sueldoInicial;
            break;
        default:
            this.sueldoFinal=0;
            
        }
    return this.sueldoFinal;
        
    }

}
    
