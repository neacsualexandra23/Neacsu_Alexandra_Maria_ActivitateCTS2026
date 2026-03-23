package ro.ase.cts.facade.exercitiul2.main;

import ro.ase.cts.facade.exercitiul2.model.*;
public class Main {
    public static void main(String[] args) {
        Facade rezervareSejur = new Facade();
        rezervareSejur.rezervaPachetCazareTransport("Bucuresti", "Paris");
    }
}