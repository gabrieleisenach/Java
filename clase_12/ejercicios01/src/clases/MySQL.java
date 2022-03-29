package clases;

import interfases.ITablas;
import interfases.ITipoBD;

public class MySQL implements ITipoBD, ITablas{
    
    private String columnas;

    public MySQL(String columnas) {
        this.columnas = columnas;
    }

    public String getColumnas() {
        return columnas;
    }

    public void setColumnas(String columnas) {
        this.columnas = columnas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MySQL{columnas=").append(columnas);
        sb.append('}');
        return sb.toString();
    }
    
    
    @Override
    public void muestreoTipoBD() {
        System.out.println("Base de datos relacional");
    }

    @Override
    public String columnas() {
        return this.columnas;
    }

}
