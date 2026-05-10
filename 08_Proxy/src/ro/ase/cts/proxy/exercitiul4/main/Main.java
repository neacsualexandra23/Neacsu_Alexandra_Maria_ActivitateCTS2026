package ro.ase.cts.proxy.exercitiul4.main;


import ro.ase.cts.proxy.exercitiul4.model.*;



public class Main {
    public static void main(String[] args) {

        IHttpCall url =  new Proxy(new HttpCall());
        url.call("bad.com");
    }
}
