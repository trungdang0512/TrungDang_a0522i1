package ss09_DSA.bai_tap.BT_Them02.controllers;

import ss09_DSA.bai_tap.BT_Them02.services.ICarService;
import ss09_DSA.bai_tap.BT_Them02.services.IMotorBikeService;
import ss09_DSA.bai_tap.BT_Them02.services.ITruckService;
import ss09_DSA.bai_tap.BT_Them02.services.impl.CarServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.MotorBikeServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.TruckServiceImpl;

import java.util.Scanner;

public class RemoveVehicleController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService carService = new CarServiceImpl();
    private static IMotorBikeService motorBikeService = new MotorBikeServiceImpl();
    private static ITruckService truckService = new TruckServiceImpl();

    public static void removeVehicle(){
        System.out.println("Nhập BKS: ");
        String inputBKS = scanner.nextLine();

        if (motorBikeService.checkValidMotorBike(inputBKS)){
            confirmRemove();
            switch (scanner.nextInt()) {
                case 1: {
                    motorBikeService.removeMotorBike(inputBKS);
                    System.out.println("Đã xóa thành công");
                    break;
                }
                case 2: {
                    return;
                }
            }
        }else if (carService.checkValidCar(inputBKS)){
            confirmRemove();
            switch (scanner.nextInt()) {
                case 1: {
                    carService.removeCar(inputBKS);
                    System.out.println("Đã xóa thành công");
                    break;
                }
                case 2: {
                    return;
                }
            }
        }else if (truckService.checkValidTruck(inputBKS)){
            confirmRemove();
            switch (scanner.nextInt()) {
                case 1: {
                    truckService.removeTruck(inputBKS);
                    System.out.println("Đã xóa thành công");
                    break;
                }
                case 2: {
                    return;
                }
            }
        }else {
            System.out.println("Không tìm thấy xe như BKS!!!");
        }
    }

    public static void confirmRemove(){
        System.out.println("Xóa phương tiện sau: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }
}
