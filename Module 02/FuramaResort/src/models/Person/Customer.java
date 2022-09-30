package models.Person;

import java.util.Objects;

public class Customer extends Person{
    int customerID;
    String customerStandard;
    String address;

    public Customer(int customerID) {
        this.customerID = customerID;
    }

    public Customer(String name, String dateOfBirth, String gender, String idNumber, String phoneNumber, String emailAddress, int customerID, String customerStandard, String address) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, emailAddress);
        this.customerID = customerID;
        this.customerStandard = customerStandard;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerStandard() {
        return customerStandard;
    }

    public void setCustomerStandard(String customerStandard) {
        this.customerStandard = customerStandard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerStandard='" + customerStandard + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerID, customer.customerID);
    }

}
