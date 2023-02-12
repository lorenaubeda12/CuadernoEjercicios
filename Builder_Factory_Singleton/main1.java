
package Builder_Factory_Singleton;

import Builder_Factory_Singleton.Clases.Factory;
import Builder_Factory_Singleton.Clases.Mesa_Singleton;
import Builder_Factory_Singleton.Clases.*;

public class main1 {
    public static void main(String[] args) {
        Mesa_Singleton mesa = Mesa_Singleton.getInstance();
        Pizza carbonara = new Factory().getPizza("Carbonara");
        Pizza queso = new Factory().getPizza("Queso");
        Pizza normal = new Factory().getPizza("Hawaiana");

        mesa.addPizza(normal);
        mesa.addPizza(carbonara);
        mesa.addPizza(queso);

        System.out.println("Pizzas en la mesa:");
        mesa.mostrarPizzas();

    }

}