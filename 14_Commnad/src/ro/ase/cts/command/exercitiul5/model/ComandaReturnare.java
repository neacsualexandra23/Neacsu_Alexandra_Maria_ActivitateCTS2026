package ro.ase.cts.command.exercitiul5.model;

public class ComandaReturnare  implements AbstractComanda {

    private Biblioteca biblioteca;
    private String numeCarte;

    public ComandaReturnare(
            Biblioteca biblioteca,
            String numeCarte) {

        this.biblioteca = biblioteca;
        this.numeCarte = numeCarte;
    }

    @Override
    public void executa() {
        biblioteca.returneazaCarte(numeCarte);
    }
}