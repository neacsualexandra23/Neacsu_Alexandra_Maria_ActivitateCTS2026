package ro.ase.cts.proxy.exercitiul6.model;



import java.util.ArrayList;
import java.util.List;

public class Proxy implements ISpalatorie {
    private ISpalatorie spalatorie;
    private List<String> persoaneInterzise=new ArrayList<>();
    private List<String> persoaneInAsteptare=new ArrayList<>();
    public Proxy(ISpalatorie spalatorie){
        this.spalatorie=spalatorie;
    }

    @Override
    public void washCar(Client client) {
        if(!client.getAreInvitatie()){
            System.out.println(" nu are invitatie");
            return;

        }
        persoaneInterzise.add("Ion");
        persoaneInterzise.add("Mirel");


        if(!persoaneInterzise.contains(client.getNume())){
            System.out.println("  are acces");
        }else{
            System.out.println( " nu are acces");
        }


        persoaneInAsteptare.add(client.getNume());
        if(persoaneInAsteptare.size()>=2){
            System.out.println(" este acceptat grupul ");
        }
    }
}