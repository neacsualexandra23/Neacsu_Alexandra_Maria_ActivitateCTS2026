package ro.ase.cts.adapter.exercitiu2.main;
import ro.ase.cts.adapter.exercitiu2.model.*;
public class Main {
    public static void main(String[] args) {

        ISoftPrintare softVechi = new SoftPrintareBucatarie();
        softVechi.printeazaFactura("Pizza", 35.5f);

        System.out.println();

        SoftBarNou softNou = new SoftBarNou();
        ISoftPrintare adapter = new AdapterBarPrintare(softNou);
        adapter.printeazaFactura("Cocktail", 28.0f);
    }
}

/*
Restaurantul achiziționează un nou soft nou pentru lucrul de la bar,
însă acesta nu este compatibil cu softul de printare facturi folosit
pentru produsele de la bucătărie. Vechiul soft era compatibil deoarece
au fost realizate de aceeași echipa. Să se implementeze un nivel intermediar
 prin care noul soft să poată fi folosit cu softul existent, fără a se modifica
 codul din vreo aplicație

-> există un soft nou
->acesta nu este compatibil cu softul vechi de printare facturi
->nu trebuie modificat codul din aplicațiile existente
->trebuie introdus un nivel intermediar

Adapter de obiecte
pt ca adapterul conține un obiect (SoftBarNou) și apelează metodele lui
=> compozitie
->folosește has-a
->flexibil
->cel mai folosit

Tip Adapter	               Cum îl recunoști
============================================
Adapter de obiecte	       are un atribut (obiect) în interior
Adapter de clase	       folosește moștenire (extends)

*/