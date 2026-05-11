package ro.ase.cts.proxy.exercitiul5.model;

public class Proxy implements  IAutobuz {
    private  int numarLocuri;
     private IAutobuz autobuz;
     private String nume;
   public Proxy (IAutobuz autobuz,int numarLocuri,String nume){
       this.autobuz=autobuz;
       this.numarLocuri=numarLocuri;
       this.nume=nume;
       //modificare la numarLocuri
   }

    @Override
    public void opresteInStatie() {
        if(numarLocuri==0){
            System.out.println(" nu opreste " +nume);

        }else{
           // System.out.println( " opreste " +nume);
            autobuz.opresteInStatie();
        }

    }
}
