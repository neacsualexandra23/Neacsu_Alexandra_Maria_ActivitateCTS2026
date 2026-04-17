package ro.ase.cts.strategy.exercitiul1.model;

public class PlataCard implements IModPlata {
    private String numarCard;

    public PlataCard(String numarCard) {
        this.numarCard = numarCard;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul " + numarCard + " suma: " + suma);
    }
}