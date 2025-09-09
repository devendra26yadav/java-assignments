package Assignments.Assignment4.Problem1;

public class Clothing extends Product {

    private final String brand;
    private final double discount;

    public Clothing(String productName, double price, String brand, double discount) {
        super(productName, price);
        this.brand = brand;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        double result = super.getPrice();
        double discountPrice = (this.discount / 100) * result;
        result = result - discountPrice;
        return result;
    }

    @Override
    public String toString() {

        return "\nProduct Name: " + super.getProductName() +
                "\nBrand : " + this.brand + "\nPrice: $" + super.getPrice() +
                "\nDiscount Price: $" + (super.getPrice() * 5) / 100 +
                "\nTotal Cost: $" + this.getPrice();
    }

}
