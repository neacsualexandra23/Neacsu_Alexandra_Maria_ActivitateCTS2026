package ro.ase.cts.template.exercitiul1.model;

public class ComandaRestaurant extends ProcesareComanda {

    @Override
    protected void preparare() {
        System.out.println("Se prepara mancarea in bucatarie...");
    }

    @Override
    protected void servire() {
        System.out.println("Chelnerul serveste clientul la masa...");
    }
}