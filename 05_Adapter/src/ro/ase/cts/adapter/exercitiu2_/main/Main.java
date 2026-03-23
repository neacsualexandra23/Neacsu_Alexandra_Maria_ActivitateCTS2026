package ro.ase.cts.adapter.exercitiu2_.main;
import ro.ase.cts.adapter.exercitiu2_.model.*;

public class Main {
    public static void main(String[] args) {

        ISoftPrintare adapter = new AdapterBarPrintare();
        adapter.printeazaFactura("Cocktail", 30.0f);
    }
}
/*
Adapter de obiecte	      Adapter de clase
are atribut	              folosește extends
compoziție	              moștenire
mai flexibil	          mai rigid
cel mai folosit	          rar folosit


Dacă nu ți se cere explicit: at scrii Adapter de obiecte
 */