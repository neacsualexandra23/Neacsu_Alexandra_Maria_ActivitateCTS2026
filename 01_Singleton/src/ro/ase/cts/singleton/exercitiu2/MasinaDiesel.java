package ro.ase.cts.singleton.exercitiu2;

public class MasinaDiesel extends AMasina {
    public MasinaDiesel(String nr, String proprietar) { super(nr, proprietar); }
    @Override public String getTip() { return "MasinaDiesel"; }
}