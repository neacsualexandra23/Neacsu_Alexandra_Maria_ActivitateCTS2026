package ro.ase.cts.command.exercitiul4.main;
import ro.ase.cts.command.exercitiul4.model.*;
public class Main {
    public static void main(String[] args) {
        Bucatar bucatar = new Bucatar();
        Chelner chelner = new Chelner();

        chelner.adaugaComanda(new ComandaPreparareFel(bucatar, "Pizza"));
        chelner.adaugaComanda(new ComandaPreparareFel(bucatar, "Paste"));
        chelner.adaugaComanda(new ComandaPreparareFel(bucatar, "Inghetata"));

        chelner.trimiteComenzi();
    }
}
/*
Chelnerul preia comenzi de la clienți și le trimite către bucătar.
Bucătarul pregătește preparatele. Chelnerul poate lua mai multe
comenzi fără să aștepte finalizarea lor.
 */