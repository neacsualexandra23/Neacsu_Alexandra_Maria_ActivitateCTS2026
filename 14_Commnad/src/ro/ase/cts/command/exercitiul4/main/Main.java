package ro.ase.cts.command.exercitiul4.main;
import ro.ase.cts.command.exercitiul4.model.*;
public class Main {
    public static void main(String[] args) {
        Bucatar bucatar = new Bucatar();
        Chelner chelner = new Chelner();

        IComanda comanda1=new ComandaPreparareFel(bucatar, "Pizza");
        IComanda comanda2=new ComandaPreparareFel(bucatar, "Paste");
        IComanda comanda3=new ComandaPreparareFel(bucatar, "Inghetata");

        chelner.adaugaComanda(comanda1);
        chelner.adaugaComanda(comanda2);
        chelner.adaugaComanda(comanda3);

        chelner.trimiteComenzi();
    }
}
/*
Chelnerul preia comenzi de la clienți și le trimite către bucătar.
Bucătarul pregătește preparatele. Chelnerul poate lua mai multe
comenzi fără să aștepte finalizarea lor.
 */