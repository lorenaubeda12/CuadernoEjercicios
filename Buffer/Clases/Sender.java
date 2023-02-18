package Buffer.Clases;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
    private Buffer buffer;



    public Sender(Buffer buffer) {
        this.buffer = buffer;
    }



    @Override
    public void run() {
       String mensajes[]={
        "primero","segundo","tercero","cuarto","End"
       };

       for(String paquete: mensajes){
        buffer.sender(paquete);

        try {
            Thread.sleep(ThreadLocalRandom.current().
                       nextInt(1000, 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }
    }
}
