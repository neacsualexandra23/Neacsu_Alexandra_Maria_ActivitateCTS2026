package ro.ase.cts.composite.exercitiul7.main;

import ro.ase.cts.composite.exercitiul7.model.Adulti;
import ro.ase.cts.composite.exercitiul7.model.Copii;
import ro.ase.cts.composite.exercitiul7.model.IComponent;

public class Main {
    public static void main(String[] args) {


        IComponent adulti=new Adulti("tusocalm","antinevralgic","clacid");

        IComponent copil1=new Copii("tantum","nurofen","forKids");
        IComponent copil2=new Copii("ghbd","nurofen","forKids");

       adulti.adaugaNod(copil1);
       adulti.adaugaNod(copil2);
       adulti.afiseazaStructura();
    }
}
