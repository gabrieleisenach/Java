package Test;

import javax.swing.JOptionPane;

public class ejercicio06 {
    public static void main(String[] args) {
        String texto = ingresarTexto();
        String textoInvertido = invertirTexto(texto);
        palindromo(texto,textoInvertido);
        
    }
    
    public static String ingresarTexto() {
        String stringTexto = JOptionPane.showInputDialog("Ingrese el texto:");
        return stringTexto;
    }
    
    public static String invertirTexto(String texto) {
        StringBuilder sb = new StringBuilder();
        for (int i = (texto.length())-1; i >= 0; i--) {
            sb.append(texto.charAt(i));
        }
        JOptionPane.showMessageDialog(null, texto + "\n" + sb);
        return String.valueOf(sb);
    }
    
    public static void palindromo(String texto, String textoInvertido) {
        boolean ingresoTexto = esUnTexto(texto);
        if (ingresoTexto) {
            JOptionPane.showMessageDialog(null, "Error!!! Ingreso un texto");
        } else if ((texto.toLowerCase()).equals(textoInvertido.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Es un Palindromo");
        } else {
            JOptionPane.showMessageDialog(null, "No es un Palindromo");
        }
    }
    
    public static boolean esUnTexto (String texto) {
        boolean ingresoTexto = false;
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            if (caracter == ' ') {
                ingresoTexto = true;
            }
        }
        return ingresoTexto;
    }
}
