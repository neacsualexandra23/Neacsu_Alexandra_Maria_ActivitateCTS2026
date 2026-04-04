package ro.ase.cts.flyweight.exercitiul1.main;

import ro.ase.cts.flyweight.exercitiul1.model.*;

public class Main {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        // se creează o singură dată masa 1
        IFlyweight masa1 = factory.getMasa(1, 4);

        // reutilizare aceeași masă cu rezervări diferite
        masa1.afiseazaRezervare(new Rezervare("Popescu", "18:00"));
        masa1.afiseazaRezervare(new Rezervare("Ionescu", "20:00"));

        // altă masă
        IFlyweight masa2 = factory.getMasa(2, 2);
        masa2.afiseazaRezervare(new Rezervare("Georgescu", "19:00"));

        // verificare reutilizare
        IFlyweight masa1Again = factory.getMasa(1, 4);
        System.out.println(masa1 == masa1Again); // true
    }
}
/*

Să se implementeze un sistem de rezervări la mese într-un restaurant,
unde informațiile comune despre masă (număr, poziție)
sunt partajate, iar detaliile specifice rezervării (nume client, oră)
 sunt transmise la utilizare
(shared) = masa (nr, poziție)
(dinamic) = client, oră
 */