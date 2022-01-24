/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author gaboh
 */
public class duke {
    
    //Creamos una clase dukes para su ropa
    //la misma tiene stock nombrePrenda precio
    //tiene metodo que no recibe argumentos y devuelve los datos de la prenda
    
    //Campos
    
    private int stock;
    private String nombrePrenda;
    private double precio;

    public duke(int stock, String nombrePrenda, double precio) {
        this.stock = stock;
        this.nombrePrenda = nombrePrenda;
        this.precio = precio;
    }
    
    //Metodo
    public void display(){
        
        System.out.printf("Stock: %s\nNombre de la prenda: %s\nPrecio: %s\n",this.stock,this.nombrePrenda,this.precio);

    }
    
    
}
