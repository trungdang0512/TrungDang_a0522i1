package exercise01.SS03_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BT_gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2;
        int array1[];
        int array2[];
        int array3[];

        do {
            System.out.println("Nhập kích thước mảng 1:");
            size1 = scanner.nextInt();
            if (size1 >5){
                System.out.println("Kích thước nên nhỏ hơn 5!!!");
            }
        }while (size1 >5);

        do {
            System.out.println("Nhập kích thước mảng 2: ");
            size2 = scanner.nextInt();
            if (size2 != size1){
                System.out.println("Nhập kích thước mảng 2 bằng mảng 1!!");
            }
        }while (size1 != size2);

        array1 = new int[size1];
        array2 = new int[size2];
        int i = 0;
        int j = 0;

        while (i < array1.length){
            System.out.println("Nhập phần tử thứ " + (i+1)+ " của mảng 1 :");
            array1[i] = scanner.nextInt();
            i++;
        }
        while (j < array2.length){
            System.out.println("Nhập phần tử thứ " + (j+1)+ " của mảng 2 :");
            array2[j] = scanner.nextInt();
            j++;
        }

        System.out.println("Mảng 1: " + Arrays.toString(array1));
        System.out.println("Mảng 2: " + Arrays.toString(array2));

        int size3 = size1 + size2;
        array3 = new int[size3];

        for ( i = 0; i < array1.length; i ++){
            array3[i] = array1[i];
        }
        for ( i = 0; i < array2.length; i++){
            array3[array2.length + i ] = array2[i];
        }
        System.out.println("Mảng 3: " + Arrays.toString(array3));
    }
}
