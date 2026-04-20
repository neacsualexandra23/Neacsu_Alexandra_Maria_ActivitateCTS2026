package ro.ase.cts.state.exercitiul1.main;
import  ro.ase.cts.state.exercitiul1.model.*;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawMoney(200);
        atm.ejectCard();
    }
}