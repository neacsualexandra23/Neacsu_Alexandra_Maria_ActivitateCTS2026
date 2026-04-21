package ro.ase.cts.composite.exercitiul3.model;

public class Produs implements IComponent {
    private String nume;

    public Produs(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Produs: " + nume);
    }
}
