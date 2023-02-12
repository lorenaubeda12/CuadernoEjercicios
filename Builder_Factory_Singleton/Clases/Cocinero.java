package Builder_Factory_Singleton.Clases;

public class Cocinero {
    private Builder horno=new Builder();

    public Cocinero() {
    }

    public Pizza cocinar(String pizzaElegida){
        Pizza pizza;
        switch(pizzaElegida){
            case "CARBONARA":
            pizza= horno.setMasa("Fina").setRelleno("Jamón y queso").setSalsa("Carbonara").setNombre("Carbonara").build();
            break;
            case "QUESO":
            pizza=horno.setMasa("Fina").setRelleno("Jamón y queso").setSalsa("Queso").setNombre("Queso").build();;
            break;
            default:
            System.out.println("No se hacen pizzas de tipo: "+pizzaElegida+",se hará una normal");
            pizza= horno.setMasa("Fina").setRelleno("Jamón y queso").setSalsa("Tomate").setNombre("Normal").build();

        }
        return pizza;
    }
    
}
