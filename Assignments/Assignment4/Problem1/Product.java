package Assignments.Assignment4.Problem1;

public class Product {
    protected final String productName;
    protected double price;

    public Product(String productName, double price) {
        this.productName = (productName == null || productName.trim().isEmpty()) ? "Unknown" : productName;
        this.price = Math.abs(price);
    }

    public String getProductName() {
        return this.productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
