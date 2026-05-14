package ro.ase.cts.chain.exercitiul3.main;

import ro.ase.cts.chain.exercitiul3.model.*;
public class Main {
    public static void main(String[] args) {

        Candidat c =  new Candidat("Alex");

        AbstractFiltruCandidat experienteMinime= new ExperientaMinima();
        AbstractFiltruCandidat competente= new Competente();
        AbstractFiltruCandidat interviu = new DisponibilitateInterviu();

        experienteMinime.seteazaUrmator(competente);
        competente.seteazaUrmator(interviu);

        experienteMinime.proceseaza(c);
    }
}
