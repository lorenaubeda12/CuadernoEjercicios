package Buffer.Clases;

import java.util.concurrent.ThreadLocalRandom;

public class Recibidor implements Runnable {
    private Buffer buffer;

    public Recibidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (String receiverMessage = buffer.receiver(); !"End".equals(receiverMessage); receiverMessage = buffer
                .receiver()) {
                    try {
                        System.out.println(receiverMessage);
                        Thread.sleep(ThreadLocalRandom.current().nextInt(100, 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        }
    }
}
 

