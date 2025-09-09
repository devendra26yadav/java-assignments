package Assignments.Assignment4.Problem4;

public class ApplianceTest {

    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[4];

        appliances[0] = new Refrigerator(2);
        appliances[1] = new Microwave(780);
        appliances[2] = new WashingMachine(58);
        appliances[3] = new Microwave(983);

        for (Appliance electricAppliance : appliances) {
            if (electricAppliance != null) {
                System.out.printf("\n%s\n", electricAppliance.getClass().getSimpleName());
                electricAppliance.performAction();
            }
        }


    }
}
/*
Sample Output:

RRefrigerator
Cooling items at temperature : 2˚C

Microwave
Heating at power level : 780

WashingMachine
Starting wash cycle with load capacity: 58 kg.

Microwave
Heating at power level : 983


 */