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