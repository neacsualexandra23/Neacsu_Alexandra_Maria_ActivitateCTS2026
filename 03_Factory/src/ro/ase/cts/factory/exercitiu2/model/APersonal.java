package ro.ase.cts.factory.exercitiu2.model;

public abstract class APersonal {
    protected final String nume;

    public APersonal(String nume) {
        this.nume = nume;
    }

    public abstract void print();
}