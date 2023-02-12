package Cajeras.Clases;

public class Cajera extends Thread {
    private String nombre;
    private long tiempo;
    private Cliente cliente;

    public Cajera(String nombre, long tiempo, Cliente cliente) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.cliente = cliente;
    }

    @Override
    public void run() {
        this.cliente.run();
        System.out.println("Soy la cajera " + this.nombre + " y atiendo al cliente " + this.cliente.getNombre()
                + " y proceso su compra en :" + (System.currentTimeMillis() - tiempo) / 1000 + "segundos");
        for (int i = 0; i < this.cliente.getCarroCompra().size(); i++) {
            this.tiempoCobrando(this.cliente.getCarroCompra().get(i));
            System.out.println("Procesado el producto " + (i + 1) + " del cliente " + this.cliente.getNombre()
                    + "en un tiempo:  " + (System.currentTimeMillis() - tiempo) / 1000 + "segundos");
        }
        System.out.println("Termine de procesar la compra el cliente" + this.cliente.getNombre() + "en un tiempo:  "
                + (System.currentTimeMillis() - tiempo) / 1000 + "segundos");

    }

    private void tiempoCobrando(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {

        }
    }
}
