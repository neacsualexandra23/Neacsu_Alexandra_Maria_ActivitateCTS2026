package ro.ase.cts.singleton.exercitiu3.model;


public abstract class AMasina {
    protected final String model;

    public AMasina(String model) {
        this.model = model;
    }

    public abstract void descriere();
}