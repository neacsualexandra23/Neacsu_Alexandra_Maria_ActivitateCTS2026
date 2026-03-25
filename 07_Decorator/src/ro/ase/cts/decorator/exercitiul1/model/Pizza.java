package ro.ase.cts.decorator.exercitiul1.model;

public class Pizza implements IPizza {
    @Override
    public String getDescriere() {
        return "Pizza simpla";
    }

    @Override
    public double getPret() {
        return 20;
    }
}