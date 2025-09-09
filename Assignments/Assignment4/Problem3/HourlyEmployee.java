package Assignments.Assignment4.Problem3;

public class HourlyEmployee extends Employee{
   private final double wages;
    private final double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wages,double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wages=wages;
        this.hours=hours;
    }
    double getPayment(){
        return Math.round(wages*hours);
    }

}
