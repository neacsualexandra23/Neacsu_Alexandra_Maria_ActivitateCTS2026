package ro.ase.cts.chain.exercitiul2.main;

import ro.ase.cts.chain.exercitiul2.model.*;


public class Main {
    public static void main(String[] args) {

        IHandler email=new Email();
        IHandler sms=new SMS();
        IHandler manager=new Manager();

        email.setUrmatorul(sms);
        sms.setUrmatorul(manager);

        email.notifica("Ionel", "email");
        email.notifica("Ana", "sms");
        email.notifica("Andrea","sms");
        email.notifica("Nicu","manager");

    }
}
/*
Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte.
 Astfel se dorește implementarea unui modul sa notifice clienții restaurantului.
Problema este că restaurantul deține pentru anumiți clienți numărul de telefon,
iar pentru alți clienți doar adresa de mail. Să se implementeze funcționalitatea
de a trimite notificări clienților prin SMS, iar în cazul în care pentru anumiți
clienți restaurantul nu are în baza de date numărul de telefon, să se
trimită notificarea prin email. În cazul clienților pentru care nu există nici
numărul de telefon, nici adresa de mail, se trimite managerului restaurantului o
 notificare cu numele clientului pentru care nu există date de contact
 */