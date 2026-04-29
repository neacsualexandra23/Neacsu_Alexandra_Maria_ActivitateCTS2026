package ro.ase.cts.proxy.exercitiul2_.main;
import  ro.ase.cts.proxy.exercitiul2_.model.*;
public class Main {
    public static void main(String[] args) {
        IAccesClub acces = new ProxyAccesClub(new AccesClub());

        acces.permiteAcces("Andrei", 22, true,true);  // asteapta
        acces.permiteAcces("Maria", 17, true,false);   // respins
        acces.permiteAcces("Alex", 18, false,true);    //nu formeaza grup -> intra amandoi dar nu are echipament
        acces.permiteAcces("Alina", 20, true,false);    // formeaza grup -> intra amandoi
        acces.permiteAcces("Ioana", 15, true,true);   // respins
        acces.permiteAcces("Mara", 20, true,false);    // formeaza grup -> intra amandoi
    }
}