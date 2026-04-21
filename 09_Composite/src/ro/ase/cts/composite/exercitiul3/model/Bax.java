package ro.ase.cts.composite.exercitiul3.model;


import java.util.ArrayList;
import java.util.List;

public class Bax implements IComponent {
    private String nume;
    private List<IComponent> copii = new ArrayList<>();

    public Bax(String nume) {
        this.nume = nume;
    }

    public void adauga(IComponent c) {
        copii.add(c);
    }

    @Override
    public void afiseaza() {
        System.out.println("Bax: " + nume);
        for (IComponent c : copii) {
            c.afiseaza();
        }
    }
}