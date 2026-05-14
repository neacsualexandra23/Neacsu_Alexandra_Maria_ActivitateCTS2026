package ro.ase.cts.flyweight.exercitiul4.main;

import ro.ase.cts.flyweight.exercitiul3.model.FactoryClient;
import ro.ase.cts.flyweight.exercitiul3.model.IFlyweight;
import ro.ase.cts.flyweight.exercitiul3.model.Rezervare;
import ro.ase.cts.flyweight.exercitiul4.model.*;

public class Main {
    public static void main(String[] args) {

    Reteta reteta1 = new Reteta("Ionel", "reteta1", "raceala");

    IRecomandari recomnadare = new Recomandari(" recomandare generala", reteta1);
    recomnadare.afiseazaReteta();
    }
}