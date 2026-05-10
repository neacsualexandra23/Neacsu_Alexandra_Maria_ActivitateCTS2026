package ro.ase.cts.composite.exercitiul6.main;

import ro.ase.cts.composite.exercitiul6.model.*;


public class Main {
    public static void main(String[] args) {
        Loc loc1=new Loc("1");
        Loc loc2=new Loc("2");
        Sectiune sectiune=new Sectiune("10");

        sectiune.adauga(loc1);
        sectiune.adauga(loc2);
        sectiune.afiseaza("a fost adaugat ");

        sectiune.sterge(loc1);
        sectiune.afiseaza("a fost sters ");
    }
}
