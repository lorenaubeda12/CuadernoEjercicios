package Patron_Adapter.Clases;
import Patron_Adapter.Interfaz.conectable;

public class AdapterLampara implements conectable {
    private LamparaInglesa lampara=new LamparaInglesa();
    @Override
    public void conectar() {
        lampara.turnOn();
    }

    @Override
    public void desconectar() {
        lampara.turnOff();
    }
    
}
    

