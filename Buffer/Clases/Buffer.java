package Buffer.Clases;

public class Buffer {

    private String packet;
    private boolean puedoEnviar = true, puedoRecibir = false;

    public synchronized void sender(String paquete) {
        while (!puedoEnviar && puedoRecibir) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        puedoEnviar = false;
        puedoRecibir = true;
        this.packet = paquete;
        notifyAll();
    }

    public synchronized String receiver() {
        while (puedoEnviar && !puedoRecibir) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        puedoEnviar = true;
        puedoRecibir = false;
        String paqueteEnviado = this.packet;
        notifyAll();

        return paqueteEnviado;
    }

}
