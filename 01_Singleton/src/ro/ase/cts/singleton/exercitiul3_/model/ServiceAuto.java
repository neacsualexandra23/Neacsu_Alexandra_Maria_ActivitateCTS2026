package ro.ase.cts.singleton.exercitiul3_.model;

public class ServiceAuto implements IService {

    private static ServiceAuto instance;  // Singleton (lazy)
    private AMasina masinaCurenta;        // doar una în service

    private ServiceAuto() {}

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
            System.out.print("Acceptata in service: ");
            masinaCurenta.descriere();
        } else {
            System.out.print("Service ocupat, respinsa: ");
            masina.descriere();
        }
    }

 /*   @Override
    public void incepeReparatia() {
        if (masinaCurenta != null) {
            System.out.print("Reparatie inceputa pentru: ");
            masinaCurenta.descriere();
        } else {
            System.out.println("Nu exista masina in service.");
        }
    }
*/
    @Override
    public void finalizeazaReparatia() {
        if (masinaCurenta != null) {
            System.out.print("Reparatie finalizata pentru: ");
            masinaCurenta.descriere();
            masinaCurenta = null;
        } else {
            System.out.println("Nu exista masina in service.");
        }
    }
}