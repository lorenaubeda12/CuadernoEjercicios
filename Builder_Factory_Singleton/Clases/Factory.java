package Builder_Factory_Singleton.Clases;

public class Factory {
    Cocinero cocinero= new Cocinero();


    public Pizza getPizza(String tipoPizza) {
        tipoPizza=tipoPizza.toUpperCase();
        return cocinero.cocinar(tipoPizza);
    }
    
}
