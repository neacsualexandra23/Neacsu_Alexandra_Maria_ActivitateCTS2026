package ro.ase.cts.command.exercitiul1.main;
import ro.ase.cts.command.exercitiul1.model.*;
public class Main {
    public static void main(String[] args) {
        Bec bec = new Bec();

        IComanda aprinde = new ComandaAprinde(bec);
        IComanda stinge = new ComandaStinge(bec);

        Telecomanda telecomanda = new Telecomanda();

        telecomanda.setComanda(aprinde);
        telecomanda.apasaButon();

        telecomanda.setComanda(stinge);
        telecomanda.apasaButon();
    }
}

/*
Pattern-ul Command:
-transformă o cerere într-un obiect
-permite:

executare
undo (opțional)
cozi / istoric de comenzi
Exemplu CTS – Telecomandă

Avem:

-un bec (receiver)
-comenzi: aprinde / stinge
-o telecomandă (invoker)
 */