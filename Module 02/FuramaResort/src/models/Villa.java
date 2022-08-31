package models;

public class Villa extends Facility{
    String roomStandard;
    String poolArea;
    String numberOfFloor;

    public Villa(String nameService, String usingArea, String hiringPrice, String numberOfPeople, String hiringKind, String roomStandard, String poolArea, String numberOfFloor) {
        super(nameService, usingArea, hiringPrice, numberOfPeople, hiringKind);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "nameService='" + nameService + '\'' +
                ", usingArea='" + usingArea + '\'' +
                ", hiringPrice='" + hiringPrice + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                ", hiringKind='" + hiringKind + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloor='" + numberOfFloor + '\'' +
                '}';
    }
}
