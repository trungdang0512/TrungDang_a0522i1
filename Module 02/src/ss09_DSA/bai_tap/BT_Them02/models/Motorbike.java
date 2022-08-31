package ss09_DSA.bai_tap.BT_Them02.models;

import ss09_DSA.bai_tap.BT_Them02.controllers.VehicleController;
import ss09_DSA.bai_tap.BT_Them02.services.ChoseHangSX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motorbike extends Vehicle{
    String congSuat;

    public Motorbike() {
    }

    public Motorbike(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public List<Motorbike> motorbikeList = new ArrayList<>();

    @Override
    public String toString() {
        return "Motorbike{" +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                "congSuat='" + congSuat + '\'' +
                '}';
    }

    @Override
    public void addNewVehicle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số: ");
        String inputBienSo = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        String inputNamSanXuat = scanner.nextLine();
        System.out.println("Chọn hãng sản xuất trong list: ");
        String inputHangSanXuat = ChoseHangSX.choseHangSXFromList();
        System.out.println("Nhập tên chủ sở hữu: ");
        String inputChuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất: ");
        String inputCongSuat = scanner.nextLine();


        Motorbike motorbike = new Motorbike(inputBienSo,inputHangSanXuat,inputNamSanXuat,inputChuSoHuu,inputCongSuat);
        System.out.println(motorbike.toString());
        motorbikeList.add(motorbike);
    }

    public void displayVehicleList(){
        for (Motorbike motorbike: motorbikeList){
            System.out.println(motorbike);
        }
    }

    @Override
    public void deleteVehicle(String inputID) {
        for (int i = 0; i < motorbikeList.size(); i++){
            if (inputID.equals(motorbikeList.get(i).getBienKiemSoat())){
                System.out.println("Xóa phương tiện sau: " + motorbikeList.get(i).toString());
                System.out.println("1. Yes");
                System.out.println("2. No");
                Scanner scanner = new Scanner(System.in);

                switch (scanner.nextInt()) {
                    case 1: {
                        motorbikeList.remove(i);
                        System.out.println("Đã xóa thành công");
                        break;
                    }
                    case 2: {
                        VehicleController.displayMainMenu();
                    }
                }
            }else {
                System.out.println("Không có biển kiểm soát trong danh sách xe máy");
            }
        }
    }

    public void findVehicle(String inputID) {
        boolean check = false;
        for (int i = 0; i<motorbikeList.size(); i++){
            boolean isFoundID = motorbikeList.get(i).getBienKiemSoat().contains(inputID);
            if (isFoundID){
                System.out.println(motorbikeList.get(i));
                check = true;
            }
        }
        if (check = false){
            System.out.println("Không tìm thấy BKS trong danh sách xe máy");
        }
    }
}
