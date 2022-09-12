package ss09_DSA.bai_tap.BT_Them02.services;

import ss09_DSA.bai_tap.BT_Them02.models.Car;

import java.util.List;

public interface ICarService {
    void addNewCar();

    void displayCarList();

    void removeCar(String indexBKS);

    String findCar(String indexBKS);

    boolean checkValidCar(String indexBKS);

    Car inputCarInfo();

    String findBKS(String inputBKS);

}
