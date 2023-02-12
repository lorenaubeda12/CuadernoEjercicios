package CarreraAnimales.Clases;

import java.util.ArrayList;

public class Carrera extends Thread{
    private int META;
    private Boolean ganador;
    private ArrayList<Corredor> corredores;

    public Carrera(int corredores) {
        this.corredores = new ArrayList<>();
        this.META=500;
        this.ganador=false;
    }

    public synchronized int getMETA() {
        return META;
    }

    public synchronized Boolean ganoAlguien() {
        return ganador;
    }


    public synchronized void soyGanador(Boolean ganador) {
        this.ganador = ganador;
        System.out.println("Tenemos ganador");
    }
    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }
    public void addCorredor(Corredor corredor){
        corredores.add(corredor);
    }

    @Override
    public void run() {
        for (int i = 0; i < corredores.size(); i++) {
            corredores.get(i).start();
        }
        
    }

    
}