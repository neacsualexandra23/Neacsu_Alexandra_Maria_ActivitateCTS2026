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
/*
Dirigintele farmaciei dorește organizarea medicamentelor
într-o structura arborescenta pentru o căutare facila a acestora
de către farmaciști. Astfel medicamentele vor fi organizate in cadrul
aplicației pe secțiuni (Răceala, Durere, Antibiotice, etc) Fiecare

secțiune conține subsecțiuni (Adulți, Copii, etc) sau medicamentele
din acea categorie. Sa se realizeze modulul care permite reprezentarea
 arborescenta a medicamentelor in cadrul aplicației.
 */