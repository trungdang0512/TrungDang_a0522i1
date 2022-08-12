package exercise01.SS03_Array.bai_tap;

import java.util.Scanner;

public class BT_tong_duong_cheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and collum of matrix: ");
        int row = scanner.nextInt();
        int collum = row;

        int[][] matrix = new int[row][collum];

        for (int i =0; i< matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                System.out.println("Input the number at position: "+ i+"/" +j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.printf("The matrix: ");
        System.out.println("\t");
        for (int i =0; i< matrix.length;i++){
            for (int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println("\t");
        }

        int sum = 0;
        for (int i=0; i< matrix.length; i++){
            sum += matrix[i][i];
        }

        System.out.println("Result: " + sum);

    }
}
