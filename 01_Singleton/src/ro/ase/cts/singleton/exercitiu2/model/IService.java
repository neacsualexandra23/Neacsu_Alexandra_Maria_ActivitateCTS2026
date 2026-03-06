package ro.ase.cts.singleton.exercitiu2.model;

public interface IService {
    void primesteMasina(AMasina masina);
    void incepeReparatiaUrmatoarei();
    void finalizeazaReparatiaCurenta();
    int masiniInAsteptare();
    AMasina masinaInReparatie();
}