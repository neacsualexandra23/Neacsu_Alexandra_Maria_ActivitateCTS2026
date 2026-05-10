package ro.ase.cts.command.exercitiul4.model;

import java.util.LinkedList;
import java.util.Queue;

public class Chelner {
    private Queue<IComanda> comenzi = new LinkedList<>();

    public void adaugaComanda(IComanda comanda) {
        comenzi.add(comanda);
    }

    public void trimiteComenzi() {
        while (!comenzi.isEmpty()) {
            comenzi.poll().executa();
        }
    }
}