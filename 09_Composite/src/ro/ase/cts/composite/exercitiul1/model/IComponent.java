package ro.ase.cts.composite.exercitiul1.model;

public interface IComponent {
    void afiseaza();
    void adauga(IComponent element);
    void sterge(IComponent element);
}
