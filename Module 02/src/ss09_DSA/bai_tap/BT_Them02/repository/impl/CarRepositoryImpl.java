package ss09_DSA.bai_tap.BT_Them02.repository.impl;

import ss09_DSA.bai_tap.BT_Them02.models.Car;
import ss09_DSA.bai_tap.BT_Them02.repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements ICarRepository {
    private static List<Car> carList = new ArrayList<>();

    @Override
    public void addNewCar(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> findAll() {
        return carList;
    }

    @Override
    public void removeCar(int index) {
        carList.remove(index);
    }

    @Override
    public String findCar(String indexBKS) {
        return carList.get(getIndexCar(indexBKS)).toString();
    }

    @Override
    public int getIndexCar(String indexBKS) {
        Car car = new Car(indexBKS);
        return carList.indexOf(car);
    }

    @Override
    public boolean checkValidCar(String indexBKS) {
        Car car = new Car(indexBKS);
        return carList.contains(car);
    }

}
