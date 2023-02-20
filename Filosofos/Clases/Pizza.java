package Filosofos.Clases;

public class Pizza {

    private String tipo;
    private String masa;
    private int porciones;
    private String salsa;
    private boolean estaOcupada;
    private boolean estaAcabada;

    public Pizza(Builder builder) {
        this.tipo = builder.getTipo();
        this.salsa = builder.getSalsa();
        this.estaAcabada = builder.isEstaAcabada();
        this.estaOcupada = builder.isEstaOcupada();
        this.masa = builder.getMasa();
        this.porciones = builder.getPorciones();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public boolean isEstaAcabada() {
        return estaAcabada;
    }

    public void setEstaAcabada(boolean estaAcabada) {
        this.estaAcabada = estaAcabada;
    }


    

}
