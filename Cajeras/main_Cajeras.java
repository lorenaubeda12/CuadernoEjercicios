package Cajeras;

import Cajeras.Clases.*;

public class main_Cajeras {
    public static void main(String[] args) {
        long tiempoInicial = System.currentTimeMillis();
        Cliente cliente1 = new Cliente("Cliente 1", 5);
        Cliente cliente2 = new Cliente("Cliente 2", 3);

        Cajera cajera1 = new Cajera("Cajera 1", tiempoInicial, cliente1);
        Cajera cajera2 = new Cajera("Cajera 2", tiempoInicial, cliente2);

        cajera1.start();
        cajera2.start();
    }

}
