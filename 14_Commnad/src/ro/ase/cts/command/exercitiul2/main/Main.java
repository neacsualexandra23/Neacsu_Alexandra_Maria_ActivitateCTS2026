package ro.ase.cts.command.exercitiul2.main;

import ro.ase.cts.command.exercitiul2.model.*;
public class Main {
    public static void main(String[] args) {
        AjutorFarmacist ajutor = new AjutorFarmacist();
        Farmacist farmacist = new Farmacist();

        farmacist.adaugaComanda(new ComandaAducereMedicament(ajutor, "Paracetamol"));
        farmacist.adaugaComanda(new ComandaAducereMedicament(ajutor, "Nurofen"));

        farmacist.trimiteComenzi();
    }
}