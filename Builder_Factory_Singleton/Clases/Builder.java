package Builder_Factory_Singleton.Clases;

public class Builder {
    private String salsa;
    private String msa;
    private String relleno;
    private String nombre;

    public Builder(){}
    
    public Builder setSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }
    public Builder setMasa(String msa) {
        this.msa = msa;
        return this;
    }
    public Builder setRelleno(String relleno) {
        this.relleno = relleno;
        return this;
    }
    public Builder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public Pizza build(){
        return new Pizza(this);
    }

    public String getSalsa() {
        return salsa;
    }

    public String getMsa() {
        return msa;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getNombre() {
        return nombre;
    }

    
}
