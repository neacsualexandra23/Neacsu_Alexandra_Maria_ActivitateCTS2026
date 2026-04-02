package ro.ase.cts.composite.exercitiul2.model;

public interface IRezervare {

    void stergeRezervare(IRezervare rezervare) throws Exception;
    void adaugaRezervare(IRezervare rezervare) throws Exception;
    IRezervare getRezervare(int index) throws Exception;
    void info();

}