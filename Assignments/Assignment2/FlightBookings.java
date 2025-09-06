package Assignments.Assignment2;


public record FlightBookings(String origin, String destination, double distance) {

    public FlightBookings {
        if (distance <= 0 ||origin.isEmpty()||destination.isEmpty()) {
            throw new IllegalArgumentException("Provide Valid Input");
        }
    }

    public double computeFlightTime(double avgSpeed) {
        return (this.distance / avgSpeed);
    }
}
/*

Enter origin: Chicago
Enter destination: Bangalore
Enter distance in km: 6000
Enter average speed (km/h): 450 Estimated Flight Time: 13.33 hours Do you want to continue (y/n): y
 */