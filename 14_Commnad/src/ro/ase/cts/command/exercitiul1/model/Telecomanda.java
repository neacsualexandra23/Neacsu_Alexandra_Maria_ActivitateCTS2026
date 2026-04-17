package ro.ase.cts.command.exercitiul1.model;

public class Telecomanda {
    private IComanda comanda;

    public void setComanda(IComanda comanda) {
        this.comanda = comanda;
    }

    public void apasaButon() {
        if (comanda != null) {
            comanda.executa();
        }
    }
}