package exercise01.SS03_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BT_tim_phan_tu_lon_nhat_mang_2_Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập kích thước của ma trận !!!!");
        System.out.println("Nhập số dòng của ma trận: ");
        int ar = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int ac = scanner.nextInt();

        int[][] array = new int[ar][ac];

        for (int row=0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.println("Nhập phần tử hàng " +row+ " cột " + col);
                array[row][col] = scanner.nextInt();
            }
        }
        System.out.println("" + Arrays.deepToString(array));

        int maxNum = array[0][0];
        int indexC = 0;
        int indexR = 0;
        for (int r = 0; r < array.length;r++ ){
            for (int c = 0; c < array[r].length;  c++){
                if (array[r][c] > maxNum){
                    maxNum = array[r][c];
                    indexC = c;
                    indexR = r;
                }
            }
        }
        System.out.println("Phần tử lớn nhất: " + maxNum + " vị trí: [" + indexR +  "]" + "["+indexC+"]");
    }
}
