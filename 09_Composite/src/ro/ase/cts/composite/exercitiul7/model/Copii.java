package ro.ase.cts.composite.exercitiul7.model;

public class Copii implements IComponent{
    private String raceala;
    private String durere;
    private String antibiotic;

    public Copii (String raceala,String durere, String antibiotic){

        this.raceala=raceala;
        this.durere=durere;
        this.antibiotic=antibiotic;
    }

    @Override
    public void afiseazaStructura() {
        System.out.println( " afiseaza " + raceala+ " "+ durere + " "+ antibiotic );
    }

    @Override
    public void adaugaNod(IComponent nod) {
        System.out.println( " adauga ");
    }

    @Override
    public void stergeNod(IComponent nod) {
        System.out.println(" sterge ");
    }

    @Override
    public IComponent getNodCopil(int index) {
        return null;
    }
}
