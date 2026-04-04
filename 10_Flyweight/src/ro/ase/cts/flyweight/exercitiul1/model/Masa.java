package ro.ase.cts.flyweight.exercitiul1.model;

public class Masa implements IFlyweight {

    private int nrMasa;
    private int nrLocuri;

    public Masa(int nrMasa, int nrLocuri) {
        this.nrMasa = nrMasa;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println("Masa " + nrMasa +
                " (" + nrLocuri + " locuri) | " +
                "Client: " + rezervare.getNumeClient() +
                " | Ora: " + rezervare.getOra());
    }
}