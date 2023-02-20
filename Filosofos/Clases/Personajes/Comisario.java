package Filosofos.Clases.Personajes;

import Filosofos.Clases.Mesa;

public class Comisario extends Personaje {
    private Jefe jefe;
    private int dinero;
    private Mesa mesa;

    public Comisario(String nombre, Jefe jefe, int dinero, Mesa mesa) {
        super(nombre);
        this.jefe = jefe;
        this.dinero = dinero;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        boolean hayTrozos = true;
        int pizzaElegida;
        while (hayTrozos == true) {
            pizzaElegida = this.mesa.elegirPizza();
            switch (pizzaElegida) {

                case 0:
                    System.out.println(this.getNombre() + " quiero un trozo de barbacoa");
                    while (this.mesa.cogerPizza(pizzaElegida) == false) {
                        try {
                            wait(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                    this.mesa.tomarPizza(pizzaElegida);
                    this.mesa.dejarPizza(pizzaElegida);
                    break;

                case 1:
                    System.out.println(this.getNombre() + " quiero un trozo de barbacoa");
                    while (this.mesa.cogerPizza(pizzaElegida) == false) {
                        try {
                            wait(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                    this.mesa.tomarPizza(pizzaElegida);
                    this.mesa.dejarPizza(pizzaElegida);
                    break;

                case 2:
                    System.out.println(this.getNombre() + " quiero un trozo de barbacoa");
                    while (this.mesa.cogerPizza(pizzaElegida) == false) {
                        try {
                            wait(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                    this.mesa.tomarPizza(pizzaElegida);
                    this.mesa.dejarPizza(pizzaElegida);
                    break;

                case 3:
                    System.out.println(this.getNombre() + " quiero un trozo de barbacoa");
                    while (this.mesa.cogerPizza(pizzaElegida) == false) {
                        try {
                            wait(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                    this.mesa.tomarPizza(pizzaElegida);
                    this.mesa.dejarPizza(pizzaElegida);
                    break;

            }

            if (mesa.noQuedanPizzas()) {
                break;
            }

        }
        System.out.println("La cena termino!");

    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
