package ss09_DSA.bai_tap.BT_Them02.models;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Vehicle{
    String trongTai;

    public Truck() {
    }

    public Truck(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public Truck(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public List<Truck> truckList = new ArrayList<>();

    @Override
    public String toString() {
        return "Truck{" +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                "trongTai='" + trongTai + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Vehicle o) {
//        return Integer.parseInt(this.bienKiemSoat) - Integer.parseInt(o.bienKiemSoat);
//    }

//    @Override
//    public void addNewVehicle(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập biển số: ");
//        String inputBienSo = scanner.nextLine();
//        System.out.println("Nhập năm sản xuất: ");
//        String inputNamSanXuat = scanner.nextLine();
//        System.out.println("Chọn hãng sản xuất trong list: ");
//        String inputHangSanXuat = ChoseHangSX.choseHangSXFromList();
//        System.out.println("Nhập tên chủ sở hữu: ");
//        String inputChuSoHuu = scanner.nextLine();
//        System.out.println("Nhập trọng tải: ");
//        String inputTrongTai = scanner.nextLine();
//
//        Truck truck = new Truck(inputBienSo,inputHangSanXuat,inputNamSanXuat,inputChuSoHuu,inputTrongTai);
//        System.out.println(truck.toString());
//        truckList.add(truck);
//    }
//
//    public void displayVehicleList(){
//        for (Truck truck: truckList){
//            System.out.println(truck);
//        }
//    }
//
//    @Override
//    public void deleteVehicle(String inputID) {
//        for (int i = 0; i < truckList.size(); i++){
//            if (inputID.equals(truckList.get(i).getBienKiemSoat())){
//                System.out.println("Xóa phương tiện sau: " + truckList.get(i).toString());
//                System.out.println("1. Yes");
//                System.out.println("2. No");
//                Scanner scanner = new Scanner(System.in);
//
//                switch (scanner.nextInt()) {
//                    case 1: {
//                        truckList.remove(i);
//                        System.out.println("Đã xóa thành công");
//                        break;
//                    }
//                    case 2: {
//                        VehicleController.displayMainMenu();
//                    }
//                }
//            }else {
//                System.out.println("Không có biển kiểm soát trong danh sách xe tải");
//            }
//        }
//    }
//
//    public void findVehicle(String inputID) {
//        boolean check = false;
//        for (int i = 0; i<truckList.size(); i++){
//            boolean isFoundID = truckList.get(i).getBienKiemSoat().contains(inputID);
//            if (isFoundID){
//                System.out.println(truckList.get(i));
//                check = true;
//            }
//        }
//        if (check = false){
//            System.out.println("Không tìm thấy BKS trong danh sách xe tải");
//        }
//    }
}
