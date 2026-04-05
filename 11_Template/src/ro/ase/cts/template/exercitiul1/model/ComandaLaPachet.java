package ro.ase.cts.template.exercitiul1.model;

public class ComandaLaPachet extends ProcesareComanda {

    @Override
    protected void preparare() {
        System.out.println("Se prepara mancarea pentru pachet...");
    }

    @Override
    protected void servire() {
        System.out.println("Comanda este ambalata si ridicata...");
    }
}