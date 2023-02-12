package CarreraAnimales;

import CarreraAnimales.Clases.*;

public class main_Animales {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(5);
        Corredor corredor1 = new Corredor("Leon",carrera);
        Corredor corredor2 = new Corredor("Tigre",carrera);
        Corredor corredor3 = new Corredor("Jirafa",carrera);
        carrera.addCorredor(corredor1);
        carrera.addCorredor(corredor2);
        carrera.addCorredor(corredor3);
        carrera.start();


        
    }
}