package Test;

import javax.swing.JOptionPane;

public class ejercicio05 {
    public static void main(String[] args) {
        char [] listaVocales = {'a','e','i','o','u'};
        caracterValido(listaVocales);

    }
    
    public static void caracterValido(char lista[]){
        boolean flag = true;
        while(flag){
            String stringRespuesta = JOptionPane.showInputDialog("Ingrese una vocal:");
            stringRespuesta = stringRespuesta.toLowerCase();
            if (stringRespuesta.length() == 1) {
                for (int i = 0; i < stringRespuesta.length(); i++) {
                    char respuestaCaracter = stringRespuesta.charAt(0);
                    if (respuestaCaracter == lista[i]){
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
                        flag = false;
                    }
                }
            }
        }
    }
}
