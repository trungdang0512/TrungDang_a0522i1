package ss09_DSA.bai_tap.BT_Them02.services;

import ss09_DSA.bai_tap.BT_Them02.models.Car;

import java.util.List;

public interface ICarService {
    void addNewCar(Car car);

    void displayCarList();

    void removeCar(String indexBKS);

    void findCar(String indexBKS);
}
