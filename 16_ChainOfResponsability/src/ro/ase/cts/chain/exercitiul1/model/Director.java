package ro.ase.cts.chain.exercitiul1.model;

public class Director implements IHandler {
    private IHandler next;

    public void setNext(IHandler next) {
        this.next = next;
    }

    public void handle(int amount) {
        if (amount <= 5000) {
            System.out.println("Director aprobă: " + amount);
        } else if (next != null) {
            next.handle(amount);
        }
    }
}