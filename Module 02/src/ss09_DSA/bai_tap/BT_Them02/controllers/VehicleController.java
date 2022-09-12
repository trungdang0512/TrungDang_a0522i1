package ss09_DSA.bai_tap.BT_Them02.controllers;


import java.util.Scanner;

public class VehicleController {
     private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");


            switch (scanner.nextInt()) {
                case 1:
                    AddNewVehicleController.addNewVehicle();
                    break;
                case 2:
                    DisplayVehicleController.displayVehicle();
                    break;
                case 3:
                    RemoveVehicleController.removeVehicle();
                    break;
                case 4:
                    FindVehicleController.findVehicle();
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }

}
