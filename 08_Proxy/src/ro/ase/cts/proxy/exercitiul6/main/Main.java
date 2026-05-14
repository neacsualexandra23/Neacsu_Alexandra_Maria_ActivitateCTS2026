package ro.ase.cts.proxy.exercitiul6.main;

import ro.ase.cts.proxy.exercitiul6.model.*;


public class Main {
    public static void main(String[] args) {
        ISpalatorie spalatorie=new Proxy(new Spalatorie());

        Client client1=new Client(true,"ion");
        Client client2=new Client(true,"alin");
        spalatorie.washCar(client1);
        spalatorie.washCar(client2);
    }
}