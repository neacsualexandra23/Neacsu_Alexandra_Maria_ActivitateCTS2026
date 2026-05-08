package ro.ase.cts.chain.exercitiul2.model;

public class Manager implements IHandler{
    private IHandler next;

    @Override
    public void setUrmatorul(IHandler next) {
        this.next=next;
    }

    @Override
    public void notifica(Client client, String mesaj) {

        System.out.println(client.getNume() +" oferta prin manager " + mesaj);
    }
}
