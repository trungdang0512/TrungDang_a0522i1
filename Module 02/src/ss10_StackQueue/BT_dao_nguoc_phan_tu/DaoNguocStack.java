package ss10_StackQueue.BT_dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start: ");
        String inputWord = scanner.nextLine();
        String [] array = inputWord.split("");

        Stack<String> stack = new Stack();

        int i = 0;
        while (i < array.length) {
            stack.push(array[i]);
            i++;
        }

        System.out.println(stack);

        String [] newarray = new String[stack.size()];

        int j = 0;
        while (j < newarray.length){
            newarray[j] = stack.pop();
            j++;
        }

//        int k = 0;
//        while (k < newarray.length){
//            stack.push(newarray[k]);
//            k++;
//        }

        System.out.println(Arrays.toString(newarray));

    }
}
