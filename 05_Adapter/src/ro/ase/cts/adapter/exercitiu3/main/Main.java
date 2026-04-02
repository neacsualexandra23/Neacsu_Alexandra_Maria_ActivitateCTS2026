package ro.ase.cts.adapter.exercitiu3.main;

import ro.ase.cts.adapter.exercitiu3.model.*;

public class Main {
    public static void main(String[] args) {
    IComanda comandaInterna = new ComandaInterna();
    comandaInterna.afiseazaDetalii();
    comandaInterna.proceseazaComanda();

    ComandaExterna comandaExterna = new ComandaExterna();
    IComanda adapter = new Adapter(comandaExterna);
    adapter.afiseazaDetalii();
    adapter.proceseazaComanda();


}
}


/*
Se dezvoltă o aplicație software pentru o firmă de livrări.
Sistemul existent utilizează interfața IComanda, care permite:
afișarea detaliilor comenzii
procesarea comenzii
Recent, firma a achiziționat un sistem nou pentru gestionarea comenzilor externe,
implementat prin clasa ComandaExterna.
Aceasta oferă metode diferite:
afiseaza() pentru afișare
executa() pentru procesare

Sistemul nou nu este compatibil cu interfața IComanda, iar aplicația existentă nu trebuie modificată.
Cerințe:
1.Să se implementeze un Adapter care să permită utilizarea
 obiectelor de tip ComandaExterna în cadrul sistemului existent.
2.Să se creeze:
un obiect compatibil (ComandaOnline)
un obiect incompatibil (ComandaExterna)
și să se demonstreze utilizarea acestora folosind aceeași metodă de procesare.
3.
Să se evidențieze faptul că aplicația existentă nu este modificată.
se da interfata:

public interface IComanda {

    void afiseazaDetalii();

    void proceseazaComanda();
}
 */
