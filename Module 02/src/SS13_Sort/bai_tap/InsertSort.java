package SS13_Sort.bai_tap;

public class InsertSort {
    static int[] list = {2,14,1,8,44,21,10,35,7};

    public static void insertSort(int[] list){
        int pos;
        int x;
        for (int i =0; i < list.length; i++){
            x = list[i];
            pos = i;
            while (pos >0 && x < list[pos-1]){
                System.out.println("Đưa: " +list[pos-1] +" vào vị trí:" + pos);
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Đưa " + list[pos] + " vào vị trí " + pos);
        }
    }

    public static void main(String[] args) {
        System.out.println("Get go!!");
        insertSort(list);
        for (int i = 0; i< list.length;i++){
            System.out.println(list[i]);
        }
    }
}
