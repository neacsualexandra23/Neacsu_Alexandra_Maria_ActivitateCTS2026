package ro.ase.cts.singleton.exercitiu2;

public class Main {
    public static void main(String[] args) {

        // Service unic (Singleton)
        IService service = ServiceAuto.getInstance();

        // Flux de 4 masini
        AMasina m1 = new MasinaBenzina("B-01-AAA", "Popescu");
        AMasina m2 = new MasinaDiesel("B-02-BBB", "Ionescu");
        AMasina m3 = new MasinaElectrica("B-03-CCC", "Georgescu");
        AMasina m4 = new MasinaBenzina("B-04-DDD", "Marin");

        service.primesteMasina(m1);
        service.primesteMasina(m2);
        service.primesteMasina(m3);
        service.primesteMasina(m4);

        System.out.println("\nMasina in reparatie acum: " + service.masinaInReparatie());
        System.out.println("Masini in asteptare: " + service.masiniInAsteptare());

        // Simulam finalizarea reparatiilor, una cate una
        System.out.println("\n--- Reparatii ---");
        service.finalizeazaReparatiaCurenta(); // finalizeaza m1, intra m2
        service.finalizeazaReparatiaCurenta(); // finalizeaza m2, intra m3
        service.finalizeazaReparatiaCurenta(); // finalizeaza m3, intra m4
        service.finalizeazaReparatiaCurenta(); // finalizeaza m4, nimic in coada
        service.finalizeazaReparatiaCurenta(); // nimic de finalizat
    }
}


/*1. În cadrul aplicației de gestiune a activității unui service auto,
se dorește implementarea unui modul de organizare a intrării mașinilor
în service. Se dorește ca modulul să nu permită crearea mai multor
service-uri în aplicație astfel încât, la un moment, să fie acceptată
o singură mașină în service pentru reparații. Service-ul trebuie
să implementeze interfața IService iar mașinile acceptate în service
trebuie să extindă clasa abstractă AMasina.
2. Să se testeze soluția prin crearea unui service care să gestioneze
un flux de minim 4 mașini care se prezintă pentru reparații.*/