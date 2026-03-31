package ro.ase.cts.composite.exercitiul1.model;

public class Fisier implements IComponent {
    private String nume;

    public Fisier(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Fisier: " + nume);
    }
}
