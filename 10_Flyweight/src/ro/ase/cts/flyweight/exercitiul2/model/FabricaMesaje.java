package ro.ase.cts.flyweight.exercitiul2.model;

import java.util.HashMap;
import java.util.Map;

public class FabricaMesaje {
    private Map<Integer, IFlyweight> mesaje;

    public FabricaMesaje() {
        this.mesaje = new HashMap<>();
    }

    public IFlyweight getMesaj(int codMesaj) throws Exception {
        IFlyweight mesaj = mesaje.get(codMesaj);

        if (mesaj == null) {
            switch (codMesaj) {
                case 1:
                    mesaj = new MesajBon("Va multumim ca ati ales restaurantul nostru!");
                    break;
                case 2:
                    mesaj = new MesajBon("Pofta buna si va mai asteptam cu drag!");
                    break;
                case 3:
                    mesaj = new MesajBon("Zambiti, azi ati facut o alegere delicioasa!");
                    break;
                case 4:
                    mesaj = new MesajBon("Clientii nostri speciali merita cele mai bune servicii!");
                    break;
                default:
                    throw new Exception("Cod mesaj invalid!");
            }

            mesaje.put(codMesaj, mesaj);
        }

        return mesaj;
    }

    public int getNumarMesajeCreate() {
        return mesaje.size();
    }
}