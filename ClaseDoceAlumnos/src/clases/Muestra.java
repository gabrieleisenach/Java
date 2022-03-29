
package clases;

import interfaces.ICasoImpresora;


public class Muestra {
    
    //Campos
    
    private ICasoImpresora imprimir;

    public Muestra(ICasoImpresora imprimir) {
        this.imprimir = imprimir;
    }

    
    
    
    public ICasoImpresora getImprimir() {
        return imprimir;
    }

    public void setImprimir(ICasoImpresora imprimir) {
        this.imprimir = imprimir;
    }
    
    
    public void  muestreo(){

        System.out.println(this.imprimir.Impresion());
    
    }
    
    
    
    
}
