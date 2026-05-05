package ro.ase.cts.strategy.exercitiul2.model;

public class ClientStrategy implements IModPlata{
    private String nume;
    private IModPlata modPlata;

    public ClientStrategy(){
        this.nume=nume;
    }
    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    @Override
    public void plateste(double suma) {
        modPlata.plateste(suma);
    }
}
