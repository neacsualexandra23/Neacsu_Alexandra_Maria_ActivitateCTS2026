package ro.ase.cts.chain.exercitiul2.model;

public class Email implements IHandler{
    private IHandler next;

    @Override
    public void setUrmatorul(IHandler next) {
        this.next=next;
    }

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail()!=null){
        System.out.println( client.getNume()+" oferta prin email " + mesaj);
        }else if(next!=null){
            next.notifica(client,mesaj);
        }

    }
}
