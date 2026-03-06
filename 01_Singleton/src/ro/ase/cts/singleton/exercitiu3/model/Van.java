package ro.ase.cts.singleton.exercitiu3.model;

public class Van extends AMasina  {
    public Van(String model) {
        super(model);
    }

    @Override
    public void descriere() {
        System.out.println("masina Van");
    }
}
