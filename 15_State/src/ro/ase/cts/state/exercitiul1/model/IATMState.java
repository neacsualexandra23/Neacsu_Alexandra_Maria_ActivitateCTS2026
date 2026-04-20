package ro.ase.cts.state.exercitiul1.model;

public interface IATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawMoney(int amount);
}