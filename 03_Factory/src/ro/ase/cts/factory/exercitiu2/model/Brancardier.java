package ro.ase.cts.factory.exercitiu2.model;

public class Brancardier extends APersonal {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaRol() {
        System.out.println("Brancardier: " + nume);
    }
}