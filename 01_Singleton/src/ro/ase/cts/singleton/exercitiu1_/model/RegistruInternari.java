package ro.ase.cts.singleton.exercitiu1_.model;

public class RegistruInternari  implements IRegistruInternari{
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
    @Override
    public void afiseazaMesaj() {
        System.out.println("Registrul de internari este activ.");
    }
}