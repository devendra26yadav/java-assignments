package Assignments.Assignment2;

public record HotelBookings(String hotelName, int numberOfNights, double pricePerNight) {
    public HotelBookings {
        if (hotelName.isEmpty() || numberOfNights < 0 || pricePerNight <= 0.0) {
            throw new IllegalArgumentException("Not Valid Input");
        }
    }

    public double totalCost() {
        return numberOfNights * pricePerNight;
    }
}
