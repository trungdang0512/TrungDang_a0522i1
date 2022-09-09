package ss09_DSA.bai_tap.BT_Them02.repository.impl;

import ss09_DSA.bai_tap.BT_Them02.models.HangSanXuat;
import ss09_DSA.bai_tap.BT_Them02.repository.IHangSxRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HangSxRepositoryImpl implements IHangSxRepository {
    private static HangSanXuat honda = new HangSanXuat(01,"Honda", "Japan");
    private static HangSanXuat yamaha = new HangSanXuat(02, "Yamaha", "Japan");
    private static HangSanXuat suzuki = new HangSanXuat(03, "Suzuki", "Japan");
    private static HangSanXuat huyndai = new HangSanXuat(04, "Huydai", "Korea");
    private static HangSanXuat ford = new HangSanXuat(05, "Ford", "US");


    private static List<HangSanXuat> hangSanXuatList = Arrays.asList(honda,yamaha,suzuki,huyndai,ford);


    @Override
    public List<HangSanXuat> displayAll() {
        return hangSanXuatList;
    }

    @Override
    public String chooseHangSX(int index) {
        return hangSanXuatList.get(index).getTenHangSX();
    }
}
