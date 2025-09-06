package Assignments.Assignment2;

class Address {
    private final String city;
    private final String street;
    private final String state;
    private final String zip;

    public Address(String city, String street, String state, String zip) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "city : " + this.city + ", street :" + street + ", zip: " + zip;
    }
}

public class Customer {

    private String firstName;
    private String lastName;
    private String socSecurity;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurity = socSecurity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurity() {
        return socSecurity;
    }

    public void setSocSecurity(String socSecurity) {
        this.socSecurity = socSecurity;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {

        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString(){
        return "[ First name : " + firstName + " Last name : " + lastName + ", ssn: " + socSecurity + "]" ;
    }
}
