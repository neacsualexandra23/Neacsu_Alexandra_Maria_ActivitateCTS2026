package ro.ase.cts.chain.exercitiul2.model;

public class Email implements IHandler{
    private IHandler next;

    @Override
    public void setUrmatorul(IHandler next) {
        this.next=next;
    }

    @Override
    public void notifica(String client, String mesaj) {
        if(mesaj.equals("email")){
        System.out.println( client+" oferta prin " + mesaj);
        }else if(next!=null){
            next.notifica(client,mesaj);
        }

    }
}
