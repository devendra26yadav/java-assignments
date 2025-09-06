package Assignments.Assignment2;

import java.util.Scanner;

public class TravelBookingTest {
    public static void main(String[] args) {
        char choice = 0;
        do {
            System.out.print("Enter F Flight Booking\nEnter H for Hotel Booking\nEnter C for Car rental\n");
            Scanner input = new Scanner(System.in);
            char decision = 0;
            String line = input.nextLine().trim();
            if (!line.isEmpty()) {
                decision = line.charAt(0);
            }
            switch (decision) {
                case 'F' -> {
                    System.out.print("Enter origin : ");
                    String origin=input.nextLine().trim();
                    System.out.print("Enter destination : ");
                    String destination =input.nextLine().trim();
                    System.out.print("Enter distance in KM : ");
                    double distance =Double.parseDouble(input.nextLine());
                    System.out.print("Enter average speed(km/h) : ");
                    double avgSpeed =Double.parseDouble(input.nextLine());
                    FlightBookings fb = new FlightBookings(origin, destination, distance);
                    System.out.printf("Estimated Flight Time : %.2f hours", fb.computeFlightTime(avgSpeed));

                }
                case 'H' -> {
                    System.out.print("Enter hotel name : ");
                    String hotelName = input.nextLine().trim();
                    System.out.print("Enter number of nights : ");
                    int numberOfNights = Integer.parseInt(input.nextLine());
                    System.out.print("Enter price per night : $");
                    double pricePerNight = Double.parseDouble(input.nextLine());
                    HotelBookings hb = new HotelBookings(hotelName, numberOfNights, pricePerNight);
                    System.out.printf("Total hotel cost : $%.2f", hb.totalCost());
                }
                case 'C' -> {
                    System.out.print("Enter car model : ");
                    String carModelName = input.nextLine().trim();
                    System.out.print("Enter number of days : ");
                    int numberOfDays = Integer.parseInt(input.nextLine().trim());
                    System.out.print("Enter rate per day : $");
                    double ratePerDay = Double.parseDouble(input.nextLine().trim());
                    System.out.print("Enter miles per day : ");
                    int milesPerDay = Integer.parseInt(input.nextLine().trim());
                    CarRental cr = new CarRental(carModelName, numberOfDays, ratePerDay, milesPerDay);
                    System.out.printf("Total Rental Cost : $%.2f", cr.totalRentalCost());
                    System.out.printf("\nTotal Miles Allowed : $%.2f", cr.totalMilesAllowed());
                }
                default -> System.out.println("Not a valid input");
            }

            System.out.print("\nDo you want to continue (y/n) : ");
            line = input.nextLine();
            if (!line.isEmpty()) {
                choice = line.charAt(0);
            }
            if(choice=='n' || choice=='N'){
                System.out.println("GoodBye!");
                break;
            }
        } while (choice == 'Y' || choice == 'y');
    }
}
/*

Sample Output:

Enter F Flight Booking
Enter H for Hotel Booking
Enter C for Car rental
H
Enter hotel name : Hiking Body
Enter number of nights : 5
Enter price per night : $23.34
Total hotel cost : $116.70
Do you want to continue (y/n) : y
Enter F Flight Booking
Enter H for Hotel Booking
Enter C for Car rental
C
Enter car model : 2027
Enter number of days : 8
Enter rate per day : $12.26
Enter miles per day : 35
Total Rental Cost : $98.08
Total Miles Allowed : $280.00
Do you want to continue (y/n) : n
GoodBye!

 */