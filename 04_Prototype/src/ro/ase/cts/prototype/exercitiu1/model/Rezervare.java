package ro.ase.cts.prototype.exercitiu1.model;

public class Rezervare implements IPrototype {

    private String numeClient;
    private String nrTelefon;
    private int nrPersoane;

    public Rezervare(String numeClient, String nrTelefon, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.nrPersoane = nrPersoane;

        System.out.println("Constructor apelat");
    }

    private Rezervare() {
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public IPrototype copiaza() {
        Rezervare copie = new Rezervare();
        copie.numeClient = this.numeClient;
        copie.nrTelefon = this.nrTelefon;
        copie.nrPersoane = this.nrPersoane;
        return copie;
    }

    @Override
    public void print() {
        System.out.println("numeClient: "+numeClient+"nrTelefon: "+nrTelefon+"nrPersoane:"+nrPersoane);
    }
}