package ro.ase.cts.composite.exercitiul7.model;

public interface IComponent {
    void afiseazaStructura();
    void adaugaNod(IComponent nod);
    void stergeNod(IComponent nod);
    IComponent getNodCopil(int index);
}
