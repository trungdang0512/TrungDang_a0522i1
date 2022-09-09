package ss09_DSA.bai_tap.BT_Them02.services;

import ss09_DSA.bai_tap.BT_Them02.models.Car;
import ss09_DSA.bai_tap.BT_Them02.repository.impl.CarRepositoryImpl;
import ss09_DSA.bai_tap.BT_Them02.repository.ICarRepository;

import java.util.List;
import java.util.Scanner;

public class CarServiceImpl implements ICarService{
    private static Scanner scanner = new Scanner(System.in);
    private static ICarRepository carRepository = new CarRepositoryImpl();

    @Override
    public void addNewCar(Car car) {
        carRepository.addNewCar(car);
    }

    @Override
    public void displayCarList() {
        List<Car> carList = carRepository.findAll();
        for (Car car: carList){
            System.out.println(car.toString());
        }
    }

    @Override
    public void removeCar(String indexBKS) {
        int index = carRepository.checkValidCar(indexBKS);
        if (index != -1){
            carRepository.removeCar(index);
            System.out.println("Remove successfully!!");
        }else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void findCar(String indexBKS) {
        int index = carRepository.checkValidCar(indexBKS);
        if (index != -1){
            carRepository.findCar(indexBKS);
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
