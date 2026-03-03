package ro.ase.cts.singleton.exercitiu1.model;


public class ManagerSpital {

    // 1. instanța unică (privată, statică)
    private static ManagerSpital instance;

    //  2. constructor privat
    private ManagerSpital() {
        System.out.println("S-a creat instanta ManagerSpital");
    }

    //  3. metodă publică de acces
    public static ManagerSpital getInstance() {
        if (instance == null) {
            instance = new ManagerSpital();
        }
        return instance;
    }

    public void afiseazaMesaj() {
        System.out.println("Managerul spitalului este activ.");
    }
}