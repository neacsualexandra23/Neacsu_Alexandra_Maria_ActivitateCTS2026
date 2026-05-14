package ro.ase.cts.strategy.exercitiul3.main;

import ro.ase.cts.strategy.exercitiul3.model.*;

public class Main {
    public static void main(String[] args) {
        Ruta ruta = new Ruta("ruta1");
        ReteaTransport retea = new ReteaTransport("retea");
        AbstractAlgoritmRuta putineStatii = new CeleMaiPutineStatii();
        AbstractAlgoritmRuta putinTimp = new CelMaiScurtTimp();
        Strategy strategia = new Strategy("putine Statii");
        strategia.setStrategie(putinTimp);
        strategia.calculeazaRuta(retea, "Statie 1", "Statie2");

    }
}