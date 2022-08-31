package ss09_DSA.bai_tap.BT_Them02.services;

import ss09_DSA.bai_tap.BT_Them02.models.HangSanXuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChoseHangSX {
    static HangSanXuat honda = new HangSanXuat(01,"Honda", "Japan");
    static HangSanXuat yamaha = new HangSanXuat(02, "Yamaha", "Japan");
    static HangSanXuat suzuki = new HangSanXuat(03, "Suzuki", "Japan");
    static HangSanXuat huyndai = new HangSanXuat(04, "Huydai", "Korea");
    static HangSanXuat ford = new HangSanXuat(05, "Ford", "US");


    public static String choseHangSXFromList(){
        List<HangSanXuat> list = Arrays.asList(honda,yamaha,suzuki,huyndai,ford);
        String result = "null";
        Scanner scanner = new Scanner(System.in);

            System.out.println("Chọn hãng sản xuất trong list sau: ");
            for (int i=0;i<list.size();i++) {
                System.out.println(list.get(i).toString());
            }
            switch (scanner.nextInt()){
                case 1: {
                    result = list.get(0).getTenHangSX();
                    break;
                }
                case 2:{
                    result = list.get(1).getTenHangSX();
                    break;
                }
                case 3:{
                    result = list.get(2).getTenHangSX();
                    break;
                }
                case 4:{
                    result = list.get(3).getTenHangSX();
                    break;
                }
                case 5:{
                    result = list.get(4).getTenHangSX();
                    break;
                }
            }
        return result;
    }
}
