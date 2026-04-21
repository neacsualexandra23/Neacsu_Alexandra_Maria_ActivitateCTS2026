package ro.ase.cts.composite.exercitiul3.main;
import ro.ase.cts.composite.exercitiul3.model.*;

public class Main {
    public static void main(String[] args) {
    Produs p1 = new Produs("bomboane tofefe");
    Produs p2 = new Produs("bomboane alka");
    Produs p3 = new Produs("bomboane trufe");

    Cutie cutie1 = new Cutie("cutie");
    cutie1.adauga(p1);
    cutie1.adauga(p2);
    cutie1.adauga(p3);

        Cutie cutie2 = new Cutie("cutie");
        cutie2.adauga(p1);

  //  cutie.afiseaza();
    Bax bax = new Bax("Bax ")    ;
    bax.adauga(cutie1);
    bax.adauga(cutie2);

    bax.afiseaza();
}
}
/*
compozite arbore pe 3 nivele  bax cutii produse
 */