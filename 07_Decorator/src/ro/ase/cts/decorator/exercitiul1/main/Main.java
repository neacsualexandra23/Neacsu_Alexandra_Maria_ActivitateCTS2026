package ro.ase.cts.decorator.exercitiul1.main;

import ro.ase.cts.decorator.exercitiul1.model.*;

public class Main {
    public static void main(String[] args) {

        IPizza pizza = new Pizza();
        pizza = new Mozzarella(pizza);
        pizza = new Ciuperci(pizza);
        pizza = new Salam(pizza);

        System.out.println(pizza.getDescriere());
        System.out.println("Pret: " + pizza.getPret());
    }
}

/*
Se dezvoltă o aplicație pentru o pizzerie.
Aplicația trebuie să permită:

->definirea unei pizza de bază (ex: Margherita)
->adăugarea dinamică de ingrediente suplimentare:
    - mozzarella extra
    - ciuperci
    - salam
    - sos picant

 Clientul trebuie să poată adăuga ingrediente fără a
 modifica clasa de bază Pizza.

Fiecare ingredient adaugat:
   modifică descrierea pizza
   crește prețul

Să se folosească pattern-ul Decorator.

Structura soluției
IPizza → interfață
Pizza → implementare de bază
DecoratorPizza → decorator abstract
clase concrete:
Mozzarella
Ciuperci
Salam

Implementare
1. Interfață
public interface IPizza {
    String getDescriere();
    double getPret();
}
 */