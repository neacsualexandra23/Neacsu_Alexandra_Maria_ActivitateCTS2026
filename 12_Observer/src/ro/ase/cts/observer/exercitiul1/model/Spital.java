package ro.ase.cts.observer.exercitiul1.model;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISubiect {
    private List<IObserver> observers;

    public Spital() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (IObserver observer : observers) {
            observer.primesteNotificare(mesaj);
        }
    }

    public void anuntaProgramNou() {
        notificaObserveri("Spitalul a introdus un nou program de vizita.");
    }

    public void anuntaServiciuNou() {
        notificaObserveri("Spitalul ofera un nou serviciu de cardiologie.");
    }
}