package ro.ase.cts.command.exercitiul5.model;

public class ComandaImprumut implements AbstractComanda {

    private Biblioteca biblioteca;
    private String numeCarte;

    public ComandaImprumut(
            Biblioteca biblioteca,
            String numeCarte) {

        this.biblioteca = biblioteca;
        this.numeCarte = numeCarte;
    }

    @Override
    public void executa() {
        biblioteca.imprumutaCarte(numeCarte);
    }
}