package Buffer;

import Buffer.Clases.Buffer;
import Buffer.Clases.Sender;
import Buffer.Clases.Recibidor;

public class main_Buffer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread enviador = new Thread(new Sender(buffer));
        Thread recibidor = new Thread(new Recibidor(buffer));

        enviador.start();
        recibidor.start();

    }
}