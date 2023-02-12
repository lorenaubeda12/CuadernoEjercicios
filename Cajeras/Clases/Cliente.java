package Cajeras.Clases;

import java.util.ArrayList;
import java.util.Random;

public class Cliente  extends Thread {
    private String nombre;
    private ArrayList<Integer> carroCompra;
    private int totalProductos;
    private Random geRandom;

    

    public Cliente(String nombre, int totalProductos) {
        this.nombre = nombre;
        this.totalProductos = totalProductos;
        this.geRandom = new Random();
        this.carroCompra= new ArrayList<>();
    }
    


    public String getNombre() {
        return nombre;
    }



    public ArrayList<Integer> getCarroCompra() {
        return carroCompra;
    }



    @Override
    public void run() {
        llenarCarrito();
        
    }


    public void llenarCarrito(){
        for (int i = 0; i < totalProductos; i++) {
            carroCompra.add(geRandom.nextInt(6)+1);
        }
    }
    
}
