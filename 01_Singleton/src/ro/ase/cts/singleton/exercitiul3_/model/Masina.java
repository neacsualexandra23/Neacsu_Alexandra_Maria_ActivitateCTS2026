package ro.ase.cts.singleton.exercitiul3_.model;

public class Masina extends AMasina {

    public Masina(String model) {

        super(model);
    }

    @Override
    public void print() {
        System.out.println("Masina: " + model);
    }
}