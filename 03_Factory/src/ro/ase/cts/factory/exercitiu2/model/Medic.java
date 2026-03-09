package ro.ase.cts.factory.exercitiu2.model;

public class Medic extends APersonal {

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaRol() {
        System.out.println("Medic: " + nume);
    }
}