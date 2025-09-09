package Assignments.Assignment4.Problem3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private final double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return Math.round(baseSalary + super.getPayment());
    }
}

