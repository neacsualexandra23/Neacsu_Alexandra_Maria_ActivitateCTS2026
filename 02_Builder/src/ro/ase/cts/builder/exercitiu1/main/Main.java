package ro.ase.cts.builder.exercitiu1.main;

import ro.ase.cts.builder.exercitiu1.model.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient.Builder("Ion Popescu")
                .cuPatRabatabil(true)
                .cuMicDejunInclus(true)
                .build();

        Pacient p2 = new Pacient.Builder("Maria Ionescu")
                .cuPapuciCamera(true)
                .cuHalatInterior(true)
                .build();

        System.out.println(p1);
        System.out.println(p2);
    }
}