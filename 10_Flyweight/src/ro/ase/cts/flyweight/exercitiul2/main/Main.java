package ro.ase.cts.flyweight.exercitiul2.main;


import ro.ase.cts.flyweight.exercitiul2.model.*;

public class Main {
    public static void main(String[] args) {
        try {
            FabricaMesaje fabrica = new FabricaMesaje();

            Bon bon1 = new Bon(1001, "04.04.2026", 89.99, "Andrei");
            Bon bon2 = new Bon(1002, "04.04.2026", 45.50, "Maria");
            Bon bon3 = new Bon(1003, "04.04.2026", 120.00, "Ioana");
            Bon bon4 = new Bon(1004, "04.04.2026", 67.30, "Alex");
            Bon bon5 = new Bon(1005, "04.04.2026", 52.00, "Andrei");

            IFlyweight mesaj1 = fabrica.getMesaj(1);
            IFlyweight mesaj2 = fabrica.getMesaj(2);
            IFlyweight mesaj3 = fabrica.getMesaj(3);
            IFlyweight mesaj4 = fabrica.getMesaj(4);

            mesaj1.printeazaBon(bon1);
            mesaj2.printeazaBon(bon2);
            mesaj3.printeazaBon(bon3);
            mesaj4.printeazaBon(bon4);

            // reutilizare mesaj existent
            IFlyweight mesaj1DinNou = fabrica.getMesaj(1);
            mesaj1DinNou.printeazaBon(bon5);

            System.out.println("Numar de obiecte mesaj create: " + fabrica.getNumarMesajeCreate());

            System.out.println("Mesaj 1 reutilizat? " + (mesaj1 == mesaj1DinNou));

        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}

/*
La emiterea unui bon de plată la restaurant,
firma dorește să tipărească pe bon un mesaj promoțional/frumos
ales dintre 4 mesaje prestabilite. Deoarece aceste mesaje se repetă
pe foarte multe bonuri, să se implementeze soluția folosind
pattern-ul Flyweight, astfel încât mesajele să fie memorate o
singură dată și reutilizate
 */