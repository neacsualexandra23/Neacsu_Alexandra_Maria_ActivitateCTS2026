package ro.ase.cts.decorator.exercitiul2.main;

import ro.ase.cts.decorator.exercitiul2.model.*;


public class Main {
    public static void main(String[] args) {

        INotaDePlata nota=new NotaDePlata();

        nota =new LMA(nota);

        nota.printeaza();

    }
}
/*
Cu ocazia sărbătorilor de sfârșit de an managerul restaurantului
dorește ca atunci când este printată o notă să se printeze și o
felicitare de La Mulți Ani pentru client. Se dorește adăugarea acestei
 noi funcționalități pentru clasa NotaDePlata la printare

 */