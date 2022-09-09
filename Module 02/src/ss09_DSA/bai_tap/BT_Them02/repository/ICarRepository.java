package ss09_DSA.bai_tap.BT_Them02.repository;

import ss09_DSA.bai_tap.BT_Them02.models.Car;

import java.util.List;

public interface ICarRepository {

    void addNewCar(Car car);

    List<Car> findAll();

    void removeCar(int index);

    String findCar(String indexBKS);

    int checkValidCar(String indexBKS);


}
