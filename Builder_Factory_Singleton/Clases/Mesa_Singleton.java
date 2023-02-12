package Builder_Factory_Singleton.Clases;

import java.util.ArrayList;

public class Mesa_Singleton {
    private static Mesa_Singleton instancia = null;
    private ArrayList<Pizza> pizzas;

    private Mesa_Singleton() {
        this.pizzas = new ArrayList<>();
    }

    public static synchronized Mesa_Singleton getInstance() {
        if (instancia == null) {
            instancia = new Mesa_Singleton();
        }
        return instancia;

    }

    public void addPizza(Pizza pizza) {
        System.out.println("Se ha añadido una pizza a la mesa");
        this.pizzas.add(pizza);
    }

    public void mostrarPizzas() {
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getNombre());
        }
    }
}
