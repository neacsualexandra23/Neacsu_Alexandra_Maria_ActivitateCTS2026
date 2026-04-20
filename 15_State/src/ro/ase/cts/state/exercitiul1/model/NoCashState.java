package ro.ase.cts.state.exercitiul1.model;

public class NoCashState implements IATMState {
    private ATM atm;

    public NoCashState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("ATM fără bani.");
    }

    public void ejectCard() {
        System.out.println("Nu există card.");
    }

    public void enterPin(int pin) {
        System.out.println("ATM indisponibil.");
    }

    public void withdrawMoney(int amount) {
        System.out.println("ATM fără bani.");
    }
}