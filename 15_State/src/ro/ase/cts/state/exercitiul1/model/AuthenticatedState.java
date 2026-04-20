package ro.ase.cts.state.exercitiul1.model;

public class AuthenticatedState implements IATMState {
    private ATM atm;

    public AuthenticatedState(ATM atm) {
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
        System.out.println("Deja autentificat.");
    }

    public void withdrawMoney(int amount) {
        if (atm.getCash() >= amount) {
            System.out.println("Retragere: " + amount);
            atm.setCash(atm.getCash() - amount);

            if (atm.getCash() == 0) {
                atm.setState(atm.getNoCashState());
            }
        } else {
            System.out.println("Fonduri insuficiente.");
        }
    }
}