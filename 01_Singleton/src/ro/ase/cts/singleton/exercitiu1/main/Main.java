package ro.ase.cts.singleton.exercitiu1.main;

/* În cadrul aplicației spitalului există un RegistruInternari
care gestionează evidența tuturor pacienților internați.
Aplicația trebuie să asigure faptul că există o singură instanță a clasei
RegistruInternari pe toată durata execuției aplicației.
Să se implementeze modulul care garantează existența unei singure instanțe
și oferă un punct global de acces la aceasta. "fara interfata"*/

/*Singleton cu Lazy Initialization
* instanța se creează la prima apelare a metodei getInstance(),
* nu la încărcarea clasei. */


import ro.ase.cts.singleton.exercitiu1.model.RegistruInternari;

public class Main {

    public static void main(String[] args) {

        RegistruInternari r1 = RegistruInternari.getInstance();
        RegistruInternari r2 = RegistruInternari.getInstance();

        r1.afiseazaMesaj();

        System.out.println(r1 == r2);
    }
}