package Assignments.Assignment2;

public class Pizza {
    private final PizzaType pizzaType;
    private final PizzaSize pizzaSize;
    private final int quantity;
    private double price=0;

    public Pizza(PizzaSize pizzaSize,PizzaType pizzaType, int quantity){
        this.pizzaSize=pizzaSize;
        this.pizzaType=pizzaType;
        this.quantity=quantity;
    }
    private void calculatePrice(){
        double getSizePrice=switch (this.pizzaSize){
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };
        double getTypePrice = switch (this.pizzaType){
            case CHEEZE -> 1.5;
            case PEPPERONI, BBQCHICKEN -> 2;
            case VEGGIE -> 1;
        };

        this.price = switch (this.pizzaSize){
            case PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE -> {
                yield (getSizePrice+getTypePrice)*this.quantity;
            }
        };
    }

    public String printOrderSummary(){
        calculatePrice();
        double tax = this.price*0.03;
        return String.format("Pizza Order:\nSize : %s\nType: %s\nQty: %d\nPrice : $%.2f \nTax: $%.2f\nTotal Price : $%.2f\n",
                pizzaSize,pizzaType,quantity,this.price,tax,this.price+tax);
    }
}
