package ro.ase.cts.proxy.exercitiul4.model;

public class HttpCall implements IHttpCall {
    @Override
    public void call(String url) {
        System.out.println("Se acceseaza: " + url);
    }
}