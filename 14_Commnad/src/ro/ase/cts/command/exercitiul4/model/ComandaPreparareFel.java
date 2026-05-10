package ro.ase.cts.command.exercitiul4.model;

public class ComandaPreparareFel implements IComanda {
    private Bucatar bucatar;
    private String fel;

    public ComandaPreparareFel(Bucatar bucatar, String fel) {
        this.bucatar = bucatar;
        this.fel = fel;
    }

    @Override
    public void executa() {
        bucatar.preparaFel(fel);
    }
}