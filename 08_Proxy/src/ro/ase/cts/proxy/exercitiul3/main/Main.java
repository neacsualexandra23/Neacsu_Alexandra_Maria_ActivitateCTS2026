package ro.ase.cts.proxy.exercitiul3.main;

import ro.ase.cts.proxy.exercitiul3.model.AccesSpital;
import ro.ase.cts.proxy.exercitiul3.model.ISpital;
import ro.ase.cts.proxy.exercitiul3.model.*;

public class Main {
    public static void main(String[] args) {

        ISpital spital=new ProxyAccesSpital(new AccesSpital());
        spital.interneaza("hfhtd", false);



    }
}
