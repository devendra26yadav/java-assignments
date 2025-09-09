package Assignments.Assignment4.Problem3;

public class SalariedEmployee extends Employee{
    private final double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }

    @Override
    double getPayment() {
        return Math.round( weeklySalary);
    }

}
