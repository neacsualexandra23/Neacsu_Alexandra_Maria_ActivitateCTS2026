package ro.ase.cts.adapter.exercitiu2.model;

public class AdapterBarPrintare implements ISoftPrintare {

    private SoftBarNou softBarNou;

    public AdapterBarPrintare(SoftBarNou softBarNou) {
        this.softBarNou = softBarNou;
    }

    @Override
    public void printeazaFactura(String produs, float pret) {
        softBarNou.trimiteDateBon(produs, pret);
    }
}