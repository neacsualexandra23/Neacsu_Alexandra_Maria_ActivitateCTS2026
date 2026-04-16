package ro.ase.cts.proxy.exercitiul2_.model;


import java.util.ArrayList;
import java.util.List;

public class ProxyAccesClub implements IAccesClub {
    private IAccesClub accesClub;
    /* adaug lista*/ private List<String> persoaneInAsteptare = new ArrayList<>();

    public ProxyAccesClub(IAccesClub accesClub) {
        this.accesClub = accesClub;
    }

    @Override
    public void permiteAcces(String nume, int varsta) {
        if (varsta < 18) {
            System.out.println("Acces interzis pentru " + nume +
                    ". Varsta minima este de 18 ani.");
            return;
        }

        System.out.println(nume + " are varsta valida si asteapta sa se formeze grupul.");
        persoaneInAsteptare.add(nume);

        if (persoaneInAsteptare.size() >= 2) {
            System.out.println("\nS-au strans minim 2 persoane. Se permite accesul:\n");

            for (String persoana : persoaneInAsteptare) {
                accesClub.permiteAcces(persoana, 20); // varsta nu mai conteaza aici
            }

            persoaneInAsteptare.clear();
            System.out.println();
        }
    }
}