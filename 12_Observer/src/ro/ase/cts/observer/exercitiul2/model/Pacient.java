package ro.ase.cts.observer.exercitiul2.model;
public class Pacient implements IObserver {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " a primit: " + mesaj);
    }
}