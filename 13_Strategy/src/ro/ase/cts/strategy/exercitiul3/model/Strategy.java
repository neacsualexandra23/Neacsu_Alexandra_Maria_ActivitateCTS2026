package ro.ase.cts.strategy.exercitiul3.model;

public class Strategy implements  AbstractAlgoritmRuta {

   private String nume;
   public AbstractAlgoritmRuta algoritm;

   public Strategy(String nume){
       this.nume= nume;
   }

    public void setStrategie(AbstractAlgoritmRuta algoritm) {
        this.algoritm = algoritm;
    }

    @Override
    public Ruta calculeazaRuta(ReteaTransport retea, String statieStart, String statieFinal) {
        algoritm.calculeazaRuta(retea,statieStart,statieFinal);
        return null;
    }
}
