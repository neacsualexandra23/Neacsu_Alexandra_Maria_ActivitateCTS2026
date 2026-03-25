package ro.ase.cts.decorator.exercitiul1.model;

public class Ciuperci extends DecoratorPizza {

    public Ciuperci(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + ", ciuperci extra";
    }

    @Override
    public double getPret() {
        return super.getPret() + 10;
    }
}