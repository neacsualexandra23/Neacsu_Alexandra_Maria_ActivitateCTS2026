package ro.ase.cts.singleton.exercitiu3.main;


import ro.ase.cts.singleton.exercitiu3.model.*;

public class Main {
    public static void main(String[] args) {

        IService service = ServiceAuto.getInstance();

        AMasina m1 = new Van("M5");
        AMasina m2 = new Sedan("Audi A6");
        AMasina m3 = new Suv("Toyota Land Cruiser");
        AMasina m4 = new Sedan("Mercedes C Class");

        // flux de 4 masini care vin la service
        service.primesteMasina(m1);
        service.incepeReparatiaUrmatoarei();

        service.primesteMasina(m2); // ocupat -> refuzata
        service.primesteMasina(m3); // ocupat -> refuzata

        service.finalizeazaReparatiaCurenta(); // elibereaza service-ul

        service.primesteMasina(m2); // acum e acceptata
        service.incepeReparatiaUrmatoarei();

        service.finalizeazaReparatiaCurenta();

        service.primesteMasina(m4); // acceptata
        service.incepeReparatiaUrmatoarei();
        service.finalizeazaReparatiaCurenta();
    }
}