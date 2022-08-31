package models;

public class Contract {
    String contractID;
    String bookingID;
    String depositMoney;
    String totalMoney;
    String customerID;

    public Contract(String contractID, String bookingID, String depositMoney, String totalMoney, String customerID) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.depositMoney = depositMoney;
        this.totalMoney = totalMoney;
        this.customerID = customerID;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(String depositMoney) {
        this.depositMoney = depositMoney;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", depositMoney='" + depositMoney + '\'' +
                ", totalMoney='" + totalMoney + '\'' +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}
