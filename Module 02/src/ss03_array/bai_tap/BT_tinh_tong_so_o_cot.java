package exercise01.SS03_Array.bai_tap;

import java.util.Scanner;

public class BT_tinh_tong_so_o_cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the row of matrix: ");
        int row = scanner.nextInt();
        System.out.println("Input the collum of matrix: ");
        int collum = scanner.nextInt();

        int[][] matrix = new int[row][collum];

        for (int i=0; i < matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.println("Input the number at position: "+ i+"/" +j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.printf("The matrix: ");
        for (int i =0; i< matrix.length;i++){
            for (int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println("\t");
        }

        System.out.printf("Enter the collum that you want to sum: ");
        int c = scanner.nextInt();
        int result = 0;

        for (int i=0; i < matrix.length;i++){
            for (int j =0; j < matrix[i].length; j++){
                if (j == c){
                    result += matrix[i][j];
                }
            }
        }

        System.out.printf("Sum of all number at collum " +c + " is: " + result);


    }
}
