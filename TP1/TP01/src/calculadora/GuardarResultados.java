package calculadora;

import java.util.*;
import operaciones.Operaciones;

public class GuardarResultados {
    public static void guardarResultado(List lista, Operaciones operacion) {
        lista.add(operacion);
    }
    
    public static void mostrarResultados(List lista) {
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
