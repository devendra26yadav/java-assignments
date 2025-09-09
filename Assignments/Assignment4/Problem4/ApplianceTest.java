package Assignments.Assignment4.Problem4;

public class ApplianceTest {

    public static void main(String[] args) {
        Appliance[] appliances = {
                new Refrigerator(2),
                new Microwave(780),
                null,
                new WashingMachine(58),
                new Microwave(983),
                null
        };

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