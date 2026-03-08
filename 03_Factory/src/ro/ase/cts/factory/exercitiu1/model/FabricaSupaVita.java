package ro.ase.cts.factory.exercitiu1.model;

public class FabricaSupaVita implements IFabricaSupa {

    @Override
    public ISupa creeazaSupa() {
        return new SupaVita();
    }
}