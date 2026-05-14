package ro.ase.cts.proxy.exercitiul6.model;

public class Client {
    private Boolean areInvitatie;
    private String nume;


    public Client(Boolean areInvitatie, String nume){
        this.areInvitatie=areInvitatie;
        this.nume=nume;
    }
    public String getNume() {
        return nume;
    }

    public Boolean getAreInvitatie() {
        return areInvitatie;
    }
}