package ro.ase.cts.composite.exercitiul5.main;

import ro.ase.cts.composite.exercitiul5.model.Departament;
import ro.ase.cts.composite.exercitiul5.model.IComponent;
import ro.ase.cts.composite.exercitiul5.model.Sectie;

public class Main {
    public static void main(String[] args) {

        Sectie sectie1=new Sectie("sectia1");
        Sectie sectie2=new Sectie("sectia2");
        Departament departament=new Departament("Departamen");
        departament.adauga(sectie1);
        departament.adauga(sectie2);

        departament.afiseazaStructura();

        departament.sterge(sectie2);
        departament.afiseazaStructura();
    }
}
