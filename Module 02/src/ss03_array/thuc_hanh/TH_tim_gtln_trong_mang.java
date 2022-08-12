package exercise01.SS03_Array.thuc_hanh;

import java.util.Scanner;

public class TH_tim_gtln_trong_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.printf("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.println("Enter Element " + (i+1) + ": ");
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j]+ "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j <array.length; j++){
            if (array[j] > max){
                max = array[j];
                index= j+1;
            }
        }
        System.out.println("GTLN: "+ max+" ,vị trí: "+index);
    }
}
