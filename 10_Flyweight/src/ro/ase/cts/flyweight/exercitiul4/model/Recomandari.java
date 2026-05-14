package ro.ase.cts.flyweight.exercitiul4.model;

public class Recomandari implements IRecomandari{
     private String recomandare;
     public Reteta reteta;

     public Recomandari(String recomandare, Reteta reteta){
         this.recomandare= recomandare;
         this.reteta = reteta;
     }
    @Override
    public void afiseazaReteta() {
        System.out.println("Nume: "+ reteta.getNume() );
        System.out.println("Diagnostic: "+ reteta.getDiagnostic() );
        System.out.println("Reteta: "+ reteta.getReteta() );
        System.out.println("Recomandare generala " );
    }
}
