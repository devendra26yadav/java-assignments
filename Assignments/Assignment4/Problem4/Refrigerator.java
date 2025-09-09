package Assignments.Assignment4.Problem4;

public class Refrigerator  implements  Appliance{
    private final int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    @Override
    public void performAction() {
        System.out.println("Cooling items at temperature : "+this.temperature+"˚C");
    }
}
