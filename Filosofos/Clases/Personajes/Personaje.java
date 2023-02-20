package Filosofos.Clases.Personajes;

import java.util.Random;

public abstract class Personaje extends Thread {

    private String nombre;
    private Random generador;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.generador = new Random();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int generarNumero() {
        return generador.nextInt(4) + 1;
    }

}
