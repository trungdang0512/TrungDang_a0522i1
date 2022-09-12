package ss09_DSA.bai_tap.BT_Them02.services.impl;

import ss09_DSA.bai_tap.BT_Them02.models.Car;
import ss09_DSA.bai_tap.BT_Them02.repository.impl.CarRepositoryImpl;
import ss09_DSA.bai_tap.BT_Them02.repository.ICarRepository;
import ss09_DSA.bai_tap.BT_Them02.services.ICarService;
import ss09_DSA.bai_tap.BT_Them02.services.IHangSxService;

import java.util.List;
import java.util.Scanner;

public class CarServiceImpl implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarRepository carRepository = new CarRepositoryImpl();
    private static IHangSxService hangSxService = new HangSxServiceImpl();

    @Override
    public void addNewCar() {
        carRepository.addNewCar(this.inputCarInfo());
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
        String fullBKS = this.findBKS(indexBKS);
        if (this.checkValidCar(indexBKS)) {
            int index = carRepository.getIndexCar(fullBKS);
            if (index != -1) {
                carRepository.removeCar(index);
                System.out.println("Remove successfully!!");
            }
        }
    }

    @Override
    public String findCar(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        String result = "none";
        if (this.checkValidCar(indexBKS)) {
            int index = carRepository.getIndexCar(fullBKS);
            if (index != -1) {
                result = carRepository.findCar(fullBKS);
            }
        }
        return result;
    }

    @Override
    public boolean checkValidCar(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        return carRepository.checkValidCar(fullBKS);
    }

    @Override
    public Car inputCarInfo() {
        System.out.println("Nhập biển số: ");
        String inputBienSo = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        String inputNamSanXuat = scanner.nextLine();
        System.out.println("Hãng sản xuất: ");
        String inputHangSanXuat = hangSxService.chooseHangSX();
        System.out.println("Nhập tên chủ sở hữu: ");
        String inputChuSoHuu = scanner.nextLine();
        System.out.println("Kiểu xe (du lịch, xe khách)");
        String inputKieuXe = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int inputSoChoNgoi = Integer.parseInt(scanner.nextLine());

        Car car = new Car(inputBienSo,inputHangSanXuat,inputNamSanXuat,inputChuSoHuu,inputSoChoNgoi,inputKieuXe);
        return car;
    }

    @Override
    public String findBKS(String inputBKS) {
        List<Car> carList = carRepository.findAll();
        String foundBKS = null;
        for (int i = 0; i< carList.size(); i++){
            boolean isFoundID = carList.get(i).getBienKiemSoat().contains(inputBKS);
            if (isFoundID){
                foundBKS = carList.get(i).getBienKiemSoat();
            }
        }
        return foundBKS;
    }
}
