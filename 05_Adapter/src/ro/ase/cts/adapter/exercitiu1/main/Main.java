

package ro.ase.cts.adapter.exercitiu1.main;

import ro.ase.cts.adapter.exercitiu1.model.*;


public class Main {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printer printer = new PrinterAdapter(oldPrinter);

        printer.print("Salut!");
    }
}

/* Cerinta – Adapter Pattern

Se dezvoltă o aplicație pentru tipărirea documentelor.
Sistemul nou lucrează doar cu obiecte care implementează interfața:
Să se implementeze un Adapter astfel încât OldPrinter să poată fi utilizat ca un Printer.
Să se demonstreze funcționarea adaptorului într-o clasă Main.
Să NU se modifice clasa OldPrinter.
 */