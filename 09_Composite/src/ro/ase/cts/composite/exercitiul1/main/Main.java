package ro.ase.cts.composite.exercitiul1.main;
import ro.ase.cts.composite.exercitiul1.model.*;

public class Main { public static void main(String[] args) {
    Fisier f1 = new Fisier("a.txt");
    Fisier f2 = new Fisier("b.txt");
    Fisier f3 = new Fisier("c.txt");

    Folder folder = new Folder("Documente");
    folder.adauga(f1);
    folder.adauga(f2);
    folder.adauga(f3);

    folder.afiseaza();
}
}
