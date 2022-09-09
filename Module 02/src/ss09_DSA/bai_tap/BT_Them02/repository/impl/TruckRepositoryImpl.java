package ss09_DSA.bai_tap.BT_Them02.repository.impl;

import ss09_DSA.bai_tap.BT_Them02.models.Truck;
import ss09_DSA.bai_tap.BT_Them02.repository.ITruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckRepositoryImpl implements ITruckRepository {
    List<Truck> truckList = new ArrayList<>();

    @Override
    public void addNewTruck(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public List<Truck> findAll() {
        return truckList;
    }

    @Override
    public void removeTruck(int index) {
        truckList.remove(index);

    }

    @Override
    public String findTruck(String indexBKS) {
        return truckList.get(checkValidTruck(indexBKS)).toString();
    }

    @Override
    public int checkValidTruck(String indexBKS) {
        return truckList.indexOf(indexBKS);
    }
}
