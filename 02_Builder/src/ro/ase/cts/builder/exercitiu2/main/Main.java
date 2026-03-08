package ro.ase.cts.builder.exercitiu2.main;
import  ro.ase.cts.builder.exercitiu2.model.*;

public class Main {
    public static void main(String[] args) {

        Eticheta eticheta1 = new Eticheta.Builder()
                .setDataExpirare("12.2026")
                .setIngrediente("Lapte, zahar")
                .build();

        Eticheta eticheta2 = new Eticheta.Builder()
                .setGramaj("500g")
                .setImportator("SC Import SRL")
                .build();

        eticheta1.print();
        System.out.println();
        eticheta2.print();
    }
}

/*Pentru un magazin general se dorește implementarea unei aplicații care
să ajute gestionarii de marfă la așezarea produselor pe rafturi.
Astfel în cadrul aplicației gestionarii au posibilitatea creării etichetelor
pentru produse. Pe eticheta (IEticheta) sunt printate mesaje care sa ajute
cumpărătorii. Însă unele informații sunt si pe ambalajul produsului,
caz in care nu se vor mai printa pe eticheta. Astfel clasa Eticheta
are mai multe atribute de tip text pe care operatorul trebuie sa le seteze:
data expirare, importator, ingrediente, gramaj, fibre, proteine, sare, etc.
In cazul in care unele informații se regăsesc pe ambalaj, pentru eticheta vor
fi setate cu valoarea implicita: “” (empty string). După ce este creat obiectul
 de tip eticheta, rămâne final pentru a fi printat pe toate produsele de acel tip.
  Aceasta nu are voie sa fie modificată pentru ca in magazin sa nu existe
  etichete diferite pe același tip de produs. Sa se implementeze modulul
  de creare al etichetelor
* */