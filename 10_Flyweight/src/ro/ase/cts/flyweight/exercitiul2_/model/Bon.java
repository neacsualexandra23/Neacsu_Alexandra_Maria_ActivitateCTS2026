package ro.ase.cts.flyweight.exercitiul2_.model;



public class Bon {
    private int numarBon;
    private double valoare;


    public Bon(int numarBon,  double valoare) {
        this.numarBon = numarBon;
        this.valoare = valoare;
    }

    public int getNumarBon() {
        return numarBon;
    }


    public double getValoare() {
        return valoare;
    }


}
