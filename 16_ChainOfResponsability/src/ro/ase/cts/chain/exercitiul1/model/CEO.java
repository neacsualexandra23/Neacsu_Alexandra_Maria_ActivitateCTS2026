package ro.ase.cts.chain.exercitiul1.model;

public class CEO implements IHandler {
    private IHandler next;

    public void setNext(IHandler next) {
        this.next = next;
    }

    public void handle(int amount) {
        System.out.println("CEO aprobă: " + amount);
    }
}