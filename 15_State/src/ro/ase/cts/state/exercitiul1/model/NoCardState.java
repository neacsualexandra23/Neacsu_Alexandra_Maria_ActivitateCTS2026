package ro.ase.cts.state.exercitiul1.model;

public class NoCardState implements IATMState {
    private ATM atm;

    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card introdus.");
        atm.setState(atm.getHasCardState());
    }

    public void ejectCard() {
        System.out.println("Nu există card.");
    }

    public void enterPin(int pin) {
        System.out.println("Introduceți mai întâi cardul.");
    }

    public void withdrawMoney(int amount) {
        System.out.println("Introduceți cardul.");
    }
}