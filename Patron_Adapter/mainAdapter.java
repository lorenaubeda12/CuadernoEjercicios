package Patron_Adapter;

import Patron_Adapter.Clases.AdapterLampara;
import Patron_Adapter.Clases.Ordenador;
import Patron_Adapter.Clases.Lampara;
import Patron_Adapter.Interfaz.conectable;

public class mainAdapter {
    public static void main(String[] args) {
        conectable lamparaInglesa = new AdapterLampara();
        Ordenador ordenador = new Ordenador();
        Lampara lampara = new Lampara();

        ordenador.conectar();
        lampara.conectar();
        lamparaInglesa.conectar();

        ordenador.desconectar();
        lampara.desconectar();
        lamparaInglesa.desconectar();
    }
}
