package Assignments.Assignment4.Problem1;

public class Furniture extends Product {

    private final String material;
    private final double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return "\nProduct Name : "+super.productName+"\nMaterial : " + this.material +
                "\nPrice : $" + super.getPrice() +
                "\nShipping Cost : $" + this.shippingCost +
                "\nTotal Cost : $" + this.getPrice();

    }
}
