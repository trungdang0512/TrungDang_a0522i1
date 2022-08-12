package exercise01.SS03_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BT_dem_chuoi {
    public static void main(String[] args) {
        String demo = "saddssvadbgrtytmhmhncfgdf";

        int count = 0;
        int length = demo.length();

        char[] convert = demo.toCharArray();
        System.out.println("Array: "+ Arrays.toString(convert));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word you want to count: ");
        char finder = scanner.next().charAt(0);

        for ( int i=0; i<convert.length; i++){
            if (finder == convert[i]){
                count++;
            }
        }

        System.out.println("Số ký tự " +finder+" ở trong chuỗi là: " + count);
    }
}
