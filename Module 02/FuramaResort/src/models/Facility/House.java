package models.Facility;

public class House extends Facility{
    String roomStandard;
    int numberOfFloor;

    public House(String nameService, int usingArea, double hiringPrice, int numberOfPeople, String hiringKind, String roomStandard, int numberOfFloor) {
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

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
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
