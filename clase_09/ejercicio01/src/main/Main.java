package main;

import herencias.JuguetesPadre;
import herencias.JuguetesSport;

public class Main {

    public static void main(String[] args) {
        
        JuguetesPadre js1 = new JuguetesSport("Cuero","Blanca",600);
        js1.vidaUtil();
        JuguetesPadre js2 = new JuguetesSport("Cuero","Blanca",300);
        js2.vidaUtil();
        JuguetesPadre js3 = new JuguetesSport("Cuero","Blanca",100);
        js3.vidaUtil();
    }
    
}
