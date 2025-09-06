package Assignments.Assignment2;

//immutable class -> is one which properties does not modify
public final class CarRental {
    private final String carModel;
    private final int numberOfDays;
    private final double ratePerDay;
    private final int milesPerDay;

    public CarRental(String carModel, int numberOfDays, double ratePerDay, int milesPerDay) {
        if (carModel.isEmpty()||numberOfDays < 0 || ratePerDay < 0 || milesPerDay < 0) {
            throw new IllegalArgumentException("Not Valid Input");
        }
        this.carModel = carModel;
        this.numberOfDays = numberOfDays;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost() {
        return numberOfDays * ratePerDay;
    }

    public double totalMilesAllowed() {
        return numberOfDays * milesPerDay;
    }
}
