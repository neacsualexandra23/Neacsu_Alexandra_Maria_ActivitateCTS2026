package ro.ase.cts.singleton.exercitiu2;

public abstract class AMasina {
    private final String numarInmatriculare;
    private final String proprietar;

    protected AMasina(String numarInmatriculare, String proprietar) {
        if (numarInmatriculare == null || numarInmatriculare.trim().isEmpty()) {
            throw new IllegalArgumentException("Numarul de inmatriculare este obligatoriu.");
        }
        if (proprietar == null || proprietar.trim().isEmpty()) {
            throw new IllegalArgumentException("Proprietarul este obligatoriu.");
        }
        this.numarInmatriculare = numarInmatriculare;
        this.proprietar = proprietar;
    }

    public String getNumarInmatriculare() { return numarInmatriculare; }
    public String getProprietar() { return proprietar; }

    public abstract String getTip();

    @Override
    public String toString() {
        return getTip() + "{" +
                "nr='" + numarInmatriculare + '\'' +
                ", proprietar='" + proprietar + '\'' +
                '}';
    }
}