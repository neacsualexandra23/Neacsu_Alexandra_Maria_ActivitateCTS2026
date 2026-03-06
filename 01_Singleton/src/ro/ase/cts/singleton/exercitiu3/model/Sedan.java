package ro.ase.cts.singleton.exercitiu3.model;

public class Sedan extends AMasina {
    public Sedan(String model) {
        super(model);
    }

    @Override
    public void descriere() {
        System.out.println("Sedan: " + model);
    }
}

