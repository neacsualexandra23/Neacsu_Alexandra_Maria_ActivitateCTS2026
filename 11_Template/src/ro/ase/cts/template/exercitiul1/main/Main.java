package ro.ase.cts.template.exercitiul1.main;

import ro.ase.cts.template.exercitiul1.model.*;
public class Main {
    public static void main(String[] args) {

        IProcesareComanda comanda1 = new ComandaRestaurant();
        IProcesareComanda comanda2 = new ComandaLaPachet();

        System.out.println("=== Restaurant ===");
        comanda1.proceseazaComanda();

        System.out.println("\n=== La pachet ===");
        comanda2.proceseazaComanda();
    }
}
/*
Se dorește implementarea unui sistem de procesare a comenzilor
într-un restaurant.

Fluxul de procesare al unei comenzi este fix și presupune
următorii pași:

-preluarea comenzii
-prepararea produselor
-servirea comenzii
-emiterea notei de plată

Deși ordinea pașilor este aceeași pentru toate comenzile,
modul de realizare a etapelor de preparare și servire diferă
în funcție de tipul comenzii:

->pentru comenzile servite în restaurant
->pentru comenzile la pachet

Să se implementeze acest sistem folosind pattern-ul
Template Method, astfel încât:

algoritmul general să fie definit într-o clasă abstractă
pașii variabili să fie implementați în clase concrete

De asemenea, să se definească o interfață pentru procesarea
comenzilor și să se demonstreze funcționarea sistemului prin
intermediul unui program principal.
 */