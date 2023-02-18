package Almacen.Clases;

public class Almacen extends Thread {
    private int inventario;
    private boolean quedaInventario;
    private boolean tiendaOcupada;

    public Almacen() {
        this.inventario = 50;
        this.quedaInventario = true;
        this.tiendaOcupada = false;
    }

    public synchronized void comprar(Comprador cliente) {
        
        if (this.inventario > 0 && this.inventario - 1 > 0) {
            this.quedaInventario = true;
            this.inventario -= 1;
            System.out.println("Almacen: mi inventario es de : "+this.inventario);
            cliente.setHeComprado(true);

        } else if (this.inventario > 0 && this.inventario - 1 == 0) {
            this.quedaInventario = false;
            this.inventario = 0;
            System.out.println("Almacen: mi inventario es de : "+this.inventario);
            cliente.setHeComprado(true);
        } else {
            this.inventario = 0;
            this.quedaInventario = false;
            System.out.println("Almacen: mi inventario es de : "+this.inventario);
            cliente.setHeComprado(false);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
        String nombre= "Comprador numero "+i;
        Comprador comprador= new Comprador(nombre, this);
        comprador.start();
        }
    }

    public synchronized boolean estaOcupada() {
        return this.tiendaOcupada;
    }

    public synchronized void setTiendaOcupada(boolean tiendaOcupada) {
        this.tiendaOcupada = tiendaOcupada;
    }


    
}
