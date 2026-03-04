package ro.ase.cts.singleton.exercitiu1.main;

/* În cadrul aplicației spitalului există un RegistruInternari
care gestionează evidența tuturor pacienților internați.
Aplicația trebuie să asigure faptul că există o singură instanță a clasei
RegistruInternari pe toată durata execuției aplicației.
Să se implementeze modulul care garantează existența unei singure instanțe
și oferă un punct global de acces la aceasta.*/

/*Singleton cu Lazy Initialization
* instanța se creează la prima apelare a metodei getInstance(),
* nu la încărcarea clasei. */
import ro.ase.cts.singleton.exercitiu1.model.ManagerSpital;
public class Main {
    public static void main(String[] args) {

        ManagerSpital m1 = ManagerSpital.getInstance();
        ManagerSpital m2 = ManagerSpital.getInstance();

        m1.afiseazaMesaj();

        System.out.println(m1 == m2); // true
    }
}