package ss09_DSA.bai_tap.BT_Them02.controllers;

import ss09_DSA.bai_tap.BT_Them02.models.Car;
import ss09_DSA.bai_tap.BT_Them02.models.Motorbike;
import ss09_DSA.bai_tap.BT_Them02.models.Truck;

import java.util.Scanner;

public class VehicleController {
    static Car car = new Car();
    static Truck truck = new Truck();
    static Motorbike motorbike = new Motorbike();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:{
                    addNewVehicle();
                    break;
                }
                case 2:{
                    displayVehicleList();
                    break;
                }
                case 3:{
                    deleteVehicle();
                    break;
                }
                case 4:{
                    findVehicle();
                    break;
                }
                case 5:{
                    System.exit(0);
                }
            }
        }
    }

    public static void addNewVehicle() {
        boolean check = true;
        while (check) {
            System.out.println("Chọn phương tiện muốn thêm: ");
            System.out.println("1. Thêm mới xe máy");
            System.out.println("2. Thêm mới ô tô");
            System.out.println("3. Thêm mới xe tải");
            System.out.println("4. Main Menu");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:{
                    motorbike.addNewVehicle();
                    break;
                }
                case 2:{
                    car.addNewVehicle();
                    break;
                }
                case 3:{
                    truck.addNewVehicle();
                    break;
                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }

    public static void displayVehicleList(){
        boolean check = true;
        while (check) {
            System.out.println("Chọn phương tiện muốn hiển thị: ");
            System.out.println("1. Hiển thị xe máy");
            System.out.println("2. Hiển thị ô tô");
            System.out.println("3. Hiển thị xe tải");
            System.out.println("4. Main Menu");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:{
                    motorbike.displayVehicleList();
                    break;
                }
                case 2:{
                    car.displayVehicleList();
                    break;
                }
                case 3:{
                    truck.displayVehicleList();
                    break;
                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }

    public static void deleteVehicle(){
        System.out.println("Nhập biển kiểm soát xe cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String inputBKS = scanner.nextLine();
        car.deleteVehicle(inputBKS);
        truck.deleteVehicle(inputBKS);
        motorbike.deleteVehicle(inputBKS);
    }

    public static void findVehicle(){
        System.out.println("Nhập biển kiểm soát cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        String inputBKS = scanner.nextLine();
        car.findVehicle(inputBKS);
        truck.findVehicle(inputBKS);
        motorbike.findVehicle(inputBKS);
    }
}
