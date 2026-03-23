package ro.ase.cts.facade.exercitiu1.main;
import ro.ase.cts.facade.exercitiu1.model.*;
public class Main {
    public static void main(String[] args) {
        IComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}

/*
Se cere implementarea pattern-ului Facade (Fațadă) pentru un sistem de
pornire a unui calculator.
Sistemul este alcătuit din mai multe subsisteme, și anume:
clasa CPU, clasa Memory și clasa HardDrive.
Fiecare dintre aceste componente oferă funcționalități specifice,
astfel: CPU dispune de metoda start(), Memory de metoda load(),
iar HardDrive de metoda read().
Clientul nu trebuie să interacționeze direct cu aceste clase din subsistem, ci prin intermediul unei fațade care să simplifice utilizarea sistemului.
Se cere:
-definirea unei interfețe pentru fațadă;
-implementarea clasei ComputerFacade, care să încapsuleze și să coordoneze apelurile către subsistem;
-realizarea unui program principal (main) în care clientul utilizează exclusiv fațada pentru a porni calculatorul.
 */