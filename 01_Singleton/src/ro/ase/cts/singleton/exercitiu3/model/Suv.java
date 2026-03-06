package ro.ase.cts.singleton.exercitiu3.model;


public class Suv extends AMasina {
    public Suv(String model) {
        super(model);
    }

    @Override
    public void descriere() {
        System.out.println("SUV: " + model);
    }
}