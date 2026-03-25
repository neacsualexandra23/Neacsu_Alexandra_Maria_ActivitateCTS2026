package ro.ase.cts.decorator.exercitiul1.model;

public class Mozzarella extends DecoratorPizza {

    public Mozzarella(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + ", mozzarella extra";
    }

    @Override
    public double getPret() {
        return super.getPret() + 5;
    }
}