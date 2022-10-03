package models.Facility;

public class Villa extends Facility{
    String roomStandard;
    int poolArea;
    int numberOfFloor;

    public Villa(String nameService, int usingArea, double hiringPrice, int numberOfPeople, String hiringKind, String roomStandard, int poolArea, int numberOfFloor) {
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

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
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
