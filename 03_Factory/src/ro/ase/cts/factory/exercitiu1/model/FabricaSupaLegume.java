package ro.ase.cts.factory.exercitiu1.model;

public class FabricaSupaLegume implements IFabricaSupa {

    @Override
    public ISupa creeazaSupa() {
        return new SupaLegume();
    }
}
