package ro.ase.cts.composite.exercitiul7.model;

import java.util.ArrayList;
import java.util.List;
public class Adulti implements IComponent{
    private String raceala;
    private String durere;
    private String antibiotic;
    private List<IComponent> copii=new ArrayList<>();

      public Adulti( String raceala, String durere, String antibiotic){
          this.raceala=raceala;
          this.durere=durere;
          this.antibiotic=antibiotic;
      }



    @Override
    public void afiseazaStructura() {
        System.out.println(" Medicamente adulti " + raceala );
        for(IComponent c : copii){
            c.afiseazaStructura();
        }
    }

    @Override
    public void adaugaNod(IComponent nod) {
        copii.add(nod);
    }

    @Override
    public void stergeNod(IComponent nod) {
           copii.remove(nod);
    }

    @Override
    public IComponent getNodCopil(int index) {
        return null;
    }
}
