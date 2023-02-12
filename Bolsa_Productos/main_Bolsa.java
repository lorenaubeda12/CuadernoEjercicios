package Bolsa_Productos;

import Bolsa_Productos.Clases.Bolsa;
import Bolsa_Productos.Clases.EnvioHilo;
import Bolsa_Productos.Clases.Producto;

public class main_Bolsa {
    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa();
        EnvioHilo envio = new EnvioHilo(bolsa);

        envio.start();

        for (int i = 0; i <= 10; i++) {
            Producto producto = new Producto();
            try {
                synchronized (bolsa) {
                    Thread.sleep(1000);
                    if (bolsa.estaLlena()) {
                        bolsa.notify();
                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bolsa.anyadirArticulos(producto);
        }
        System.out.println("La bolsa tiene " + bolsa.getTamañoBolsa()+" elementos");

    }
}
