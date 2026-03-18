package ro.ase.cts.singleton.exercitiul3_.main;


import ro.ase.cts.singleton.exercitiul3_.model.*;


public class Main {
    public static void main(String[] args) {

        IService service1 = ServiceAuto.getInstance();
        IService service2 = ServiceAuto.getInstance();
        System.out.println(service1 == service1);

        AMasina m1 = new Masina("BMW");
        AMasina m2 = new Masina("Audi");
        AMasina m3 = new Masina("Toyota");
        AMasina m4 = new Masina("Mercedes");

      //  service1.primesteMasina(m1);


     //   service1.primesteMasina(m2); // respinsa (ocupat)
     //   service1.primesteMasina(m3); // respinsa (ocupat)
     //   service1.primesteMasina(m4); // respinsa (ocupat)

     //   service1.finalizeazaReparatia(); // elibereaza

      //  service1.primesteMasina(m2); // acum acceptata

     //   service1.finalizeazaReparatia();
    }
}


/*1. În cadrul aplicației de gestiune a activității unui service auto,
se dorește implementarea unui modul de organizare a intrării mașinilor
în service. Se dorește ca modulul să nu permită crearea mai multor
service-uri în aplicație astfel încât, la un moment, să fie acceptată
o singură mașină în service pentru reparații. Service-ul trebuie
să implementeze interfața IService iar mașinile acceptate în service
trebuie să extindă clasa abstractă AMasina.
2. Să se testeze soluția prin crearea unui service care să gestioneze
un flux de minim 4 mașini care se prezintă pentru reparații.*/