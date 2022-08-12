package exercise01.SS03_Array.bai_tap;

import java.util.Scanner;

public class BT_xoa_phan_tu {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0};
        Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập phần tử cần xóa: ");
            int x = scanner.nextInt();
            int indexDel = 0;
        int change = 0;

            for (int i = 0; i < array.length; i++) {
                if ( array[i] == x) {
                    System.out.println("Phần tử " + x + " nằm ở vị trí " + (i + 1));

                    for (int j = i+1; j < array.length; j++){
                        change = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = change;
                    }
                    array[array.length - 1] = 0;
                    break;
                }
            }


        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
