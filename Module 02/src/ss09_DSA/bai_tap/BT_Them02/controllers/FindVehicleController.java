package ss09_DSA.bai_tap.BT_Them02.controllers;

import ss09_DSA.bai_tap.BT_Them02.services.ICarService;
import ss09_DSA.bai_tap.BT_Them02.services.IMotorBikeService;
import ss09_DSA.bai_tap.BT_Them02.services.ITruckService;
import ss09_DSA.bai_tap.BT_Them02.services.impl.CarServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.MotorBikeServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.TruckServiceImpl;

import java.util.Scanner;

public class FindVehicleController {

    private static Scanner scanner = new Scanner(System.in);
    private static ICarService carService = new CarServiceImpl();
    private static IMotorBikeService motorBikeService = new MotorBikeServiceImpl();
    private static ITruckService truckService = new TruckServiceImpl();

    public static void findVehicle(){
        System.out.println("Nhập BKS: ");
        String inputBKS = scanner.nextLine();
        boolean checkValid = false;
        if (motorBikeService.checkValidMotorBike(inputBKS)){
            System.out.println(motorBikeService.findMotorBike(inputBKS));
            checkValid = true;
        }
        if (carService.checkValidCar(inputBKS)){
            System.out.println(carService.findCar(inputBKS));
            checkValid = true;
        }
        if (truckService.checkValidTruck(inputBKS)){
            System.out.println(truckService.findTruck(inputBKS));
            checkValid = true;
        }
        if (checkValid = false){
            System.out.println("Không tìm thấy xe như BKS!!!");
        }
    }
}
