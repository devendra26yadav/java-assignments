package Assignments.Assignments1;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class QuickEMI {

    public static void calculateQuickEMI(){
        RandomGenerator rg = RandomGenerator.getDefault();
        int principal = rg.nextInt(5000,25001);
        int n = rg.nextInt(6,36);
        double APR = rg.nextDouble(3.5,11.5);
        //monthly APR Annual Interest Rate
        double r = APR/12/100;
        double raise=Math.pow((1+r),n);
        double EMI = (principal*r*raise)/(raise-1);
        double totalPayment = EMI*n;
        double totalInterest = totalPayment - principal;
        System.out.println("+---------------------------------------------------------------------+");
        System.out.printf("|Principal(P) = $%d | Tenure(n) = %d months | Annual Interest Rate(APR) = %.1f%n",principal,n,APR);
        System.out.printf("|Total Payment = $%.2f |%n|Total Interest = $%.2f  |%n",totalPayment,totalInterest);
        System.out.println("|---------------------------------------------------------------|");
        System.out.printf("| EMI = $%5f %n| Rounded EMI = $%d%n",EMI,Math.round(EMI));
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println();

    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            calculateQuickEMI();
            System.out.println("Enter Your Choice: \nType  1 to try a sample quote\nType 0 to quit\n");
            choice=sc.nextInt();
        }while(choice==1);
        sc.close();
    }
}
/*
Sample Output

+---------------------------------------------------------------------+
|Principal(P) = $7069 | Tenure(n) = 7 months | Annual Interest Rate(APR) = 6.2
|Total Payment = $7215.97 |
|Total Interest = $146.97  |
|---------------------------------------------------------------|
| EMI = $1030.853488
| Rounded EMI = $1031
+---------------------------------------------------------------------+

Enter Your Choice:
Type  1 to try a sample quote
Type 0 to quit

1
+---------------------------------------------------------------------+
|Principal(P) = $17422 | Tenure(n) = 7 months | Annual Interest Rate(APR) = 5.9
|Total Payment = $17763.88 |
|Total Interest = $341.88  |
|---------------------------------------------------------------|
| EMI = $2537.697702
| Rounded EMI = $2538
+---------------------------------------------------------------------+

Enter Your Choice:
Type  1 to try a sample quote
Type 0 to quit

 */