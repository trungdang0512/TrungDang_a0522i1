package ss09_DSA.bai_tap.BT_Them02.models;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    int soChoNgoi;
    String kieuXe;

    public Car() {
    }

    public Car(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public Car(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }



//    @Override
//    public int compareTo(Vehicle o) {
//        return Integer.parseInt(this.bienKiemSoat) - Integer.parseInt(o.bienKiemSoat);
//    }

    //    @Override
//    public void addNewVehicle() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập biển số: ");
//        String inputBienSo = scanner.nextLine();
//        System.out.println("Nhập năm sản xuất: ");
//        String inputNamSanXuat = scanner.nextLine();
//        System.out.println("Chọn hãng sản xuất trong list: ");
//        String inputHangSanXuat = ChoseHangSX.choseHangSXFromList();
//        System.out.println("Nhập tên chủ sở hữu: ");
//        String inputChuSoHuu = scanner.nextLine();
//        System.out.println("Kiểu xe (du lịch, xe khách)");
//        String inputKieuXe = scanner.nextLine();
//        System.out.println("Nhập số chỗ ngồi: ");
//        int inputSoChoNgoi = Integer.parseInt(scanner.nextLine());
//
//        Car car = new Car(inputBienSo,inputHangSanXuat,inputNamSanXuat,inputChuSoHuu,inputSoChoNgoi,inputKieuXe);
//        System.out.println(car.toString());
//        carList.add(car);
//    }
//
//    public void displayVehicleList(){
//        for (Car car: carList){
//            System.out.println(car);
//        }
//    }
//
//    @Override
//    public void deleteVehicle(String inputID) {
//        for (int i = 0; i < carList.size(); i++){
//            if (inputID.equals(carList.get(i).getBienKiemSoat())){
//                System.out.println("Xóa phương tiện sau: " + carList.get(i).toString());
//                System.out.println("1. Yes");
//                System.out.println("2. No");
//                Scanner scanner = new Scanner(System.in);
//
//                switch (scanner.nextInt()) {
//                    case 1: {
//                        carList.remove(i);
//                        System.out.println("Đã xóa thành công");
//                        break;
//                    }
//                    case 2: {
//                        VehicleController.displayMainMenu();
//                    }
//                }
//            }else {
//                System.out.println("Không có biển kiểm soát trong danh sách ô tô");
//            }
//        }
//    }
//
//    @Override
//    public void findVehicle(String inputID) {
//        boolean check = false;
//        for (int i = 0; i<carList.size(); i++){
//            boolean isFoundID = carList.get(i).getBienKiemSoat().contains(inputID);
//            if (isFoundID){
//                System.out.println(carList.get(i));
//                check = true;
//            }
//        }
//        if (check = false){
//            System.out.println("Không tìm thấy BKS trong danh sách ô tô");
//        }
//    }

}
