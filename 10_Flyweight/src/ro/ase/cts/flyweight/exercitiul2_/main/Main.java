package ro.ase.cts.flyweight.exercitiul2_.main;
import ro.ase.cts.flyweight.exercitiul2_.model.*;
public class Main {
    public static void main(String[] args) {
        Bon bon1 = new Bon(1001,  89.99);
        Bon bon2 = new Bon(1002,  45.50);
        Bon bon3 = new Bon(1003,  100.50);

        FabricaMesaje fabrica = new FabricaMesaje();

        IFlyweight mesaj1 = fabrica.getMesaj(1);
        IFlyweight mesaj2 = fabrica.getMesaj(2);
        IFlyweight mesaj3 = fabrica.getMesaj(1); // reutilizare

        mesaj1.printeazaBon(bon1);
        mesaj2.printeazaBon(bon2);
        mesaj3.printeazaBon(bon3);


    }
}

/* La emiterea unui bon de plată la restaurant,
firma dorește să tipărească pe bon un mesaj promoțional/frumos
ales dintre 2 mesaje prestabilite. Deoarece aceste mesaje se repetă
pe foarte multe bonuri, să se implementeze soluția folosind
pattern-ul Flyweight, astfel încât mesajele să fie memorate o
singură dată și reutilizate

 */