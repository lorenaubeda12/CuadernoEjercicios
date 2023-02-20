package Filosofos.Clases.Personajes;

import java.util.ArrayList;

import Filosofos.Clases.Mesa;

public class Jefe extends Personaje {
    private ArrayList<Caco> subordinados;
    private Mesa mesa;

    
    public Jefe(String nombre, Mesa mesa) {
        super(nombre);
        this.subordinados = new ArrayList<>();
        this.mesa=mesa;

    }

    public void addSubordinados(Caco caco) {
        subordinados.add(caco);
        System.out.println("Caco añadido");
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
   
    public ArrayList<Caco> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Caco> subordinados) {
        this.subordinados = subordinados;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }









    

}
