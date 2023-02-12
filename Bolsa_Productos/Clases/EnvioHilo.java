package Bolsa_Productos.Clases;

public class EnvioHilo extends Thread {
    private Bolsa bolsaCompra;

    public EnvioHilo(Bolsa bolsa) {
        this.bolsaCompra = bolsa;
    }

    @Override
    public void run() {
        if (bolsaCompra.estaLlena() !=true) {
                try {synchronized (bolsaCompra) {
                    bolsaCompra.wait();
                } 
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("La bolsa esta llena, está siendo enviada con un total de "
                + bolsaCompra.getTamañoBolsa() + " productos");
    }

    public Bolsa getBolsa() {
        return bolsaCompra;
    }
}
