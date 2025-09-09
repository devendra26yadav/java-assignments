package Assignments.Assignment4.Problem3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new CommissionEmployee("Bob", "Noman", "37862", 3724, 45);
        Employee e2 = new SalariedEmployee("Jack", "Topal", "89267", 1408);
        Employee e3 = new BasePlusCommissionEmployee("Rozi", "Dorsa", "54654654", 3400);
        Employee e4 = new HourlyEmployee("Dev", "Yadav", "123456789", 255, 12);
        Employee e5 = new HourlyEmployee("Abby", "Altman", "874302930", 130, 9);

        Employee[] employeeSalaryList = findSalaryList(new Employee[]{e1, e2, e3, e4, e5}, 3000);
        for(Employee e : employeeSalaryList){
            System.out.println(e);
        }
    }

    public static Employee[] findSalaryList(Employee[] employees, double salary) {
        if (employees == null) {
            return null;
        }
        Employee[] retList = getEmployees(employees, salary);
        System.out.printf("%d Employees are having less than $%.2f salary",retList.length,salary);
        int index = 0;
        for (Employee e : employees) {
            if (e != null) {
                switch (e) {
                    case BasePlusCommissionEmployee b -> {
                        if (b.getPayment() < salary) {
                            retList[index++] = b;
                        }
                    }
                    case CommissionEmployee c -> {
                        if (c.getPayment() < salary) {
                            retList[index++] = c;
                        }
                    }
                    case SalariedEmployee s -> {
                        if (s.getPayment() < salary) {
                            retList[index++] = s;
                        }
                    }
                    case HourlyEmployee h -> {
                        if (h.getPayment() < salary) {
                            retList[index++] = h;
                        }
                    }
                    default -> {
                    }
                }
            }
        }
        return retList;
    }

    private static Employee[] getEmployees(Employee[] employees, double salary) {
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                switch (e) {
                    case BasePlusCommissionEmployee b -> {
                        if (b.getPayment() < salary) {
                            count++;
                        }
                    }
                    case CommissionEmployee c -> {
                        if (c.getPayment() < salary) {
                            count++;
                        }
                    }
                    case SalariedEmployee s -> {
                        if (s.getPayment() < salary) {
                            count++;
                        }
                    }
                    case HourlyEmployee h -> {
                        if (h.getPayment() < salary) {
                            count++;
                        }
                    }
                    default -> {
                    }
                }
            }
        }
        return new Employee[count];
    }
}
/*
Sample Output:

3 Employees are having less than $3000.00 salary
Name : Bob Noman
Social Security Number : 37862
Paying : $1676.0

Name : Jack Topal
Social Security Number : 89267
Paying : $1408.0

Name : Abby Altman
Social Security Number : 874302930
Paying : $1170.0

 */