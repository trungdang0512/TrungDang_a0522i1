package ss09_DSA.bai_tap.BT_Them02.services;

import ss09_DSA.bai_tap.BT_Them02.models.Car;
import ss09_DSA.bai_tap.BT_Them02.models.Truck;

public interface ITruckService {
    void addNewTruck();

    void displayTruckList();

    void removeTruck(String indexBKS);

    String findTruck(String indexBKS);

    boolean checkValidTruck(String indexBKS);

    Truck getTruckInfo();

    String findBKS(String inputBKS);
}
