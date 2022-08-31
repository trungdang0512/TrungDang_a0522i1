package models;

public class House extends Facility{
    String roomStandard;
    String numberOfFloor;

    public House(String nameService, String usingArea, String hiringPrice, String numberOfPeople, String hiringKind, String roomStandard, String numberOfFloor) {
        super(nameService, usingArea, hiringPrice, numberOfPeople, hiringKind);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameService='" + nameService + '\'' +
                ", usingArea='" + usingArea + '\'' +
                ", hiringPrice='" + hiringPrice + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                ", hiringKind='" + hiringKind + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor='" + numberOfFloor + '\'' +
                '}';
    }
}
