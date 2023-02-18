package Casino.Clases;

import java.util.ArrayList;
import java.util.Random;

public class Casino extends Thread {

    private int dinero;
    private boolean sePuedeApostar;
    private boolean estoyArruinado;
    private int numeroElegido;
    private Random ruleta;
    private ArrayList<Jugador> jugadores;

    public Casino() {
        this.dinero = 500;
        this.estoyArruinado = false;
        this.ruleta = new Random();
        this.sePuedeApostar = true;
        this.jugadores = new ArrayList<>();
    }

    @Override
    public void run() {
        iniciarJugadores(4);
        while (estoyArruinado == false) {
            abrirApuestas();
            cerrarApuestas();
            this.numeroElegido = this.ruleta.nextInt(37);
            System.out.println("El numero ganador es..." + this.numeroElegido);
            comprobarJugadores();
            if (this.dinero <= 0) {
                this.estoyArruinado = true;
                System.out.println("Se para de jugar");
            } else {
                System.out.println("Continuamos!!!");
            }
        }
    }

    private void iniciarJugadores(int numeroJugadores) {
        for (int i = 0; i < numeroJugadores; i++) {
            String nombre = "Jugador numero" + i;
            Jugador jugador = new Jugador(nombre, 100, this);
            jugador.start();
        }
    }

    private synchronized void abrirApuestas() {
        System.out.println("Señoras y señores, se abren las apuestas, vengan rápido solo  tenemos un par de minutos");
        this.sePuedeApostar = true;
        try {
            wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void cerrarApuestas() {
        System.out.println("Señoras y señores, se cierran las apuestas, la ruleta comenzara a girar!");
        this.sePuedeApostar = false;
    }



    public synchronized void comprobarJugadores() {

        if (this.numeroElegido == 0) {
            System.out.println("Gana solo la banca");
        } else {
            for (int i = 0; i < jugadores.size(); i++) {
                if (this.jugadores.get(i).getNumeroElegido() == this.numeroElegido) {
                    if (this.dinero > 0 || (this.dinero - 360) > 0) {
                        this.jugadores.get(i).serPagado(360);
                        this.dinero = this.dinero - 360;
                    } else {
                        System.out.println("Estoy arruinado, no puedo pagar");
                        this.estoyArruinado = true;
                        break;
                    }
                } else {
                    System.out.println("El jugador " + this.jugadores.get(i).getNombre()
                            + " no ha ganado nada, su numero era " + this.jugadores.get(i).getNumeroElegido());
                }
            }
        }

        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).terminarRonda();
        }

        System.out.println("El saldo actual del casino es de " + this.dinero + "€ ");
        this.jugadores.clear();
    }

    public synchronized void recibirApuestas(Jugador apostador) {
        this.dinero += apostador.pagar();
        this.jugadores.add(apostador);
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public synchronized boolean isSePuedeApostar() {
        return sePuedeApostar;
    }

    public void setSePuedeApostar(boolean sePuedeApostar) {
        this.sePuedeApostar = sePuedeApostar;
    }

    public boolean isEstoyArruinado() {
        return estoyArruinado;
    }

    public void setEstoyArruinado(boolean estoyArruinado) {
        this.estoyArruinado = estoyArruinado;
    }

    public int getNumeroElegido() {
        return numeroElegido;
    }

    public void setNumeroElegido(int numeroElegido) {
        this.numeroElegido = numeroElegido;
    }

    public Random getRuleta() {
        return ruleta;
    }

    public void setRuleta(Random ruleta) {
        this.ruleta = ruleta;
    }

}
