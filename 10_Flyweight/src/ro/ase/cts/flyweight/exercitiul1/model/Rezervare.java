package ro.ase.cts.flyweight.exercitiul1.model;

public class Rezervare {

    private String numeClient;
    private String ora;

    public Rezervare(String numeClient, String ora) {
        this.numeClient = numeClient;
        this.ora = ora;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getOra() {
        return ora;
    }
}