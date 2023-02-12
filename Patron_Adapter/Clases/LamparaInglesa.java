package Patron_Adapter.Clases;

public class LamparaInglesa {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        System.out.println("Lampara encendida");
        isOn = true;
    }
    public void turnOff() {
        System.out.println("Lampara apagada");
        isOn = false;
    }

}
