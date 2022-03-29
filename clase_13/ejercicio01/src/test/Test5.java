package test;

public class Test5 {
    public static void main(String[] args) {
        Integer[] lista = {1,2,3,4,5};
        Integer[] potencia = new Integer[5];
        
        for (int i = 0; i < potencia.length; i++) {
//            potencia[i] = lista[i] * lista[i];
            potencia[i] = (int)Math.pow(lista[i], 2);
        }
        
        for (int i = 0; i < potencia.length; i++) {
            System.out.println("La potencia de " + lista[i] + " es: " + potencia[i]);
        }
    }
    
}
