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
/*
Managerul stadionului dorește organizarea locurilor pe care stau
spectatorii într-o structura arborescenta. Astfel locurile vor fi
organizate in cadrul aplicației pe secțiuni (Tribuna, Peluza, etc)
Fiecare secțiune conține subsecțiuni (Tribuna Nord, Tribuna Sud,
Tribuna Copii, VIP, etc) sau direct locurile din acea secțiune.
Sa se realizeze modulul care permite reprezentarea arborescenta a
 locurilor spectatorilor in cadrul aplicației.
 */