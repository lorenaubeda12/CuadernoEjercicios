package Builder_Factory_Singleton.Clases;

public class Pizza {
    private String salsa;
    private String msa;
    private String relleno;
    private String nombre;

    public Pizza(Builder builder) {
        this.salsa = builder.getSalsa();
        this.msa = builder.getMsa();
        this.relleno = builder.getRelleno();
        this.nombre = builder.getNombre();
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getMsa() {
        return msa;
    }

    public void setMsa(String msa) {
        this.msa = msa;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    


    
}
