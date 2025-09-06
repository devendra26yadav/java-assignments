package Assignments.Assignment2;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("John","Doe","123893456");
        c1.setBillingAddress(new Address("Chicago","4th","Illinois","12345"));
        c1.setShippingAddress(new Address("Burlington","1000 N 5th","Illinois","78654"));

        Customer c2 = new Customer("James","Hook","377456856");
        c2.setBillingAddress(new Address("Chicago","200 S 9th","Illinois","89455"));
        c2.setShippingAddress(new Address("De moines","800 E 8th","Iowa","89554"));

        Customer c3 = new Customer("James","Hook","3788956");
        c3.setBillingAddress(new Address("FairField","1000 N 4th","Iowa","43755"));
        c3.setShippingAddress(new Address("De moines","700 E 8th","Iowa","56354"));
        Customer c4 = new Customer("Hamilton","Jack","76897856");
        c4.setBillingAddress(new Address("chicago","1000 N 4th","Illinois","43755"));
        c4.setShippingAddress(new Address("De moines","700 E 8th","Iowa","56354"));


        Customer[] records = new Customer[]{c1,c2,c3,c4};

        for(Customer c:records){
            if(c.getBillingAddress().getCity().equalsIgnoreCase("Chicago")){
                System.out.println(c);
            }
        }

    }
}
/*
Sample Output:

[ First name : John, Last name : Doe, ssn: 123893456]
[ First name : James, Last name : Hook, ssn: 377456856]
[ First name : Hamilton, Last name : Jack, ssn: 76897856]
 */