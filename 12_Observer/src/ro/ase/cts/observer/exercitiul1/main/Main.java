package ro.ase.cts.observer.exercitiul1.main;

import ro.ase.cts.observer.exercitiul1.model.*;
public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();

        IObserver pacient1 = new Pacient("Andrei");
        IObserver pacient2 = new Pacient("Maria");
        IObserver pacient3 = new Pacient("Elena");

        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient2);
        spital.adaugaObserver(pacient3);

        spital.anuntaProgramNou();
        System.out.println();

        spital.stergeObserver(pacient2);

        spital.anuntaServiciuNou();
    }
}

/*

notificarea pacienților abonați la un spital

Când spitalul anunță apariția unui nou serviciu medical sau a unui nou program de vizită, toți pacienții abonați primesc notificare automat.
Aici:
Spitalul = Subject / Observable
Pacientul = Observer
când apare o schimbare, toți observerii sunt notificați
Explicație scurtă

Pattern-ul Observer se folosește atunci când un obiect trebuie să anunțe automat mai multe obiecte dependente de schimbările sale de stare.

Elemente cheie:
-există un subiect principal
-există mai mulți observatori
-observatorii se pot abona și dezabona
-la un eveniment, toți observatorii primesc notificare
 */