package models.Facility;

public abstract class Facility {
    String nameService;
    String usingArea;
    String hiringPrice;
    String numberOfPeople;
    String hiringKind;

    public Facility(String nameService, String usingArea, String hiringPrice, String numberOfPeople, String hiringKind) {
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

    public String getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(String usingArea) {
        this.usingArea = usingArea;
    }

    public String getHiringPrice() {
        return hiringPrice;
    }

    public void setHiringPrice(String hiringPrice) {
        this.hiringPrice = hiringPrice;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
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
