package Filosofos;

import java.util.zip.CRC32;

import Filosofos.Clases.Factory;
import Filosofos.Clases.Mesa;
import Filosofos.Clases.Pizza;
import Filosofos.Clases.Personajes.Caco;
import Filosofos.Clases.Personajes.Comisario;
import Filosofos.Clases.Personajes.Jefe;

public class main_Filosfos {
    public static void main(String[] args) {
        Pizza pizzaBarbacoa = new Factory().pedirPizza("Barbacoa");
        Pizza pizzaCarbonara = new Factory().pedirPizza("CARBONARA");
        Pizza pizzaPicante = new Factory().pedirPizza("picante");
        Pizza pizzaPollo = new Factory().pedirPizza("PolLo");

        Mesa mesa = Mesa.getInstance();

        mesa.addPizzas(pizzaBarbacoa);
        mesa.addPizzas(pizzaPollo);
        mesa.addPizzas(pizzaPicante);
        mesa.addPizzas(pizzaCarbonara);

        Jefe jefe = new Jefe("Jefe", mesa);
        Caco caco1 = new Caco("Caco1", 10, mesa);
        Caco caco2 = new Caco("Caco2", 20, mesa);
        Caco caco3 = new Caco("Caco3", 30, mesa);
        Comisario comisario = new Comisario("Comisario", jefe, 100, mesa);

        jefe.addSubordinados(caco1);
        jefe.addSubordinados(caco2);
        jefe.addSubordinados(caco3);

        mesa.addComensales(comisario);
        mesa.addComensales(jefe);
        mesa.addComensales(caco1);
        mesa.addComensales(caco2);
        mesa.addComensales(caco3);

        jefe.start();
        caco1.start();
        caco2.start();
        caco3.start();
        comisario.start();

    }
}
