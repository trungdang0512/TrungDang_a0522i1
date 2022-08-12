package exercise01.SS03_Array.bai_tap;

import java.util.Scanner;

public class BT_them_phan_tu {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,0,1,0,2,0};

        Scanner scanner =new Scanner(System.in);

        System.out.printf("Nhập số cần thêm: ");
        int inputNumber = scanner.nextInt();
        System.out.printf("Nhập vị trí trong mảng: ");
        int position = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
            if (i == position){
               for (int j = 1; j <= array.length - i - 1; j++){
                   int swap = array[array.length - j - 1];
                   array[array.length - j - 1] = array[array.length - j];
                   array[array.length - j ]= swap;
                }
               array[i] = inputNumber;
            }
        }

        for (int k= 0; k< array.length; k++){
            System.out.printf(array[k] + " ");
        }


    }
}
