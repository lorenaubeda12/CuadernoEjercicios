package CarreraAnimales.Clases;

import java.util.Random;

public class Corredor extends Thread {
    private String nombre;
    private int pasos;
    private int totalPasos;
    private Random generador;
    private String recorrido;
    private Carrera carrera;


    public Corredor(String nombre,Carrera carrera) {
        this.nombre = nombre;
        this.pasos = 0;
        this.carrera = carrera;
        this.totalPasos = 0;
        this.generador= new Random();
    }


    public String getNombre() {
        return nombre;
    }
    public int getPasos() {
        return pasos;
    }
    public int getTotalPasos() {
        return totalPasos;
    }


    public void correr(){
        this.pasos=generador.nextInt(20)+1;
        this.totalPasos+=this.pasos;
        recorrido="Estoy corriendo: "+this.nombre+" y llevo "+this.totalPasos+" pasos";
        System.out.println(recorrido);

    }


    @Override
    public void run() {
        while(carrera.ganoAlguien()==false){
            if(carrera.getMETA()>this.totalPasos){
                correr();
                try {
                   Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(carrera.getMETA()<=this.totalPasos){
                carrera.soyGanador(true);
                System.out.println("El ganador es: "+this.nombre);
                break;
            }
        }
        
    }
}
