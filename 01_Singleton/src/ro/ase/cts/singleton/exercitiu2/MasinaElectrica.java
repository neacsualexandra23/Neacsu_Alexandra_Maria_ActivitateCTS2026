package ro.ase.cts.singleton.exercitiu2;

public class MasinaElectrica extends AMasina {
    public MasinaElectrica(String nr, String proprietar) { super(nr, proprietar); }
    @Override public String getTip() { return "MasinaElectrica"; }
}