package ro.ase.cts.singleton.exercitiu2;

public class MasinaBenzina extends AMasina {
    public MasinaBenzina(String nr, String proprietar) { super(nr, proprietar); }
    @Override public String getTip() { return "MasinaBenzina"; }
}