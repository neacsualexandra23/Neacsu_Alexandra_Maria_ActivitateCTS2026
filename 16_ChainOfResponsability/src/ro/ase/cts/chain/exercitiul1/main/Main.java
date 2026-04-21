package ro.ase.cts.chain.exercitiul1.main;
import ro.ase.cts.chain.exercitiul1.model.*;
public class Main {
    public static void main(String[] args) {

        IHandler manager = new Manager();
        IHandler director = new Director();
        IHandler ceo = new CEO();

        manager.setNext(director);
        director.setNext(ceo);

        manager.handle(200);
        manager.handle(2000);
        manager.handle(10000);
    }
}

/*Avem un sistem de aprobare cereri:

Manager → aprobă până la 1000
Director → aprobă până la 5000
CEO → aprobă orice
 O cerere trece prin “lanț” până găsește cine o poate rezolva.
O cerere trece prin “lanț” până găsește cine o poate rezolva.

Ideea patternului
=================
Obiectele sunt legate într-un lanț
Fiecare decide:
rezolvă cererea
sau o trimite mai departe
 */