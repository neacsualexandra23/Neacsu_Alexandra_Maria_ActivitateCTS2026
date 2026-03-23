package ro.ase.cts.facade.exercitiu1.model;


public class ComputerFacade implements IComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
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