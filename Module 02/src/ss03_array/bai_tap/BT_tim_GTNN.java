package exercise01.SS03_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BT_tim_GTNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.println("Nhập số phần tử trong mảng từ 5-20 phần tử!!!");
            size = scanner.nextInt();
            if (size < 5){
                System.out.println("Số phần tử phải nhiều hơn 5!!!");
            }
            if (size > 20){
                System.out.println("Số phần tử phải ít hơn 20!!");
            }
        }while (size > 20 || size < 5);

        array = new int[size];
        int i=0;
        while (i < array.length){
            System.out.println("Nhập phần tử thứ: " + (i+1)+ ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println(Arrays.toString(array));
        int minNum = array[0];
        int index = 1;
        for (int j =0; j < array.length; j++){
            if (array[j] < minNum){
                minNum = array[j];
                index = j +1;
            }
        }
        System.out.println("Phần tử nhỏ nhất: " + minNum + ", nằm ở vị trí: "+index);
    }
}
