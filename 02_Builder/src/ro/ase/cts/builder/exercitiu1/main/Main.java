package ro.ase.cts.builder.exercitiu1.main;

import ro.ase.cts.builder.exercitiu1.model.Pacient;

/*1. Atunci când un pacient este internat in cadrul aplicației se face
salvarea acestuia. Fiecare pacient are posibilitatea sa plătească
extra pentru anumite facilitate precum:
pat rabatabil, mic dejun inclus, papuci de camera, halat pentru interior.
In cazul in care pacientul nu alege aceste facilitați extra, in cadrul aplicației sunt setate cu false.
Să se dezvolte modulul care asigură crearea de obiecte de tipul pacient cu opțiuni extra. */
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