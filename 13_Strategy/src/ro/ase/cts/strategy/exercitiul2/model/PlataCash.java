package ro.ase.cts.strategy.exercitiul2.model;

public class PlataCash implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("pacientul a platit cu cash " + suma);
    }
}
