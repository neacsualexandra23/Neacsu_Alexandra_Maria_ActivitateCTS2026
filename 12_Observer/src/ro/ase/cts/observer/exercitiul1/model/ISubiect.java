package ro.ase.cts.observer.exercitiul1.model;

public interface ISubiect {
    void adaugaObserver(IObserver observer);
    void stergeObserver(IObserver observer);
    void notificaObserveri(String mesaj);
}