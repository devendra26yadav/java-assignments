package Assignments.Assignment4.Problem1;

public class Electronics extends Product{
    private final int totalWarrantyMonths;
    private final double warrantyCost;
    public Electronics(String productName, double price,int totalWarrantyMonths,double warrantyCost) {
        super(productName, price);
        this.totalWarrantyMonths=totalWarrantyMonths;
        this.warrantyCost=warrantyCost;

    }
    @Override
    public double getPrice(){
        return super.getPrice()+warrantyCost;
    }
    @Override
    public String toString(){
        return "\nProduct Name :"+super.getProductName()+
                "\nWarranty : "+totalWarrantyMonths+" months"+
                "\nPrice: $"+super.getPrice()+
                "\nWarranty Cost : $"+warrantyCost+
                "\nTotal Cost: $"+this.getPrice();
    }

}
