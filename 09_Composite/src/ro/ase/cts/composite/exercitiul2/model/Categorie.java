package ro.ase.cts.composite.exercitiul2.model;


import java.util.ArrayList;
import java.util.List;

public class Categorie implements IRezervare {

    private String denumire;
    private List<IRezervare> lista=new ArrayList<>();

    public Categorie(String denumire) {
        this.denumire = denumire;
         this.lista=lista;
    }

    @Override
    public void stergeRezervare(IRezervare rezervare) throws Exception {
        lista.remove(rezervare);
    }

    @Override
    public void adaugaRezervare(IRezervare rezervare) throws Exception {
        lista.add(rezervare);

    }

    @Override
    public IRezervare getRezervare(int index) throws Exception {
        return lista.get(index);
    }

    @Override
    public void info() {
        System.out.println("Categorie: " + denumire);
        for (IRezervare rezervare : lista) {
            rezervare.info();
        }
    }
}