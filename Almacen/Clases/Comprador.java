package Almacen.Clases;

public class Comprador extends Thread {
    private String nombre;
    private int intento;
    private boolean heEntrado;
    private boolean heComprado;
    private Almacen tienda;

    public Comprador(String nombre, Almacen tienda) {
        this.nombre = nombre;
        this.intento = 0;
        this.heEntrado = false;
        this.heComprado = false;
        this.tienda = tienda;
    }

    @Override
    public void run() {
        while (this.intento <= 5) {
            if (this.tienda.estaOcupada() == false) {
                this.entrar();
                this.tienda.comprar(this);
                this.salir();
               break;
            } else {
                this.intento++;
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                
                    e.printStackTrace();
                }
             
            }
        }
        if (this.heComprado == false && this.heEntrado==false) {
            System.out.println(this.nombre + ": ¡Me he cansado de esperar, me marcho!");
        }
    }

    public synchronized void entrar() {
        this.tienda.setTiendaOcupada(true);
        this.heEntrado = true;
        System.out.println(this.nombre + ": He entrado en la tienda");
    }

    public synchronized void salir() {
        this.tienda.setTiendaOcupada(false);
        this.heEntrado = true;
        if (this.heComprado == true) {
            System.out.println(this.nombre + ":He salido en la tienda y logre comprar un movil");
        } else {
            System.out.println(this.nombre + ":He salido en la tienda y no logre comprar un movil");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntento() {
        return intento;
    }

    public void setIntento(int intento) {
        this.intento = intento;
    }

    public boolean isHeEntrado() {
        return heEntrado;
    }

    public void setHeEntrado(boolean heEntrado) {
        this.heEntrado = heEntrado;
    }

    public boolean isHeComprado() {
        return heComprado;
    }

    public void setHeComprado(boolean heComprado) {
        this.heComprado = heComprado;
    }

    public Almacen getTienda() {
        return tienda;
    }

    public void setTienda(Almacen tienda) {
        this.tienda = tienda;
    }





}
