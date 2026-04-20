package ro.ase.cts.state.exercitiul1.model;

public class HasCardState implements IATMState {
    private ATM atm;

    public HasCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card deja introdus.");
    }

    public void ejectCard() {
        System.out.println("Card scos.");
        atm.setState(atm.getNoCardState());
    }

    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("PIN corect.");
            atm.setState(atm.getAuthenticatedState());
        } else {
            System.out.println("PIN greșit.");
            atm.setState(atm.getNoCardState());
        }
    }

    public void withdrawMoney(int amount) {
        System.out.println("Introduceți PIN-ul.");
    }
}