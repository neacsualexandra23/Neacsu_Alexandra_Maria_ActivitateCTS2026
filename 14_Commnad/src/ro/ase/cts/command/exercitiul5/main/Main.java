package ro.ase.cts.command.exercitiul5.main;

import ro.ase.cts.command.exercitiul5.model.*;
public class Main {
    public static void main(String[] args) {

                Biblioteca biblioteca = new Biblioteca();

                AbstractComanda c1 =new ComandaImprumut(biblioteca,"Carte1");
                AbstractComanda c2 =new ComandaReturnare(biblioteca,"Carte2");

                c1.executa();
                c2.executa();
            }
        }


