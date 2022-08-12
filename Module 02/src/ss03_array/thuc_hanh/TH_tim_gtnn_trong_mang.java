package exercise01.SS03_Array.thuc_hanh;

public class TH_tim_gtnn_trong_mang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minNum(arr);
        System.out.println("GTNN trong mảng: " + arr[index]);
    }

    public static int minNum(int[] array) {
        int index = 0;
        for ( int i =0; i< array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
