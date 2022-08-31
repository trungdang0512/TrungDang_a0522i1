package models;

public class Booking {
    String bookingID;
    String startDate;
    String endDate;
    String customerID;
    String nameService;
    String kindService;

    public Booking(String bookingID, String startDate, String endDate, String customerID, String nameService, String kindService) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerID = customerID;
        this.nameService = nameService;
        this.kindService = kindService;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getKindService() {
        return kindService;
    }

    public void setKindService(String kindService) {
        this.kindService = kindService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", nameService='" + nameService + '\'' +
                ", kindService='" + kindService + '\'' +
                '}';
    }
}
