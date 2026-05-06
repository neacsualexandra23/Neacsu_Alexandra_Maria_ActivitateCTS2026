package ro.ase.cts.flyweight.exercitiul3.model;

public class Client implements IFlyweight  {

 private String nume;
 private String telefon;
 private String email;

  public  Client(String nume,String telefon , String email){
      this.nume= nume;
      this.telefon= telefon;
      this.email= email;
  }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println("rezervare nrMasa:"+rezervare.getNumarMasa());
        System.out.println("nrPesoane:"+rezervare.getNumarPersoane());
        System.out.println("oraRezervare:"+rezervare.getOraRezervare());
        System.out.println("nume client:"+nume);
        System.out.println(" telefon:"+telefon);
        System.out.println(" email:"+email);
    }
}
