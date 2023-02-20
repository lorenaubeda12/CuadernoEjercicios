package Filosofos.Clases;

import java.util.ArrayList;
import java.util.Random;

import Filosofos.Clases.Personajes.Personaje;

public class Mesa {
    private Random generador;
    private static Mesa instance;
    private ArrayList<Pizza> pizzasMesa;
    private Boolean[] pizzasMesaDisponibles;
    private ArrayList<Personaje> sentadoEnLaMesa;

    private Mesa() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.generador = new Random();
        this.pizzasMesaDisponibles = new Boolean[4];
        this.pizzasMesa = new ArrayList<>();
        this.sentadoEnLaMesa = new ArrayList<>();

        for (int i = 0; i < pizzasMesaDisponibles.length; i++) {

            pizzasMesaDisponibles[i] = true;
        }
    }

    public static synchronized Mesa getInstance() {
        if (instance == null) {
            instance = new Mesa();
        } else {
            System.out.println("Mesa ya puesta");
        }

        return instance;
    }

    public void addPizzas(Pizza pizza) {
        pizzasMesa.add(pizza);

        System.out.println("La pizza " + pizza.getTipo() + " se ha puesto en la mesa");
    }

    public synchronized boolean cogerPizza(int pizzaElegida) {

        if (this.pizzasMesaDisponibles[pizzaElegida] == false) {
            return false;
        } else {

            this.pizzasMesaDisponibles[pizzaElegida] = false;
            return true;
        }

    }

    public synchronized int elegirPizza() {

        int eleccion = generador.nextInt(4);
        while (noQuedanPizzas() == false && pizzasMesa.get(eleccion).getPorciones() <= 0) {
            eleccion = generador.nextInt(4);
        }
        return eleccion;

    }

    public synchronized void tomarPizza(int pizza) {
        if (pizzasMesa.get(pizza).getPorciones() > 0) {
            pizzasMesa.get(pizza).setPorciones(pizzasMesa.get(pizza).getPorciones() - 1);
            if (pizzasMesa.get(pizza).getPorciones() == 0) {
                System.out.println("No queda pizza: " + this.pizzasMesa.get(pizza).getTipo());
            } else {
                System.out.println("Quedan de la pizza " + this.pizzasMesa.get(pizza).getTipo() + " un total de: "
                        + this.pizzasMesa.get(pizza).getPorciones() + " trozos.");
            }
        } else {
            System.out.println("No es justo, no queda pizza " + this.pizzasMesa.get(pizza).getTipo());
        }

    }

    public synchronized void dejarPizza(int pizza) {
        this.pizzasMesaDisponibles[pizza] = true;
        notifyAll();

    }

    public synchronized boolean noQuedanPizzas() {
        // Comprueba si todos los elementos del ArrayList cumplen la condición, en este
        // caso, que no queden trozos de pizza.
        return this.pizzasMesa.stream().allMatch(x -> x.getPorciones() == 0);
    }

    public void addComensales(Personaje personaje) {
        sentadoEnLaMesa.add(personaje);
    }
}
