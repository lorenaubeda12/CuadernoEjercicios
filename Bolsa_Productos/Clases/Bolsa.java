package Bolsa_Productos.Clases;

import java.util.ArrayList;

public class Bolsa {
    private ArrayList<Producto> productos;

    public void anyadirArticulos(Producto producto) {
        this.productos.add(producto);
    }

    public int getTamañoBolsa() {
        return this.productos.size();
    }

    public boolean estaLlena() {
        return productos.size()>5;
    }

    public ArrayList<Producto>getProducto(){
        return productos;
    }

}
