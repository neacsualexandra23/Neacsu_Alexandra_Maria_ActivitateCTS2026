package ro.ase.cts.command.exercitiul3.main;

import ro.ase.cts.command.exercitiul3.model.*;

public class Main {
    public static void main(String[] args) {
        AgentTurism agent = new AgentTurism();
        OperatorTurism operator = new OperatorTurism();

        ComandaRezervarePachet comanda1= new ComandaRezervarePachet(operator, "Grecia") ;
        agent.adaugaComanda(comanda1);

        ComandaRezervarePachet comanda2=new ComandaRezervarePachet(operator, "Paris");
        agent.adaugaComanda(comanda2);

        agent.trimiteComenzi();
    }
}

/*
Agentul de turism primește cereri pentru rezervarea de pachete turistice
 și le trimite către operatorul agenției. Operatorul procesează
 rezervările (ex: sejur Grecia, city break Paris). Agentul poate prelua
  mai multe cereri fără să aștepte finalizarea lor.
 */