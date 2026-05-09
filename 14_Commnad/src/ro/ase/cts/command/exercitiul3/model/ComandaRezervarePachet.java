package ro.ase.cts.command.exercitiul3.model;

public class ComandaRezervarePachet implements IComanda {
    private OperatorTurism operator;
    private String destinatie;

    public ComandaRezervarePachet(OperatorTurism operator, String destinatie) {
        this.operator = operator;
        this.destinatie = destinatie;
    }

    @Override
    public void executa() {
        operator.rezervaPachet(destinatie);
    }
}