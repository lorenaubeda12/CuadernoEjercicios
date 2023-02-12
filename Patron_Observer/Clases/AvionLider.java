package Patron_Observer.Clases;

import java.util.ArrayList;

import Patron_Observer.Clases.Interfaz.IObserver;

public class AvionLider {

    private String nombre;
    private String posicion;
    private ArrayList<IObserver> avionesPerseguidores;



    public AvionLider(String nombre){
        this.nombre = nombre;
        this.posicion = "En tierra";
        this.avionesPerseguidores = new ArrayList<IObserver>();
    }

    public void anyadirAvionPerseguidor(IObserver avionPerseguidor){
        this.avionesPerseguidores.add(avionPerseguidor);
    }
    public void quitarAvionPerseguidor(IObserver avionPerseguidor){
        this.avionesPerseguidores.remove(avionPerseguidor);
    }


    public void notificarAterrizaje() {
        for (IObserver avionPerseguidor : this.avionesPerseguidores) {
            avionPerseguidor.notificar("aterrizando");
        }
    }


    public void notificarVolando() {
        for (IObserver avionPerseguidor : this.avionesPerseguidores) {

            avionPerseguidor.notificar("volando");
        }
    }

    public void notificarDespegando() {
        for (IObserver avionPerseguidor : this.avionesPerseguidores) {

            avionPerseguidor.notificar("despegando");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public ArrayList<IObserver> getAvionesPerseguidores() {
        return avionesPerseguidores;
    }

    public void setAvionesPerseguidores(ArrayList<IObserver> avionesPerseguidores) {
        this.avionesPerseguidores = avionesPerseguidores;
    }
    
    
}
