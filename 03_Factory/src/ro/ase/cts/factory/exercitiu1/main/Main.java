package ro.ase.cts.factory.exercitiu1.main;

import ro.ase.cts.factory.exercitiu1.model.*;

public class Main {
    public static void main(String[] args) {

        IFabricaSupa fabrica1 = new FabricaSupaLegume();
        ISupa supa1 = fabrica1.creeazaSupa();
        supa1.print();

        IFabricaSupa fabrica2 = new FabricaSupaCiuperci();
        ISupa supa2 = fabrica2.creeazaSupa();
        supa2.print();

        IFabricaSupa fabrica3 = new FabricaSupaVita();
        ISupa supa3 = fabrica3.creeazaSupa();
        supa3.print();

    }
}

/*metoda factory -> Restaurantul servește mai multe tipuri de supe:
supă de legume, supă de ciuperci, supă de vită, etc.
Să se implementeze modulul care permite realizarea de obiecte
 din familia supelor.
 Modulul trebuie realizat, astfel încât pentru adăugări
 de noi tipuri de supă să nu fie necesare modificări în codul existent.*/