package ro.ase.cts.flyweight.exercitiul2.model;


public class Bon {
    private int numarBon;
    private String data;
    private double valoare;
    private String numeChelner;

    public Bon(int numarBon, String data, double valoare, String numeChelner) {
        this.numarBon = numarBon;
        this.data = data;
        this.valoare = valoare;
        this.numeChelner = numeChelner;
    }

    public int getNumarBon() {
        return numarBon;
    }

    public String getData() {
        return data;
    }

    public double getValoare() {
        return valoare;
    }

    public String getNumeChelner() {
        return numeChelner;
    }
}
