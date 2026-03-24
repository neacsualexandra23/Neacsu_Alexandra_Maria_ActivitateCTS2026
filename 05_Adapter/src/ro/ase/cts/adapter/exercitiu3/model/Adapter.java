package ro.ase.cts.adapter.exercitiu3.model;

public class Adapter implements IComanda{
    private ComandaExterna comandaExterna;

    public Adapter(ComandaExterna comandaExterna){
        this.comandaExterna =comandaExterna;
    }

    @Override
    public void afiseazaDetalii() {
        comandaExterna.afiseaza();
    }

    @Override
    public void proceseazaComanda() {
        comandaExterna.proceseaza();
    }
}
