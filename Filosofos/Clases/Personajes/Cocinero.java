package Filosofos.Clases.Personajes;

import Filosofos.Clases.Builder;
import Filosofos.Clases.Pizza;

public class Cocinero {
    private Builder horno = new Builder();

    public Pizza cocinarPizza(String tipoPizza) {
        Pizza pizzaHecha;

        tipoPizza = tipoPizza.toUpperCase();
        switch (tipoPizza) {
            case "CARBONARA":
                pizzaHecha = horno.masa("Fina").salsa("Carbonara").tipo("Carbonara").estaOcupada(false)
                        .estaAcabada(false).porciones(24).build();
                break;

            case "POLLO":
                pizzaHecha = horno.masa("Fina").salsa("Tomate").tipo("Pollo").estaOcupada(false).estaAcabada(false)
                        .porciones(24).build();
                break;

            case "PICANTE":
                pizzaHecha = horno.masa("Fina").salsa("Picante").tipo("Picante").estaOcupada(false).estaAcabada(false)
                        .porciones(24).build();
                break;

            case "BARBACOA":
                pizzaHecha = horno.masa("Fina").salsa("Barbacoa").tipo("Barbacoa").estaOcupada(false).estaAcabada(false)
                        .porciones(24).build();
                break;

            default:
                pizzaHecha = horno.masa("Fina").salsa("Tomate").tipo("Tomate y queso").estaOcupada(false)
                        .estaAcabada(false).porciones(24).build();
                break;
        }

        return pizzaHecha;
    }
}
