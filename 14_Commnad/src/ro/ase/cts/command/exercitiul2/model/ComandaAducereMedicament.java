package ro.ase.cts.command.exercitiul2.model;

public class ComandaAducereMedicament implements IComanda {
    private AjutorFarmacist ajutor;
    private String medicament;

    public ComandaAducereMedicament(AjutorFarmacist ajutor, String medicament) {
        this.ajutor = ajutor;
        this.medicament = medicament;
    }

    @Override
    public void executa() {
        ajutor.aduceMedicament(medicament);
    }
}