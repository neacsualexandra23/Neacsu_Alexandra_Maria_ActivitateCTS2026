package ro.ase.cts.prototype.exercitiu1.main;
import ro.ase.cts.prototype.exercitiu1.model.*;

public class Main {

    public static void main(String[] args) {

        Rezervare rezervare1 = new Rezervare("Popescu Ion", "0712345678", 2);

        Rezervare rezervare2 = (Rezervare) rezervare1.copiaza();
        rezervare2.setNrPersoane(4);

        rezervare1.print();
        rezervare2.print();


        //System.out.println(rezervare1);
       // System.out.println(rezervare2);
    }
}
/*Un restaurant permite clienților să facă rezervări pentru mese.
Pentru fiecare rezervare trebuie salvate informații precum:
numele clientului
numărul de telefon
numărul de persoane pentru care se face rezervarea
Crearea unei rezervări presupune efectuarea unor verificări și validări
costisitoare, cum ar fi verificarea numărului de telefon sau
a numelui clientului. Din acest motiv, crearea unui obiect de tip
Rezervare prin constructor este un proces costisitor.

Dacă un client dorește să facă o nouă rezervare similară cu una existentă
(de exemplu același client, dar pentru un alt număr de persoane),
aplicația trebuie să poată crea rapid o nouă rezervare
pe baza uneia existente, fără a mai apela constructorul și
fără a relua procesul de validare.
Să se implementeze un modul care să permită crearea de noi obiecte
de tip Rezervare prin copierea (clonarea) unor obiecte existente,
folosind un design pattern adecvat.*/