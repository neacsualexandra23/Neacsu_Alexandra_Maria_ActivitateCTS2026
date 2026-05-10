package ro.ase.cts.composite.exercitiul6.model;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IComponent{
    private String numarSectiune;
    private List<IComponent> copii=new ArrayList<>();

    public Sectiune(String numarSectiune){
        this.numarSectiune=numarSectiune;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println("sectiunea: "+numarSectiune);
        for(IComponent c: copii){
            c.afiseaza(indentare);
          //  System.out.println(c);
        }
    }

    @Override
    public void adauga(IComponent element) {
          copii.add(element);
    }

    @Override
    public void sterge(IComponent element) {
            copii.remove(element);
    }

    @Override
    public IComponent getElement(int index) {
        return null;
    }
}
