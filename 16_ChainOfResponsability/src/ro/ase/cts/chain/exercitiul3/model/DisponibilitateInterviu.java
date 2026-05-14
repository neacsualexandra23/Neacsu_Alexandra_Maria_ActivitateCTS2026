package ro.ase.cts.chain.exercitiul3.model;

public class DisponibilitateInterviu extends AbstractFiltruCandidat{
    @Override
    public boolean proceseaza(Candidat candidat) {
        System.out.println("proceseaza Disponibilitate Interviu");
       // if(urmator != null) {
      //      return urmator.proceseaza(candidat);
      //  }


        return true;
    }
}
