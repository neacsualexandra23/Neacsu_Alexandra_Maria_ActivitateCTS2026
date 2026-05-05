package ro.ase.cts.observer.exercitiul2.main;


import ro.ase.cts.observer.exercitiul1.model.*;

public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();

        Pacient p1 = new Pacient("Ana");
        Pacient p2 = new Pacient("Ion");

        spital.adaugaObserver(p1);
        spital.adaugaObserver(p2);

        spital.notificaObserveri("A aparut un virus nou!");
    }
}

/*
Spitalul dorește să anunțe toți pacienții care au fost în spital
ori de câte ori apare vreo urgență cu privire la viruși existenți
în oraș. Astfel se dorește implementarea unui modul care atunci
când apare o epidemie sau un virus nou să se trimită notificări
tuturor persoanelor abonate la notificările spitalului.
 */