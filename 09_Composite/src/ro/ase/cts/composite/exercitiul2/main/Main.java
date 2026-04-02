package ro.ase.cts.composite.exercitiul2.main;

import ro.ase.cts.composite.exercitiul2.model.*;

import java.util.List;
public class Main {
    public static void main(String[] args) {

        try {
            // Structura ierarhica
            Categorie rezervari = new Categorie("Rezervari Restaurant");

            Categorie interior = new Categorie("Interior");
            Categorie terasa = new Categorie("Terasa");

            // Item = rezervari individuale
            Item r1 = new Item("Masa 1 - 2 persoane");
            Item r2 = new Item("Masa 2 - 4 persoane");
            Item r3 = new Item("Masa 5 - terasa");
            Item r4 = new Item("Masa 6 - terasa");

            // Construire structură
            interior.adaugaRezervare(r1);
            interior.adaugaRezervare(r2);

            terasa.adaugaRezervare(r3);
            terasa.adaugaRezervare(r4);

            rezervari.adaugaRezervare(interior);
            rezervari.adaugaRezervare(terasa);

            // Afisare structura completa
            System.out.println("=== STRUCTURA INITIALA ===");
            rezervari.info();

            // Accesare element
            System.out.println("\n=== REZERVARE DIN INTERIOR (index 1) ===");
            IRezervare rezervare = interior.getRezervare(1);
            rezervare.info();

            // Stergere rezervare
            System.out.println("\n=== DUPA STERGERE ===");
            interior.stergeRezervare(r2);
            rezervari.info();

        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}