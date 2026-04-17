package ro.ase.cts.strategy.exercitiul1.main;
import ro.ase.cts.strategy.exercitiul1.model.*;

public class Main {
    public static void main(String[] args) {
        ClientStrategy client = new ClientStrategy("Ana");

        // Plata cash
        client.setModPlata(new PlataCash());
        client.plateste(100);

        // Schimbare strategie -> card
        client.setModPlata(new PlataCard("1234-5678"));
        client.plateste(200);

        // Schimbare strategie -> PayPal
        client.setModPlata(new PlataPayPal("ana@mail.com"));
        client.plateste(300);
    }
}

/*
Pattern-ul Strategy permite schimbarea comportamentului unui obiect la runtime,
fără să modifici clasa respectivă.

Practic: separi algoritmii în clase diferite și îi faci interschimbabili.

Modalitate de plată
Avem un sistem de plată unde clientul poate plăti:
- cu card
- cash
- PayPal
 */