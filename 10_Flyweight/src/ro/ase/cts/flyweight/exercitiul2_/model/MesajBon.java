package ro.ase.cts.flyweight.exercitiul2_.model;


public class MesajBon implements IFlyweight {
    private String mesaj;

    public MesajBon(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaBon(Bon bon) {

        System.out.println("Numar bon: " + bon.getNumarBon());
        System.out.println("Valoare: " + bon.getValoare() + " lei");
        System.out.println("Mesaj: " + mesaj);

    }
}