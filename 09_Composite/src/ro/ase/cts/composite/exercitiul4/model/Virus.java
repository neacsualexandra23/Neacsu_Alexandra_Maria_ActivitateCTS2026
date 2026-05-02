package ro.ase.cts.composite.exercitiul4.model;

public class Virus implements IComposite {
    private String nume;

    public Virus(String nume){
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Virus: "+ nume);
    }
}
