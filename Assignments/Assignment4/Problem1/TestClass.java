package Assignments.Assignment4.Problem1;

public class TestClass {

    public static void main(String[] args) {
        Product p1 = new Electronics("iphone", -4500, 12, 525);
        Product p2 = new Electronics("Laptop", 5000, 12, 200);
        Product p3 = new Furniture("Dining Table", 345.50, "Wood", 23.45);
        Product p4 = new Clothing("T-Shirt", 670.58, "Polo", 15);
        Product p5 = new Electronics("Earphone", 325, 3, 25);

        Product[] products = {p1, null, p2, p3, p4, p5, null};

        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }
        System.out.printf("\nTotal Products Costs :$%.2f", sumProducts(products));
    }

    public static double sumProducts(Product[] products) {

        if (products == null) return 0.0;
        double productPrice = 0.0;
        for (Product p : products) {
            if (p != null) {
                productPrice += p.getPrice();
            }
        }
        return productPrice;
    }
}
