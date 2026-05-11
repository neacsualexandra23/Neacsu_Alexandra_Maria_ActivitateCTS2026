package ro.ase.cts.proxy.exercitiul5.model;

public class Proxy implements  IAutobuz {
    private  int numarLocuri;
     private IAutobuz autobuz;
   public Proxy (IAutobuz autobuz,int numarLocuri){
       this.autobuz=autobuz;
       this.numarLocuri=numarLocuri;
   }

    @Override
    public void opresteInStatie() {
        if(numarLocuri==0){
            System.out.println(" nu opreste");

        }else{
            System.out.println( " opreste");
        }

    }
}
