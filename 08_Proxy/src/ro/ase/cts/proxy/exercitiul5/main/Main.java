package ro.ase.cts.proxy.exercitiul5.main;

import ro.ase.cts.proxy.exercitiul5.model.Autobuz;
import ro.ase.cts.proxy.exercitiul5.model.IAutobuz;
import ro.ase.cts.proxy.exercitiul5.model.Proxy;

public class Main {
    public static void main(String[] args) {


        IAutobuz autobuz1=new Proxy(new Autobuz(),5," autobuzul 101");

        autobuz1.opresteInStatie();

        IAutobuz autobuz2=new Proxy(new Autobuz(),0, " autobuzul 102");

        autobuz2.opresteInStatie();
    }
}


/*
public interface IAutobuz {
    void opresteInStatie();
}

Pentru autobuzele de noapte se doreste ca oprirea in statie sa se faca doar daca exista persoane in autobuz.
In caz contrar autobuzul se retrage la autobaza fara sa mai realizeze opriri.
Sa se implementeze modul care va permite oprirea in statie a autobuzelor doar daca exista calatori in autobuz.
 */