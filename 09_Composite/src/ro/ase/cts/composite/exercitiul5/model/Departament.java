package ro.ase.cts.composite.exercitiul5.model;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IComponent{
    private String nume;
    private List<IComponent> copii=new ArrayList<>();

    public Departament(String nume){
        this.nume=nume;
    }

    public void adauga(IComponent c){
        copii.add(c);
    }

    @Override
    public void afiseazaStructura() {
        System.out.println(nume);
        for(IComponent c:copii){
            c.afiseazaStructura();
        }
    }

    @Override
    public void sterge(IComponent unitate) {
       copii.remove(unitate);
    }

    @Override
    public IComponent getCopil(int index) {
        return null;
    }
}
