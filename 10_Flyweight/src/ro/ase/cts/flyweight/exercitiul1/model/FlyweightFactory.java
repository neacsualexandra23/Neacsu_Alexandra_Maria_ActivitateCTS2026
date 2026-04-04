package ro.ase.cts.flyweight.exercitiul1.model;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<Integer, IFlyweight> mese = new HashMap<>();

    public IFlyweight getMasa(int nrMasa, int nrLocuri) {
        IFlyweight masa = mese.get(nrMasa);

        if (masa == null) {
            masa = new Masa(nrMasa, nrLocuri);
            mese.put(nrMasa, masa);
        }

        return masa;
    }
}