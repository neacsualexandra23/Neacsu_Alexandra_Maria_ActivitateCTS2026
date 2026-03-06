package ro.ase.cts.singleton.exercitiu3.model;


public class ServiceAuto implements IService {

    private static ServiceAuto instance;   // Singleton (lazy)
    private AMasina masinaCurenta;         // în service poate fi doar una

    private ServiceAuto() { }              // constructor privat

    public static ServiceAuto getInstance() {
        if (instance == null) {
            instance = new ServiceAuto();
        }
        return instance;
    }

    @Override
    public void primesteMasina(AMasina masina) {
        if (masinaCurenta == null) {
            masinaCurenta = masina;
            System.out.println("Masina ACCEPTATA in service: ");
            masinaCurenta.descriere();
        } else {
            System.out.println("Service ocupat. Masina NU poate fi acceptata acum:");
            masina.descriere();
        }
    }

    @Override
    public void incepeReparatiaUrmatoarei() {
        if (masinaCurenta != null) {
            System.out.println("A inceput reparatia pentru:");
            masinaCurenta.descriere();
        } else {
            System.out.println("Nu exista masina in service pentru reparatie.");
        }
    }

    @Override
    public void finalizeazaReparatiaCurenta() {
        if (masinaCurenta != null) {
            System.out.println("Reparatie FINALIZATA pentru:");
            masinaCurenta.descriere();
            masinaCurenta = null;
        } else {
            System.out.println("Nu exista masina in service.");
        }
    }
}