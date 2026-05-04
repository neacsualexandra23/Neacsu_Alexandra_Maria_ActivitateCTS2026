package ro.ase.cts.composite.exercitiul5.model;

public class Sectie implements IComponent{
    private String nume;

    public Sectie(String nume){
        this.nume=nume;
    }

    @Override
    public void afiseazaStructura() {
        System.out.println(nume);
    }

    @Override
    public void adauga(IComponent unitate) {
        System.out.println("adauga unitate");
    }

    @Override
    public void sterge(IComponent unitate) {
        System.out.println("sterge unitate");
    }

    @Override
    public IComponent getCopil(int index) {
        return getCopil(index);
    }
}
