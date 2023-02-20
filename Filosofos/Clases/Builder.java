package Filosofos.Clases;

public class Builder {

    private String tipo;
    private String masa;
    private int porciones;
    private String salsa;
    private boolean estaOcupada;
    private boolean estaAcabada;

    public Builder() {

    }

    public Pizza build() {
        return new Pizza(this);
    }

    public Builder salsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public Builder masa(String masa) {
        this.masa = masa;
        return this;
    }

    public Builder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Builder porciones(int porciones) {
        this.porciones = porciones;
        return this;
    }

    public Builder estaOcupada(Boolean estado) {
        this.estaOcupada = estado;
        return this;
    }

    public Builder estaAcabada(Boolean estado) {
        this.estaAcabada = estado;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMasa() {
        return masa;
    }

    public int getPorciones() {
        return porciones;
    }

    public String getSalsa() {
        return salsa;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public boolean isEstaAcabada() {
        return estaAcabada;
    }

}
