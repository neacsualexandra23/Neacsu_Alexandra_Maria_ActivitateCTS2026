package ro.ase.cts.flyweight.exercitiul2_.model;

public class FabricaMesaje {

    private IFlyweight mesaj1;
    private IFlyweight mesaj2;


    public IFlyweight getMesaj(int codMesaj) {
        if (codMesaj == 1) {
          mesaj1 = new MesajBon("Va multumim ca ati ales restaurantul nostru!");
          return mesaj1;
        }

        if (codMesaj == 2) {
            mesaj2 = new MesajBon("Pofta buna si va mai asteptam cu drag!");
            return mesaj2;
        }

        return null;
    }
}