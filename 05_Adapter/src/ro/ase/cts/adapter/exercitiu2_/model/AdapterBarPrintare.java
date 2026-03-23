package ro.ase.cts.adapter.exercitiu2_.model;

public class AdapterBarPrintare extends SoftBarNou implements ISoftPrintare {

    @Override
    public void printeazaFactura(String produs, float pret) {
        // apelăm metoda din clasa părinte
        trimiteDateBon(produs, pret);
    }
}