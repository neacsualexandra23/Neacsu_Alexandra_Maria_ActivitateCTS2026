package ro.ase.cts.composite.exercitiul6.model;

public class Loc implements IComponent{
    private String numarLoc;

    public Loc(String numarLoc){
        this.numarLoc=numarLoc;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(" locul "+ numarLoc);
    }

    @Override
    public void adauga(IComponent element) {
        System.out.println(" adauga loc " );
    }

    @Override
    public void sterge(IComponent element) {
        System.out.println(" sterge loc " + numarLoc );
    }

    @Override
    public IComponent getElement(int index) {
        return null;
    }
}
