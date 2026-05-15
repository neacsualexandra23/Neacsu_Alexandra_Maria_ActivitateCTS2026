package ro.ase.cts.command.exercitiul5.model;

public class Biblioteca {

    public void imprumutaCarte(String numeCarte) {
        System.out.println("Carte imprumutata: " + numeCarte);
    }

    public void returneazaCarte(String numeCarte) {
        System.out.println("Carte returnata: " + numeCarte);
    }
}