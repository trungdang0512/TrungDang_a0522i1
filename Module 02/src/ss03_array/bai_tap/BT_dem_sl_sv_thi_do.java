package exercise01.SS03_Array.bai_tap;

import java.util.Scanner;

public class BT_dem_sl_sv_thi_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] studentList;

        do {
            System.out.println("Enter the size of list: ");
            size = scanner.nextInt();
            if (size > 30){
                System.out.println("The list should not exceed 30!!!");
            }
        }while (size>30);

        studentList = new int[size];
        int i =0;
        while (i < studentList.length){
            System.out.println("Enter a mark of the student " + (i+1) + ": ");
            studentList[i] = scanner.nextInt();
            if (studentList[i] > 10){
                System.out.println("Invalid number, the mark from 0 to 10!!!");
                continue;
            }
            i++;
        }

        int count = 0;
        System.out.println("List of mark: ");
        for (int j=0; j< studentList.length;j++){
            System.out.println(studentList[j] + "");
            if (studentList[j] >= 5){
                count++;
            }
        }
        System.out.println("Number of Student passing the exam is: "+count);
    }
}
