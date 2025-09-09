package Assignments.Assignment4.Problem4;

public class Microwave implements Appliance {
    private  final int powerLevel;
    public Microwave(int powerLevel){
        this.powerLevel=powerLevel;
    }

    public String heatFood() {

        return "Heating food at power level: " + powerLevel + ".";
    }
    @Override
    public void performAction() {
        System.out.println("Heating at power level : "+this.powerLevel);
    }

    public int getPowerLevel() {
        return powerLevel;
    }
}
