package ro.ase.cts.strategy.exercitiul1.model;

public class PlataPayPal implements IModPlata {
    private String email;

    public PlataPayPal(String email) {
        this.email = email;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Plata PayPal de pe " + email + " suma: " + suma);
    }
}