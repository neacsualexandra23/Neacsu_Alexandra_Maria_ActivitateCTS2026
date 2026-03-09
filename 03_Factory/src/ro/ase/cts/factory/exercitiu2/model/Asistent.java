package ro.ase.cts.factory.exercitiu2.model;

public class Asistent extends APersonal {

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaRol() {
        System.out.println("Asistent: " + nume);
    }
}