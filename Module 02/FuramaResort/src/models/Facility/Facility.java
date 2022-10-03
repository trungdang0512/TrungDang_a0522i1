package models.Facility;

public abstract class Facility {
    String nameService;
    int usingArea;
    double hiringPrice;
    int numberOfPeople;
    String hiringKind;

    public Facility(String nameService, int usingArea, double hiringPrice, int numberOfPeople, String hiringKind) {
        this.nameService = nameService;
        this.usingArea = usingArea;
        this.hiringPrice = hiringPrice;
        this.numberOfPeople = numberOfPeople;
        this.hiringKind = hiringKind;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(int usingArea) {
        this.usingArea = usingArea;
    }

    public double getHiringPrice() {
        return hiringPrice;
    }

    public void setHiringPrice(double hiringPrice) {
        this.hiringPrice = hiringPrice;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getHiringKind() {
        return hiringKind;
    }

    public void setHiringKind(String hiringKind) {
        this.hiringKind = hiringKind;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", usingArea='" + usingArea + '\'' +
                ", hiringPrice='" + hiringPrice + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                ", hiringKind='" + hiringKind + '\'' +
                '}';
    }
}
