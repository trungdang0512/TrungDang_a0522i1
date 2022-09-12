package ss09_DSA.bai_tap.BT_Them02.services.impl;

import ss09_DSA.bai_tap.BT_Them02.models.Motorbike;
import ss09_DSA.bai_tap.BT_Them02.repository.IMotorBikeRepository;
import ss09_DSA.bai_tap.BT_Them02.repository.impl.MotorBikeRepositoryImpl;
import ss09_DSA.bai_tap.BT_Them02.services.IHangSxService;
import ss09_DSA.bai_tap.BT_Them02.services.IMotorBikeService;

import java.util.List;
import java.util.Scanner;


public class MotorBikeServiceImpl implements IMotorBikeService {
    private static Scanner scanner = new Scanner(System.in);
    private static IMotorBikeRepository motorBikeRepository = new MotorBikeRepositoryImpl();
    private static IHangSxService hangSxService = new HangSxServiceImpl();


    @Override
    public void addNewMotorBike() {
        motorBikeRepository.addNewMotorBike(this.inputMotorBikeInfo());
    }

    @Override
    public void displayMotorBikeList() {
        List<Motorbike> motorbikeList = motorBikeRepository.findAll();
        for (Motorbike motorbike: motorbikeList){
            System.out.println(motorbike.toString());
        }
    }

    @Override
    public void removeMotorBike(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        if (this.checkValidMotorBike(indexBKS)) {
            int index = motorBikeRepository.getIndexMotorBike(fullBKS);
            if (index != -1) {
                motorBikeRepository.removeMotorBike(index);
                System.out.println("Remove successfully!!");
            }
        }
    }

    @Override
    public String findMotorBike(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        String result = "none";
        if (this.checkValidMotorBike(indexBKS)) {
            int index = motorBikeRepository.getIndexMotorBike(fullBKS);
            if (index != -1) {
                result = motorBikeRepository.findMotoBike(fullBKS);
            }
        }
        return result;
    }

    @Override
    public boolean checkValidMotorBike(String indexBKS) {
        String fullBKS = this.findBKS(indexBKS);
        return motorBikeRepository.checkValidMotorBike(fullBKS);
    }

    @Override
    public Motorbike inputMotorBikeInfo() {
        System.out.println("Nhập biển số: ");
        String inputBienSo = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        String inputNamSanXuat = scanner.nextLine();
        System.out.println("Chọn hãng sản xuất trong list: ");
        String inputHangSanXuat = hangSxService.chooseHangSX();
        System.out.println("Nhập tên chủ sở hữu: ");
        String inputChuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất: ");
        String inputCongSuat = scanner.nextLine();

        Motorbike motorbike = new Motorbike(inputBienSo,inputHangSanXuat,inputNamSanXuat,inputChuSoHuu,inputCongSuat);
        return motorbike;
    }

    @Override
    public String findBKS(String inputBKS) {
        List<Motorbike> motorbikeList = motorBikeRepository.findAll();
        String foundBKS = null;
        for (int i = 0; i< motorbikeList.size(); i++){
            boolean isFoundID = motorbikeList.get(i).getBienKiemSoat().contains(inputBKS);
            if (isFoundID){
                foundBKS = motorbikeList.get(i).getBienKiemSoat();
            }
        }
        return foundBKS;
    }
}
