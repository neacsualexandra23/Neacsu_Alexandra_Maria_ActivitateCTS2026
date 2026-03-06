package ro.ase.cts.singleton.exercitiu2.model;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceAuto implements IService {

    // Singleton (lazy)
    private static ServiceAuto instance;

    private final Queue<AMasina> coada = new ArrayDeque<>();
    private AMasina curenta; // masina aflată în reparație (max 1)

    private ServiceAuto() { }

    public static ServiceAuto getInstance() {
        if (instance == null) {
            instance = new ServiceAuto();
        }
        return instance;
    }

    @Override
    public void primesteMasina(AMasina masina) {
        if (masina == null) {
            throw new IllegalArgumentException("Masina nu poate fi null.");
        }
        System.out.println("A sosit: " + masina);

        // dacă service-ul e liber și nu există coadă, intră direct
        if (curenta == null && coada.isEmpty()) {
            curenta = masina;
            System.out.println(" -> Acceptata imediat in service: " + curenta);
        } else {
            coada.add(masina);
            System.out.println(" -> Pusa in asteptare. Pozitie coada: " + coada.size());
        }
    }

    @Override
    public void incepeReparatiaUrmatoarei() {
        if (curenta != null) {
            System.out.println("Service ocupat cu: " + curenta + ". Nu pot incepe alta reparatie.");
            return;
        }
        curenta = coada.poll();
        if (curenta == null) {
            System.out.println("Nu exista masini in asteptare.");
        } else {
            System.out.println("A intrat la reparatie: " + curenta);
        }
    }

    @Override
    public void finalizeazaReparatiaCurenta() {
        if (curenta == null) {
            System.out.println("Nu exista nicio masina in reparatie.");
            return;
        }
        System.out.println("Reparatie finalizata pentru: " + curenta);
        curenta = null;

        // automat începe următoarea dacă există
        if (!coada.isEmpty()) {
            incepeReparatiaUrmatoarei();
        }
    }

    @Override
    public int masiniInAsteptare() {
        return coada.size();
    }

    @Override
    public AMasina masinaInReparatie() {
        return curenta;
    }
}