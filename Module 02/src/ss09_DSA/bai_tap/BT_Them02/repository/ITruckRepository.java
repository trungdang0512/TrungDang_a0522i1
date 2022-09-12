package ss09_DSA.bai_tap.BT_Them02.repository;

import ss09_DSA.bai_tap.BT_Them02.models.Truck;

import java.util.List;

public interface ITruckRepository {
    void addNewTruck(Truck truck);

    List<Truck> findAll();

    void removeTruck(int index);

    String findTruck(String indexBKS);

    boolean checkValidTruck(String indexBKS);

    int getIndexTruck(String indexBKS);
}
