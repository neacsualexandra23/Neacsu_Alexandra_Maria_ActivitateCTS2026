package ro.ase.cts.flyweight.exercitiul3.main;

import ro.ase.cts.flyweight.exercitiul3.model.*;



import ro.ase.cts.flyweight.exercitiul3.model.*;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 2, "12:00");
        Rezervare rezervare2 = new Rezervare(1, 2, "13:00");

        FactoryClient factory = new FactoryClient();

        IFlyweight client1 = factory.getClient("0711111111");
        client1.afiseazaRezervare(rezervare1);

        IFlyweight client2 = factory.getClient("0711111111");
        client2.afiseazaRezervare(rezervare2);

        IFlyweight client3 = factory.getClient("0722222222");
        client3.afiseazaRezervare(new Rezervare(3, 4, "18:00"));
    }
}