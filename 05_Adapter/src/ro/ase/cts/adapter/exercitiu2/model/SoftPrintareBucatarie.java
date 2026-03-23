package ro.ase.cts.adapter.exercitiu2.model;

public class SoftPrintareBucatarie implements ISoftPrintare {

    @Override
    public void printeazaFactura(String produs, float pret) {
        System.out.println("Factura printata:");
        System.out.println("Produs: " + produs);
        System.out.println("Pret: " + pret + " lei");
    }
}