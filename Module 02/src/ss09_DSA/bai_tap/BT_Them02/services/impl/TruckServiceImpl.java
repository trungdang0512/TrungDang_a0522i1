package ss09_DSA.bai_tap.BT_Them02.services.impl;

import ss09_DSA.bai_tap.BT_Them02.models.Motorbike;
import ss09_DSA.bai_tap.BT_Them02.models.Truck;
import ss09_DSA.bai_tap.BT_Them02.repository.ITruckRepository;
import ss09_DSA.bai_tap.BT_Them02.repository.impl.TruckRepositoryImpl;
import ss09_DSA.bai_tap.BT_Them02.services.IHangSxService;
import ss09_DSA.bai_tap.BT_Them02.services.ITruckService;

import java.util.List;
import java.util.Scanner;

public class TruckServiceImpl implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static ITruckRepository truckRepository = new TruckRepositoryImpl();
    private static IHangSxService hangSxService = new HangSxServiceImpl();


    @Override
    public void addNewTruck() {
        truckRepository.addNewTruck(this.getTruckInfo());
    }

    @Override
    public void displayTruckList() {
        List<Truck> truckList = truckRepository.findAll();
        for (Truck truck: truckList){
            System.out.println(truck.toString());
        }
    }

    @Override
    public void removeTruck(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        if (this.checkValidTruck(indexBKS)) {
            int index = truckRepository.getIndexTruck(fullBKS);
            if (index != -1) {
                truckRepository.removeTruck(index);
                System.out.println("Remove successfully!!");
            }
        }
    }

    @Override
    public String findTruck(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        String result = "none";
        if (this.checkValidTruck(indexBKS)) {
            int index = truckRepository.getIndexTruck(fullBKS);
            if (index != -1) {
                result = truckRepository.findTruck(fullBKS);
            }
        }
        return result;
    }

    @Override
    public boolean checkValidTruck(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        return truckRepository.checkValidTruck(fullBKS);
    }

    @Override
    public Truck getTruckInfo() {

        System.out.println("Nhập biển số: ");
        String inputBienSo = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        String inputNamSanXuat = scanner.nextLine();
        System.out.println("Chọn hãng sản xuất trong list: ");
        String inputHangSanXuat = ChoseHangSX.choseHangSXFromList();
        System.out.println("Nhập tên chủ sở hữu: ");
        String inputChuSoHuu = scanner.nextLine();
        System.out.println("Nhập trọng tải: ");
        String inputTrongTai = scanner.nextLine();

        Truck truck = new Truck(inputBienSo,inputHangSanXuat,inputNamSanXuat,inputChuSoHuu,inputTrongTai);
        return truck;
    }

    @Override
    public String findBKS(String inputBKS) {
        List<Truck> truckList = truckRepository.findAll();
        String foundBKS = null;
        for (int i = 0; i< truckList.size(); i++){
            boolean isFoundID = truckList.get(i).getBienKiemSoat().contains(inputBKS);
            if (isFoundID){
                foundBKS = truckList.get(i).getBienKiemSoat();
            }
        }
        return foundBKS;
    }
}
