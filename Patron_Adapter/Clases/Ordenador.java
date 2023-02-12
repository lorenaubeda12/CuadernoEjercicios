package Patron_Adapter.Clases;

public class Ordenador{
    private boolean encendido;

    public void conectar() {
        System.out.println("Estoy encendido");
        encendido = true;
    }
    public void desconectar() {
        System.out.println("Estoy apagado");
        encendido = false;
    }

    public boolean estaEncendida() {
        return encendido;
    
}
}
