package ro.ase.cts.command.exercitiul1.model;

public class ComandaAprinde implements IComanda {
    private Bec bec;

    public ComandaAprinde(Bec bec) {
        this.bec = bec;
    }

    @Override
    public void executa() {
        bec.aprinde();
    }
}