package ro.ase.cts.strategy.exercitiul2.main;


import ro.ase.cts.strategy.exercitiul2.model.*;



public class Main {
    public static void main(String[] args) {
        IModPlata plata1=new PlataCash();
        IModPlata plata2=new PlataCard("856764");


        ClientStrategy client=new ClientStrategy();
        client.setModPlata(plata1);
        client.plateste(897986);
        client.setModPlata(plata2);
        client.plateste(7858675);
    }
}
