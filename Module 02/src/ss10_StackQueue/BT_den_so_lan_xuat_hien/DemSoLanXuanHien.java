package ss10_StackQueue.BT_den_so_lan_xuat_hien;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuanHien {
    public static void main(String[] args) {

        Map <String, Integer> wordMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] array = inputString.split("");
        System.out.println(Arrays.toString(array));

        int i = 0;

        while (i < array.length){
            wordMap.put(array[i], 1 );
            i++;
        }

        System.out.println(wordMap);


        int k =0;
        while (k < array.length){
            int count = 0;
            int j = 0;
            while (j < array.length){
                if (array[k].equals(array[j])){
                    count++;
                }
                j++;
            }
            wordMap.put(array[k], count);
            k++;
        }
        System.out.println(wordMap);
    }
}
