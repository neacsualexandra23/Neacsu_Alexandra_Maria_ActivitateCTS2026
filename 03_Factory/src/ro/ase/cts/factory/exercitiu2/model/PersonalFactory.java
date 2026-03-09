package ro.ase.cts.factory.exercitiu2.model;

public class PersonalFactory {

    public static APersonal crearePersonal(TipPersonal tip, String nume) {

        switch (tip) {

            case BRANCARDIER:
                return new Brancardier(nume);

            case ASISTENT:
                return new Asistent(nume);

            case MEDIC:
                return new Medic(nume);

            default:
                throw new IllegalArgumentException("Tip personal invalid");
        }
    }
}