package ro.ase.cts.adapter.exercitiu3.model;

public class ComandaInterna implements IComanda{

    @Override
    public void afiseazaDetalii() {
        System.out.println(" afiseaza detalii comanda interna");
    }

    @Override
    public void proceseazaComanda() {
        System.out.println(" proceseaza Comanda ");
    }
}
