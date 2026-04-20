package ro.ase.cts.state.exercitiul1.model;

public class ATM {
    private IATMState noCardState;
    private IATMState hasCardState;
    private IATMState authenticatedState;
    private IATMState noCashState;

    private IATMState currentState;
    private int cash = 1000;

    public ATM() {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        authenticatedState = new AuthenticatedState(this);
        noCashState = new NoCashState(this);

        currentState = noCardState;
    }

    public void setState(IATMState state) {
        this.currentState = state;
    }

    public IATMState getNoCardState() { return noCardState; }
    public IATMState getHasCardState() { return hasCardState; }
    public IATMState getAuthenticatedState() { return authenticatedState; }
    public IATMState getNoCashState() { return noCashState; }

    public int getCash() { return cash; }
    public void setCash(int cash) { this.cash = cash; }

    // Delegare către stare
    public void insertCard() { currentState.insertCard(); }
    public void ejectCard() { currentState.ejectCard(); }
    public void enterPin(int pin) { currentState.enterPin(pin); }
    public void withdrawMoney(int amount) { currentState.withdrawMoney(amount); }
}