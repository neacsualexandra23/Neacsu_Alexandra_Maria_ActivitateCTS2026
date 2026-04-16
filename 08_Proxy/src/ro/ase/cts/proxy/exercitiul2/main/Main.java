package ro.ase.cts.proxy.exercitiul2.main;

import ro.ase.cts.proxy.exercitiul2.model.*;
public class Main {
    public static void main(String[] args) {
        IAccesClub acces = new ProxyAccesClub(new AccesClub());

        acces.permiteAcces("Andrei", 22);
        acces.permiteAcces("Maria", 17);
        acces.permiteAcces("Alex", 18);
        acces.permiteAcces("Ioana", 15);
    }
}

/*
pot intra in club doar daca au peste 18 ani si sunt cel putin 2 pers
 */