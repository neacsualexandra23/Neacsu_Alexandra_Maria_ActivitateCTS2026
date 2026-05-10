package ro.ase.cts.adapter.exercitiu2_.model;

public class SoftBarVechi implements ISoftPrintare{
    @Override
    public void printeazaFactura(String produs, float pret) {
        System.out.println("Soft bar vechi:");
        System.out.println(produs + " - " + pret + " lei");
    }
}
