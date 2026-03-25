package ro.ase.cts.decorator.exercitiul1.model;

public class Salam extends DecoratorPizza {

    public Salam(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + ", salam extra";
    }

    @Override
    public double getPret() {
        return super.getPret() + 10;
    }
}