package ro.ase.cts.flyweight.exercitiul3.main;

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

        IFlyweight client3 = factory.getClient("0722222888");
        client3.afiseazaRezervare(new Rezervare(3, 4, "18:00"));
    }
}
/*
Pentru fiecare rezervare trebuie să se rețină informații cu
 privire la clientul restaurantului precum: nume, număr de telefon,
 adresă de mail, etc, precum și informațiile despre masa rezervata:
 număr masa, număr persoane, ora rezervare, etc. Astfel,
 dacă un client realizează mai multe rezervări, la fiecare rezervare,
 informațiile despre client sunt aceleași și se repetă, ocupând foarte multă memorie.
 Să se implementeze modulul de memorare al rezervărilor astfel încât
 să nu ocupe memorie foarte multă.
 */