package ro.ase.cts.proxy.exercitiul3.model;

public class AccesSpital implements ISpital{


    @Override
    public void interneaza(String nume,boolean areScrisoare ) {
        System.out.println("pacientul  a fost internat");
    }
}
