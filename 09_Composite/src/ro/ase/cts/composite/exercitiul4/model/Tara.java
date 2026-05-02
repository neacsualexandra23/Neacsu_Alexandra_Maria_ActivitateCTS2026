package ro.ase.cts.composite.exercitiul4.model;

import java.util.List;
import java.util.ArrayList;

public class Tara implements IComposite{
       private String nume;
       public List<IComposite> copii= new ArrayList<>();

       public Tara(String nume){
           this.nume = nume;
       }
       public void adauga(IComposite c){
           copii.add(c);
       }

    @Override
    public void afiseaza() {
        System.out.println("Tara "+ nume);
        for(IComposite c: copii){
            c.afiseaza();
        }
    }
}
