package ro.ase.cts.chain.exercitiul3.model;

public class Competente  extends AbstractFiltruCandidat{
    @Override
    public boolean proceseaza(Candidat candidat) {
        System.out.println("proceseaza Competente   ");
       urmator.proceseaza(candidat);


        return true;
    }
}
