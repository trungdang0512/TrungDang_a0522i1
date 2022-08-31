package models;

public class Customer extends Person{
    String customerID;
    String customerStandard;
    String address;

    public Customer(String name, String dateOfBirth, String gender, String idNumber, String phoneNumber, String emailAddress, String customerID, String customerStandard, String address) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, emailAddress);
        this.customerID = customerID;
        this.customerStandard = customerStandard;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
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
}
