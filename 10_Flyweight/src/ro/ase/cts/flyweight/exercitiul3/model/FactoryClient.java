package ro.ase.cts.flyweight.exercitiul3.model;

public class FactoryClient {
    private IFlyweight client1 = new Client("Adriana", "0711111111", "email1");
    private IFlyweight client2 = new Client("Alexandra", "0722222222", "email2");

    public IFlyweight getClient(String telefon) {
        if (telefon.equals("0711111111")) {
            return client1;
        } else if (telefon.equals("0722222222")) {
            return client2;
        }
        return null;
    }
}
