package ro.ase.cts.facade.exercitiu1.model;


public class ComputerFacade implements IComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    @Override
    public void startComputer() {
        System.out.println("Pornire calculator...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Calculator pornit!");
    }
}