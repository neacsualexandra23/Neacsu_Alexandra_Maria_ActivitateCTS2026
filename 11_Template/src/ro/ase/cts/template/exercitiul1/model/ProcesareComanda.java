package ro.ase.cts.template.exercitiul1.model;

public abstract class ProcesareComanda implements IProcesareComanda {

    @Override
    public final void proceseazaComanda() {
        preluareComanda();
        preparare();
        servire();
        incasare();
    }

    private void preluareComanda() {
        System.out.println("Se preia comanda...");
    }

    private void incasare() {
        System.out.println("Se emite nota de plata...");
    }

    protected abstract void preparare();
    protected abstract void servire();
}