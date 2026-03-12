package ro.ase.cts.singleton.exercitiul3_.model;

public abstract class AMasina {
    protected final String model;

    public AMasina(String model) {

        this.model = model;
    }

    public abstract void print();
}