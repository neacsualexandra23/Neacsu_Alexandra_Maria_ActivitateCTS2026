package ro.ase.cts.proxy.exercitiul5.main;

import ro.ase.cts.proxy.exercitiul5.model.Autobuz;
import ro.ase.cts.proxy.exercitiul5.model.IAutobuz;
import ro.ase.cts.proxy.exercitiul5.model.Proxy;

public class Main {
    public static void main(String[] args) {


        IAutobuz autobuz=new Proxy(new Autobuz(),0);

        autobuz.opresteInStatie();
    }
}
