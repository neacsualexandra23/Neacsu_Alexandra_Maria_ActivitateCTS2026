package ro.ase.cts.factory.exercitiu1.model;

public class FabricaSupaCiuperci implements IFabricaSupa {

    @Override
    public ISupa creeazaSupa() {
        return new SupaCiuperci();
    }
}