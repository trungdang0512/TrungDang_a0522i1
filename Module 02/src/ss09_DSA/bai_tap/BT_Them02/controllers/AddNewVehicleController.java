package ss09_DSA.bai_tap.BT_Them02.controllers;


import ss09_DSA.bai_tap.BT_Them02.services.*;
import ss09_DSA.bai_tap.BT_Them02.services.impl.CarServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.HangSxServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.MotorBikeServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.TruckServiceImpl;

import java.util.Scanner;

public class AddNewVehicleController {

    private static Scanner scanner = new Scanner(System.in);
    private static ICarService carService = new CarServiceImpl();
    private static IMotorBikeService motorBikeService = new MotorBikeServiceImpl();
    private static ITruckService truckService = new TruckServiceImpl();

    public static void addNewVehicle() {
        while (true) {
            System.out.println("Chọn phương tiện muốn thêm: ");
            System.out.println("1. Thêm mới xe máy");
            System.out.println("2. Thêm mới ô tô");
            System.out.println("3. Thêm mới xe tải");
            System.out.println("4. Main Menu");

            switch (scanner.nextInt()) {
                case 1:
                    motorBikeService.addNewMotorBike();
                    break;
                case 2:
                    carService.addNewCar();
                    break;
                case 3:
                    truckService.addNewTruck();
                    break;
                case 4:
                    return;
            }
        }
    }
}
