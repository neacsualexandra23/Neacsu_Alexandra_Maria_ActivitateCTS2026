package ro.ase.cts.command.exercitiul1.model;

public class ComandaStinge implements IComanda {
    private Bec bec;

    public ComandaStinge(Bec bec) {
        this.bec = bec;
    }

    @Override
    public void executa() {
        bec.stinge();
    }
}