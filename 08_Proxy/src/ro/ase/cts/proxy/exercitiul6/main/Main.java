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
/*
Deoarece este foarte aglomerat la spălătorie managerul dorește să
fie serviți doar clienții care au abonament. Astfel se dorește
implementarea unui modul care atunci când primește un client căruia
să îi spele mașina, aceasta să fie spălata doar dacă clientul respectiv
 are abonament valabil. În cazul în care abonamentul nu este valabil,
 clientului i se spune ca nu sunt locuri disponibile.

si sa nu fie intr o lista de clienti interzisi
 */