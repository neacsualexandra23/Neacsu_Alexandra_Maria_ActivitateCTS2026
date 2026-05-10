package ro.ase.cts.decorator.exercitiul2.main;

import ro.ase.cts.decorator.exercitiul2.model.*;


public class Main {
    public static void main(String[] args) {

        INotaDePlata nota=new NotaDePlata();

        nota =new LMA(nota);

        nota.printeaza();

    }
}

