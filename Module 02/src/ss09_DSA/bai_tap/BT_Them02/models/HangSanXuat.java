package ss09_DSA.bai_tap.BT_Them02.models;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuat {
    int maHangSX;
    String tenHangSX;
    String quocGia;

    public HangSanXuat(int maHangSX, String tenHangSX, String quocGia) {
        this.maHangSX = maHangSX;
        this.tenHangSX = tenHangSX;
        this.quocGia = quocGia;
    }

    public int getMaHangSX() {
        return maHangSX;
    }

    public void setMaHangSX(int maHangSX) {
        this.maHangSX = maHangSX;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maHangSX=" + maHangSX +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }

//    public static List<HangSanXuat> getHangSanXuat(){
//        HangSanXuat honda = new HangSanXuat(01,"Honda", "Japan");
//        HangSanXuat yamaha = new HangSanXuat(02, "Yamaha", "Japan");
//        HangSanXuat suzuki = new HangSanXuat(03, "Suzuki", "Japan");
//        HangSanXuat huyndai = new HangSanXuat(04, "Huydai", "Korea");
//        HangSanXuat ford = new HangSanXuat(05, "Ford", "US");
//
//        List<HangSanXuat> hangSanXuatList = new ArrayList<>();
//
//        hangSanXuatList.add(honda);
//        hangSanXuatList.add(yamaha);
//        hangSanXuatList.add(suzuki);
//        hangSanXuatList.add(huyndai);
//        hangSanXuatList.add(ford);
//
//        return hangSanXuatList;
//    }
}
