package ro.ase.cts.chain.exercitiul2.model;

public class SMS implements IHandler{
    private IHandler next;

    @Override
    public void setUrmatorul( IHandler next) {
       this.next=next;
    }

    @Override
    public void notifica(Client client, String mesaj) {

        if (client.getTelefon()!=null) {
            System.out.println(client.getNume() + " oferta prin sms " + mesaj);
        } else if (next != null) {
           next.notifica(client,mesaj);
        }
    }
}
