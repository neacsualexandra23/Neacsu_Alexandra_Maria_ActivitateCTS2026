package ro.ase.cts.strategy.exercitiul1.model;

public class PlataCash implements IModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cash suma: " + suma);
    }
}