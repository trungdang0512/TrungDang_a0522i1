package ss09_DSA.bai_tap.BT_Them02.services.impl;

import ss09_DSA.bai_tap.BT_Them02.models.HangSanXuat;
import ss09_DSA.bai_tap.BT_Them02.repository.impl.HangSxRepositoryImpl;
import ss09_DSA.bai_tap.BT_Them02.repository.IHangSxRepository;
import ss09_DSA.bai_tap.BT_Them02.services.IHangSxService;

import java.util.List;
import java.util.Scanner;

public class HangSxServiceImpl implements IHangSxService {
    private static Scanner scanner = new Scanner(System.in);
    private static IHangSxRepository iHangSxRepository= new HangSxRepositoryImpl();


    @Override
    public String chooseHangSX() {
        System.out.println("Chọn 1 trong các hãng sau: ");
        this.displayList();
        int index = Integer.parseInt(scanner.nextLine());
        return iHangSxRepository.chooseHangSX(index-1);
    }

    @Override
    public void displayList() {
        List<HangSanXuat> hangSanXuatList = iHangSxRepository.displayAll();
        for (HangSanXuat hangSanXuat: hangSanXuatList){
            System.out.println(hangSanXuat.toString());
        }
    }


}
