package ro.ase.cts.facade.exercitiul3.model;

public class Internare implements IInternare{
    private Medic medic;
    private Pacient pacient;
    private Salon salon;

    public Internare(){
       this.medic=new Medic();
       this.pacient=new Pacient();
       this.salon=new Salon();

    }



    @Override
    public boolean verificaInternare() {
        medic.ConfirmareInternare();
        pacient.gravitatePacient();
        salon.verificarePat();
        System.out.println("S-a verificat");
        return false;
    }
}
