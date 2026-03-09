package ro.ase.cts.factory.exercitiu2.main;
import ro.ase.cts.factory.exercitiu2.model.*;

public class Main {

    public static void main(String[] args) {

        APersonal p1 = PersonalFactory.crearePersonal(TipPersonal.MEDIC, "Popescu");
        APersonal p2 = PersonalFactory.crearePersonal(TipPersonal.ASISTENT, "Ionescu");
        APersonal p3 = PersonalFactory.crearePersonal(TipPersonal.BRANCARDIER, "Georgescu");

        p1.afiseazaRol();
        p2.afiseazaRol();
        p3.afiseazaRol();
    }
}

/* simple factory cu switch -> În cadrul aplicației personalul spitalului este de mai multe tipuri.
 Acestea sunt salvate într-un enum { Brancardier, Asistent, Medic}.
 Să se implementeze modulul care pune la dispoziției crearea de
 obiecte din familia obiectelor PersonalSpital in funcție de tipul
 primit ca parametru.*/