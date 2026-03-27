package ro.ase.cts.proxy.exercitiul2.model;

public class ProxyAccesClub implements IAccesClub {
    private IAccesClub accesClub;

    public ProxyAccesClub(IAccesClub accesClub) {
        this.accesClub = accesClub;
    }

    @Override
    public void permiteAcces(String nume, int varsta) {
        if (varsta >= 18) {
            accesClub.permiteAcces(nume, varsta);
        } else {
            System.out.println("Acces interzis pentru " + nume +
                    ". Varsta minima este de 18 ani.");
        }
    }
}