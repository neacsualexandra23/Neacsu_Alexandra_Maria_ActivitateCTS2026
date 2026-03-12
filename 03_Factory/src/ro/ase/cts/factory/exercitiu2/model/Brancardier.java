package ro.ase.cts.factory.exercitiu2.model;

public class Brancardier extends APersonal {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void print() {
        System.out.println("Brancardier: " + nume);
    }
}