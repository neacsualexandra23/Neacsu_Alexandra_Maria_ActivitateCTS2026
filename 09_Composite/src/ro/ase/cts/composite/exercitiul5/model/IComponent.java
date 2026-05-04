package ro.ase.cts.composite.exercitiul5.model;

public interface IComponent {

        void afiseazaStructura();

        // Metode pentru compunere (opțional, pot arunca excepții la frunze)
        void adauga(IComponent unitate);
        void sterge(IComponent unitate);
        IComponent getCopil(int index);
    }

