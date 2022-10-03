package services.Impl;

import models.Facility.Facility;
import models.Facility.House;
import models.Facility.Room;
import models.Facility.Villa;
import services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<Facility, Integer>();

    @Override
    public void displayAll() {

    }

    @Override
    public void addNewVilla() {
        Villa newVilla = (Villa) this.getVillaInfo();
        facilityList.put(newVilla, 1);
    }

    @Override
    public void addNewHouse() {
        House newHouse = (House) this.getHouseInfo();
        facilityList.put(newHouse, 1);
    }

    @Override
    public void addNewRoom() {
        Room newRoom = (Room) this.getRoomInfo();
        facilityList.put(newRoom, 1);
    }

    @Override
    public void displayMaintainedFacility() {
    }

    @Override
    public Facility findFacility(int inputID) {
        return null;
    }

    @Override
    public Facility getVillaInfo() {
        System.out.println("Enter Facility info: ");
        System.out.println("Enter Service Name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter Using Area: ");
        int usingArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Hiring Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of people: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter hiring kind: ");
        String hiringKind = scanner.nextLine();
        System.out.println("Enter room standard: ");
        String standard = scanner.nextLine();
        System.out.println("Enter pool area: ");
        int poolArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of floor: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa newVilla = new Villa(serviceName, usingArea,price,people,hiringKind,standard,poolArea,floor);
        return newVilla;
    }

    @Override
    public Facility getHouseInfo() {
        System.out.println("Enter Facility info: ");
        System.out.println("Enter Service Name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter Using Area: ");
        int usingArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Hiring Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of people: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter hiring kind: ");
        String hiringKind = scanner.nextLine();
        System.out.println("Enter Room standard: ");
        String standard = scanner.nextLine();
        System.out.println("Enter numer of floor: ");
        int floor = Integer.parseInt(scanner.nextLine());

        House newHouse = new House(serviceName,usingArea,price,people,hiringKind,standard,floor);
        return newHouse;
    }

    @Override
    public Facility getRoomInfo() {
        System.out.println("Enter Facility info: ");
        System.out.println("Enter Service Name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter Using Area: ");
        int usingArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Hiring Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of people: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter hiring kind: ");
        String hiringKind = scanner.nextLine();
        System.out.println("Enter service including: ");
        String service = scanner.nextLine();

        Room newRoom = new Room(serviceName,usingArea,price,people,hiringKind,service);
        return newRoom;
    }


}
