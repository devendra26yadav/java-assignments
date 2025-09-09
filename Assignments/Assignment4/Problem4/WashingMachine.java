package Assignments.Assignment4.Problem4;

public class WashingMachine implements Appliance {
    private final int loadCapacity;


    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void performAction() {
        System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
    }
}
