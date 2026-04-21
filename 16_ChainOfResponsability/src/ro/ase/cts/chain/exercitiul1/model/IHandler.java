package ro.ase.cts.chain.exercitiul1.model;

public interface IHandler {
    void setNext(IHandler next);
    void handle(int amount);
}
