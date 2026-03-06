package ro.ase.cts.singleton.exercitiu1.model;

public class RegistruInternari {
    private int nrRegistru;
    private static RegistruInternari instance=null;

    private RegistruInternari(int nrRegistru) {
        this.nrRegistru =nrRegistru;
    }

    public static RegistruInternari getInstance() {
        if (instance == null) {
            instance = new RegistruInternari(11);
        }
        return instance;
    }

    public void afiseazaMesaj() {
        System.out.println("Registrul de internari este activ."+nrRegistru);
    }
}