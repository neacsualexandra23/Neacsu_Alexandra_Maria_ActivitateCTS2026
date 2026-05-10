package ro.ase.cts.proxy.exercitiul4.model;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IHttpCall {

    private IHttpCall httpCall;
    private List<String> siteuriBlocate = new ArrayList<>();


    public Proxy(HttpCall httpCall) {
        this.httpCall = httpCall;
    }

    @Override
    public void call(String url) {

        siteuriBlocate.add( "bad.com");
        siteuriBlocate.add( "virus.com");

        if (siteuriBlocate.contains(url)) {
            System.out.println("Acces blocat catre: " + url);
        } else {
            httpCall.call(url);
        }
    }
}