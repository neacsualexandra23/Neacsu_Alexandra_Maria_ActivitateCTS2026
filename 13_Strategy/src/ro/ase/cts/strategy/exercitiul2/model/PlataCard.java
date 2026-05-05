package ro.ase.cts.strategy.exercitiul2.model;

public class PlataCard implements IModPlata {
    private String numarCard;

    public PlataCard(String numarCard){
        this.numarCard=numarCard;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("pacientul a platit cu cardul "+numarCard + suma );
    }
}
