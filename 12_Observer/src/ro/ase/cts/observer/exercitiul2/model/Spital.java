package ro.ase.cts.observer.exercitiul2.model;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISubiect {
    private List<IObserver> observeri = new ArrayList<>();

    @Override
    public void adaugaObserver(IObserver observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        observeri.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (IObserver o : observeri) {
            o.primesteNotificare(mesaj);
        }
    }

    public void alertaVirus(String mesaj) {
        notificaObserveri(mesaj);
    }
}