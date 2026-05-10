package ro.ase.cts.composite.exercitiul6.model;

public interface IComponent {

        void afiseaza(String indentare);

        void adauga(IComponent element);
        void sterge(IComponent element);
       IComponent getElement(int index);
    }

