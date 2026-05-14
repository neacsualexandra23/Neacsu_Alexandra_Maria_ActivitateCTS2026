package ro.ase.cts.flyweight.exercitiul4.model;

public class Reteta {
    private String nume;
    private String reteta;
    private String diagnostic;

    public Reteta(String nume, String reteta, String diagnostic ){
        this.nume=nume;
        this.reteta= reteta;
        this.diagnostic= diagnostic;
    }

    public String getNume() {
        return nume;
    }

    public String getReteta() {
        return reteta;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
}
