package ro.ase.cts.chain.exercitiul1.model;

public class Manager implements IHandler {
    private IHandler next;

    public void setNext(IHandler next) {
        this.next = next;
    }


    public void handle(int amount) {
        if (amount <= 1000) {
            System.out.println("Manager aprobă: " + amount);
        } else if (next != null) {
            next.handle(amount);
        }
    }
}