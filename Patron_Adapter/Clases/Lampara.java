package Patron_Adapter.Clases;


public class Lampara {
    private boolean encendida;

    public void conectar() {
        System.out.println("Estoy encendida");
        encendida = true;
    }
    public void desconectar() {
        System.out.println("Estoy apaganda");
        encendida = false;
    }

    public boolean estaEncendida() {
        return encendida;
    
}
}
