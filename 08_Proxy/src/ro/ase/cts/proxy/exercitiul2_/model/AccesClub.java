package ro.ase.cts.proxy.exercitiul2_.model;

public class AccesClub implements IAccesClub {

    @Override
    public void permiteAcces(String nume, int varsta, boolean areEchipament,boolean areInvitatie) {
        System.out.println("Persoana " + nume + " a intrat in club.");
    }
}