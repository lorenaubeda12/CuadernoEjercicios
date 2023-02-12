package Patron_Observer.Clases;

import Patron_Observer.Clases.Interfaz.IObserver;

public class main_Observer {
    public static void main(String[] args) {
        AvionLider avionLider = new AvionLider("Avion Lider");
        IObserver avionPerseguidor = new AvionPerseguidor("Avion Perseguidor", avionLider);
        IObserver avionPerseguidor2 = new AvionPerseguidor("Avion Perseguidor2", avionLider);

        avionLider.anyadirAvionPerseguidor(avionPerseguidor);
        avionLider.anyadirAvionPerseguidor(avionPerseguidor2);

        avionLider.notificarDespegando();
        System.out.println("--------------------");
        avionLider.notificarVolando();
        System.out.println("--------------------");
        avionLider.notificarAterrizaje();
        System.out.println("--------------------");
        avionLider.quitarAvionPerseguidor(avionPerseguidor2);
        avionLider.quitarAvionPerseguidor(avionPerseguidor);
    }

}