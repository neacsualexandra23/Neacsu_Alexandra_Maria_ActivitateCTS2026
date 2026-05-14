package ro.ase.cts.chain.exercitiul3.model;

public class ExperientaMinima extends AbstractFiltruCandidat {
    @Override
    public boolean proceseaza(Candidat candidat) {
        System.out.println("proceseaza experienta minima  ");

           urmator.proceseaza(candidat);



        return true;
    }
}
