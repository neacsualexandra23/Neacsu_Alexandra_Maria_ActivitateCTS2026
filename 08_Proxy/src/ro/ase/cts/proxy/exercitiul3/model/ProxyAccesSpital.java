package ro.ase.cts.proxy.exercitiul3.model;

import java.util.List;

public class ProxyAccesSpital implements ISpital{

    private ISpital spital;
  public ProxyAccesSpital(ISpital spital){
      this.spital=spital;
  }

    @Override
    public void interneaza( String nume, boolean areScrisoare) {
        if(!areScrisoare){
            System.out.println("nu intra" + nume);
            return;
        }
        System.out.println("intra");
    }
}
