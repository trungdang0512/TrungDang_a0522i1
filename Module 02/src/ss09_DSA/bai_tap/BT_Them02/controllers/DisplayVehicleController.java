package ss09_DSA.bai_tap.BT_Them02.controllers;

import ss09_DSA.bai_tap.BT_Them02.services.ICarService;
import ss09_DSA.bai_tap.BT_Them02.services.IMotorBikeService;
import ss09_DSA.bai_tap.BT_Them02.services.ITruckService;
import ss09_DSA.bai_tap.BT_Them02.services.impl.CarServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.MotorBikeServiceImpl;
import ss09_DSA.bai_tap.BT_Them02.services.impl.TruckServiceImpl;

import java.util.Scanner;

public class DisplayVehicleController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService carService = new CarServiceImpl();
    private static IMotorBikeService motorBikeService = new MotorBikeServiceImpl();
    private static ITruckService truckService = new TruckServiceImpl();

    public static void displayVehicle(){
        while(true) {
            System.out.println("Chọn phương tiện muốn hiển thị: ");
            System.out.println("1. Hiển thị xe máy");
            System.out.println("2. Hiển thị ô tô");
            System.out.println("3. Hiển thị xe tải");
            System.out.println("4. Main Menu");

            switch (scanner.nextInt()) {
                case 1:
                    motorBikeService.displayMotorBikeList();
                    break;
                case 2:
                    carService.displayCarList();
                    break;
                case 3:
                    truckService.displayTruckList();
                    break;
                case 4:
                    return;
            }
        }
    }
}
