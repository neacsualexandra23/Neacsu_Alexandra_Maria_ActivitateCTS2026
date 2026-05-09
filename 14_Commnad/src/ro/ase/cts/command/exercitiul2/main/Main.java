package ro.ase.cts.command.exercitiul2.main;

import ro.ase.cts.command.exercitiul2.model.*;
public class Main {
    public static void main(String[] args) {
        AjutorFarmacist ajutor = new AjutorFarmacist();
        Farmacist farmacist = new Farmacist();
        ComandaAducereMedicament comanda1=new ComandaAducereMedicament(ajutor, "Paracetamol")  ;
        ComandaAducereMedicament comanda2=new ComandaAducereMedicament(ajutor, "Nurofen")  ;

        farmacist.adaugaComanda(comanda1);
        farmacist.adaugaComanda(comanda2);

        farmacist.trimiteComenzi();
    }
}
/*
Deoarece se face o coada foarte mare la casa farmaciei, dirigintele
acesteia dorește ca farmacistul care preia rețeta și sa trimită comenzi
 de aducere medicamente către ajutorul de farmacist. Ajutorul va prelua
 comenzile de aducere medicamente din depozit si la va aduce pe rând pe
 toate. In timp ce ajutorul de farmacist aduce medicamentele, farmacistul
 poate sa preia alte rețete. Sa se implementeze modulul de trimitere al
 comenzilor de către farmacist către ajutorul de farmacist.
 */