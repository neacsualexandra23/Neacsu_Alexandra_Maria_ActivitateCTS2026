package ro.ase.cts.singleton.exercitiul3_.model;

import ro.ase.cts.singleton.exercitiul3_.model.AMasina;
import ro.ase.cts.singleton.exercitiul3_.model.IService;

public class ServiceAuto implements IService {

    private static ServiceAuto instance;   // Singleton (lazy)
        // în service poate fi doar una

    private ServiceAuto() { }              // constructor privat

    public static ServiceAuto getInstance() {
        if (instance == null) {
            instance = new ServiceAuto();
        }
        return instance;
    }

    @Override
    public void print() {
        System.out.println("service activ");
    }

    private AMasina masinaCurenta;
    @Override
    public void primesteMasina(AMasina masina) {
        if (masinaCurenta == null) {
            masinaCurenta = masina;
            System.out.println("Masina ACCEPTATA in service: ");

        } else {
            System.out.println("Service ocupat. Masina NU poate fi acceptata acum:");

        }
    }



    @Override
    public void finalizeazaReparatia() {
        if (masinaCurenta != null) {
            System.out.println("Reparatie FINALIZATA pentru:");
            masinaCurenta.print();
            masinaCurenta = null;
        } else {
            System.out.println("Nu exista masina in service.");
        }
    }
}