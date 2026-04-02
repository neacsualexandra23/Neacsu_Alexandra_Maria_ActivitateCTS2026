package ro.ase.cts.composite.exercitiul2.model;

public class Item implements IRezervare {

    private String denumire;

    public Item(String denumire) {

        this.denumire = denumire;

    }

    @Override
    public void stergeRezervare(IRezervare rezervare) throws Exception {

        throw new Exception("Nu a fost implementata");

    }

    @Override
    public void adaugaRezervare(IRezervare rezervare) throws Exception {

        throw new Exception("Nu a fost implementata");

    }

    @Override
    public IRezervare getRezervare(int index) throws Exception {

        throw new Exception("Nu a fost implementata");

    }

    @Override
    public void info() {

        System.out.println("Item: " + denumire);

    }

}