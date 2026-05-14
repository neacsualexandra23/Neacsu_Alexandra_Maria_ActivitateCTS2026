package ro.ase.cts.proxy.exercitiul6.model;

public class Spalatorie implements ISpalatorie{
    @Override
    public void washCar(Client client) {
        System.out.println( "Spala masina");
    }
}