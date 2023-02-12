package Patron_Observer.Clases;

import Patron_Observer.Clases.Interfaz.IObserver;

public class AvionPerseguidor implements IObserver {

private String nombre;
private String posicion;
private AvionLider avionLider;

public AvionPerseguidor(String nombre, AvionLider avionLider){
    this.avionLider = avionLider;
    this.nombre = nombre;
    this.posicion = "En tierra";
}

    @Override
    public void notificar(String estado) {
        System.out.println("El avion " + this.nombre + " ha sido notificado que el avion lider esta " + estado);
        this.posicion = estado;
        System.out.println("El avion " + this.nombre + " esta " + this.posicion);
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public AvionLider getAvionLider() {
        return avionLider;
    }
    
    
}
