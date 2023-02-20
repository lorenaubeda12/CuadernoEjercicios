package Filosofos.Clases.Personajes;

import Filosofos.Clases.Mesa;

public class Caco extends Personaje {
    private int salario;
    private Mesa mesa;

    public Caco(String nombre, int salario, Mesa mesa) {
        super(nombre);
        this.salario = salario;
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


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
