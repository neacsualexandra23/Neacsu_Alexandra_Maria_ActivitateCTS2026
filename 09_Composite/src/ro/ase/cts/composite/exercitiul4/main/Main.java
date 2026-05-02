package ro.ase.cts.composite.exercitiul4.main;

import ro.ase.cts.composite.exercitiul4.model.IComposite;
import ro.ase.cts.composite.exercitiul4.model.*;
public class Main {
    public static void main(String[] args) {
        Virus virus1= new Virus("ebola") ;
        Virus virus2= new Virus("covid-19") ;
        Virus virus3= new Virus("covid-19") ;

        Tara tara1= new Tara("Romania");

        tara1.adauga(virus1);
        tara1.adauga(virus2);

        Continent continent1= new Continent("Europa");
        continent1.adauga(tara1);
        continent1.afiseaza();

    }
}
