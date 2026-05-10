package ro.ase.cts.command.exercitiul4.main;
import ro.ase.cts.command.exercitiul4.model.*;
public class Main {
    public static void main(String[] args) {
        Bucatar bucatar = new Bucatar();
        Chelner chelner = new Chelner();

        chelner.adaugaComanda(new ComandaPreparareFel(bucatar, "Pizza"));
        chelner.adaugaComanda(new ComandaPreparareFel(bucatar, "Paste"));

        chelner.trimiteComenzi();
    }
}