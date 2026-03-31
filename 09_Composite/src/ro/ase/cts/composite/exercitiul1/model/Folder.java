package ro.ase.cts.composite.exercitiul1.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IComponent {
    private String nume;
    private List<IComponent> copii = new ArrayList<>();

    public Folder(String nume) {
        this.nume = nume;
    }

    public void adauga(IComponent c) {
        copii.add(c);

    }

    @Override
    public void afiseaza() {
        System.out.println("Folder: " + nume);
        for (IComponent c : copii) {
            c.afiseaza();
        }
    }
}