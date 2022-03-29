package test;

import clases.ComunityServer;
import clases.MongoDB;
import clases.MySQL;

public class TestBD {
    public static void main(String[] args) {
        ComunityServer comunityServer = new ComunityServer("Comunity Server");
        comunityServer.muestreoTipoBD();
        String columnas = comunityServer.columnas();
        System.out.println("columnas = " + columnas);
        
        MySQL mySQL = new MySQL("MySQL");
        mySQL.muestreoTipoBD();
        columnas = mySQL.columnas();
        System.out.println("columnas = " + columnas);
        
        MongoDB mongoDB = new MongoDB("Mongo DB");
        mongoDB.muestreoTipoBD();
        columnas = mongoDB.columnas();
        System.out.println("columnas = " + columnas);
        
        
    }
    
}
