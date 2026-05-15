package ro.ase.cts.command.exercitiul5.main;

import ro.ase.cts.command.exercitiul5.model.*;
public class Main {
    public static void main(String[] args) {

                Biblioteca biblioteca = new Biblioteca();

                AbstractComanda c1 =new ComandaImprumut(biblioteca,"Carte1");
                AbstractComanda c2 =new ComandaReturnare(biblioteca,"Carte2");

                c1.executa();
                c2.executa();
            }
        }


/*
O aplicație pentru administrarea unei biblioteci permite efectuarea
mai multor operații asupra cărților: împrumutare carte, returnare carte,
rezervare carte și anulare rezervare.

Fiecare comandă trebuie să aibă aceeași metodă de execuție, iar aplicația nu trebuie să depindă direct de clasele care realizează
operațiile concrete asupra cărților.

Pentru implementare se va folosi interfața:

public interface AbstractComanda {
    void executa();
}
 */