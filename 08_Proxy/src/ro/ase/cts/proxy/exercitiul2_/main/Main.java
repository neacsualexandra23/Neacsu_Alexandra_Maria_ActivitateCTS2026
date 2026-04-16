package ro.ase.cts.proxy.exercitiul2_.main;
import  ro.ase.cts.proxy.exercitiul2_.model.*;
public class Main {
    public static void main(String[] args) {
        IAccesClub acces = new ProxyAccesClub(new AccesClub());

        acces.permiteAcces("Andrei", 22);  // asteapta
        acces.permiteAcces("Maria", 17);   // respins
        acces.permiteAcces("Alex", 18);    // formeaza grup -> intra amandoi
        acces.permiteAcces("Ioana", 15);   // respins
    }
}