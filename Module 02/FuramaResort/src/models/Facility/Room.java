package models.Facility;

public class Room extends Facility{
    String freeServiceIncluding;

    public Room(String nameService, String usingArea, String hiringPrice, String numberOfPeople, String hiringKind, String freeServiceIncluding) {
        super(nameService, usingArea, hiringPrice, numberOfPeople, hiringKind);
        this.freeServiceIncluding = freeServiceIncluding;
    }

    public String getFreeServiceIncluding() {
        return freeServiceIncluding;
    }

    public void setFreeServiceIncluding(String freeServiceIncluding) {
        this.freeServiceIncluding = freeServiceIncluding;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameService='" + nameService + '\'' +
                ", usingArea='" + usingArea + '\'' +
                ", hiringPrice='" + hiringPrice + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                ", hiringKind='" + hiringKind + '\'' +
                ", freeServiceIncluding='" + freeServiceIncluding + '\'' +
                '}';
    }
}
