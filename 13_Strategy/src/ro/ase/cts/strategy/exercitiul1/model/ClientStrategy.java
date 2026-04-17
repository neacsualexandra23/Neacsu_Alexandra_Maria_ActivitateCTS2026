package ro.ase.cts.strategy.exercitiul1.model;

public class ClientStrategy {
    private String nume;
    private IModPlata modPlata;

    public ClientStrategy(String nume) {
        this.nume = nume;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double suma) {
        if(modPlata != null) {
            modPlata.plateste(suma);
        } else {
            System.out.println("Nu exista metoda de plata!");
        }
    }
}