package Assignments.Assignments1;
import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        char choice;
        do {
            System.out.println("Type : R = Residential, C = Commercial, I = Industrial");
            Scanner input = new Scanner(System.in);
            char userType = input.nextLine().charAt(0);
            System.out.println("Enter units consumed: ");
            int units = input.nextInt();
            double billAmounts = switch (userType) {
                case 'R' -> units * 0.12;
                case 'C' -> units * 0.20;
                case 'I' -> units * 0.35;
                default -> 0.0;
            };
            System.out.printf("User Type : %s\nUnits: %d\n",userType,units);
            System.out.println("Bill Amount : "+billAmounts);
            System.out.print("Do you want to calculate another bill?(y/n):");
            choice = input.next().charAt(0);
            if(choice=='n' || choice=='N'){
                System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
            }
        } while (choice == 'Y' || choice == 'y');
    }
}
/*
Sample Output:

Type : R = Residential, C = Commercial, I = Industrial
I
Enter units consumed:
260
User Type : I
Units: 260
Bill Amount : 91.0
Do you want to calculate another bill?(y/n):y
Type : R = Residential, C = Commercial, I = Industrial
C
Enter units consumed:
270
User Type : C
Units: 270
Bill Amount : 54.0
Do you want to calculate another bill?(y/n):n
Goodbye! Thanks for using the Electricity Bill Generator.


 */