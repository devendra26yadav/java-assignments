package Assignments.Assignment2;

public class PizzaTest {

    public static void main(String[] args) {
        Pizza p1 = new Pizza(PizzaSize.SMALL, PizzaType.VEGGIE, 2);
        Pizza p2 = new Pizza(PizzaSize.MEDIUM, PizzaType.PEPPERONI, 1);
        Pizza p3 = new Pizza(PizzaSize.LARGE, PizzaType.BBQCHICKEN, 2);
        System.out.println(p1.printOrderSummary());
        System.out.println(p2.printOrderSummary());
        System.out.println(p3.printOrderSummary());
    }
}

/*
Sample Output:


Pizza Order:
Size : SMALL
Type: VEGGIE
Qty: 2
Price : $18.00
Tax: $0.54
Total Price : $18.54

Pizza Order:
Size : MEDIUM
Type: PEPPERONI
Qty: 1
Price : $12.00
Tax: $0.36
Total Price : $12.36

Pizza Order:
Size : LARGE
Type: BBQCHICKEN
Qty: 2
Price : $28.00
Tax: $0.84
Total Price : $28.84

 */