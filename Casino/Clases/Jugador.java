package Casino.Clases;

import java.util.Random;

public class Jugador extends Thread {
    private String nombre;
    private int dinero;
    private boolean estoyArruinado;
    private Random elegirNumero;
    private Casino casino;
    private int numeroElegido;
    private boolean heApostado;

    public Jugador(String nombre, int dinero, Casino casino) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.casino = casino;
        this.elegirNumero = new Random();
        this.estoyArruinado = false;
        this.heApostado = false;

    }

    public void terminarRonda() {
        this.heApostado = false;
    }

    public void serPagado(int dinero) {
        this.dinero += dinero;
        System.out.println(this.nombre + ": he ganado esta ronda y mi saldo actual es de: " + this.dinero);
    }

    public int pagar() {
        this.dinero -= 10;
        System.out.println(this.nombre + ": he apostado 10€ por el numero " + this.numeroElegido
                + " y mi saldo actual es de: " + this.dinero);
        return 10;
    }

    private Jugador apostar() {
        this.numeroElegido = this.elegirNumero.nextInt(36) + 1;
        this.heApostado = true;
        return this;
    }

    @Override
    public void run() {
        while (this.estoyArruinado == false && this.casino.isEstoyArruinado() == false) {
            if (this.dinero <= 0) {
                this.estoyArruinado = true;
                System.out.println(this.nombre + " estoy arruinado y no puedo jugar");
            } else {
                if (casino.isSePuedeApostar() == true && this.heApostado == false) {
                    casino.recibirApuestas(this.apostar());
                    try {
                        sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public boolean isEstoyArruinado() {
        return estoyArruinado;
    }

    public Random getElegirNumero() {
        return elegirNumero;
    }

    public Casino getCasino() {
        return casino;
    }

    public int getNumeroElegido() {
        return numeroElegido;
    }

    public boolean isHeApostado() {
        return heApostado;
    }

}
