package SS13_Sort.bai_tap;

import java.util.Scanner;

public class InsertSort2 {

    public static void insertSort(int[] list){
        int pos;
        int x;
        for (int i =0; i< list.length;i++){
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input lenght of array: ");
        int num = scanner.nextInt();
        int[] list = new int[num-1];

        for (int i = 0; i < list.length; i++){
            System.out.println("Input number at " + i + " position");
            list[i] = scanner.nextInt();
        }

        System.out.print("Array: ");
        for (int i =0;i< list.length;i++){
            System.out.print(list[i] + " ");
        }

        insertSort(list);
        System.out.print("\nSorted Array: ");
        for (int i=0; i< list.length;i++){
            System.out.print(list[i] + " ");
        }

    }
}
