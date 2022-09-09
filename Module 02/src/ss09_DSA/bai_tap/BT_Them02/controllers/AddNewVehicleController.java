package ss09_DSA.bai_tap.BT_Them02.controllers;

import ss09_DSA.bai_tap.BT_Them02.models.Car;
import ss09_DSA.bai_tap.BT_Them02.services.*;

import java.util.Scanner;

public class AddNewVehicleController {

    private static Scanner scanner = new Scanner(System.in);
    private static ICarService carService = new CarServiceImpl();
    private static IHangSxService hangSxService = new HangSxServiceImpl();

    public static void addNewVehicle() {
        while (true) {
            System.out.println("Chọn phương tiện muốn thêm: ");
            System.out.println("1. Thêm mới xe máy");
            System.out.println("2. Thêm mới ô tô");
            System.out.println("3. Thêm mới xe tải");
            System.out.println("4. Main Menu");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Nhập biển số: ");
                    String inputBienSo = scanner.nextLine();
                    scanner.nextLine();
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
                    carService.addNewCar(car);
                    break;
                case 2:
                case 3:
                case 4:
                    return;
            }
        }
    }
}
