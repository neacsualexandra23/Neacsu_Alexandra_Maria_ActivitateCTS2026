package ro.ase.cts.facade.exercitiul2.main;

import ro.ase.cts.facade.exercitiul2.model.*;
public class Main {
    public static void main(String[] args) {
        Facade rezervareSejur = new Facade();
        rezervareSejur.rezervaPachet("Bucuresti", "Paris");
    }
}

/*
Se dezvoltă o aplicație software pentru o agenție de turism.
Aplicația trebuie să permită rezervarea unui pachet complet de
vacanță care include:
->rezervarea biletelor de avion (dus și întors) prin intermediul unei companii aeriene
->rezervarea unei camere de hotel în orașul de destinație

Pentru realizarea acestor operații, sistemul utilizează mai multe clase:
CompanieAeriana pentru rezervarea zborurilor
Hotel pentru rezervarea camerei
Zbor pentru gestionarea informațiilor despre zbor
Procesul de rezervare este complex și implică mai multe apeluri către aceste clase.
Se dorește simplificarea interacțiunii cu sistemul, astfel încât clientul să poată realiza o rezervare completă printr-un singur apel, fără a cunoaște detaliile interne ale sistemului.

Cerințe
Să se implementeze un Facade care să ofere o metodă simplificată pentru rezervarea unui pachet complet (transport + cazare).
Să se testeze soluția prin apelarea metodei de rezervare pentru un traseu dat (ex: București → Paris).
Să se evidențieze faptul că utilizatorul nu interacționează direct cu clasele CompanieAeriana, Hotel și Zbor.


public interface IRezervarePachet {
    void rezervaPachet(String orasPlecare, String orasDestinatie);
}
 */