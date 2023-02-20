package Filosofos.Clases;

import Filosofos.Clases.Personajes.Cocinero;

public class Factory {

    private Cocinero cocinero = new Cocinero();

    public Pizza pedirPizza(String tipo) {

        Pizza pizzaPedida;
        pizzaPedida = cocinero.cocinarPizza(tipo);
        return pizzaPedida;

    }

}
