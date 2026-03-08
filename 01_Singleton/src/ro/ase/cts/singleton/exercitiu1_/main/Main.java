package ro.ase.cts.singleton.exercitiu1_.main;

/* exercitiul 1 cu interfata*/
import ro.ase.cts.singleton.exercitiu1_.model.*;


public class Main {

    public static void main(String[] args) {

        IRegistruInternari r1 = RegistruInternari.getInstance();
        IRegistruInternari r2 = RegistruInternari.getInstance();

        r1.afiseazaMesaj();

        System.out.println(r1 == r2);
    }
}