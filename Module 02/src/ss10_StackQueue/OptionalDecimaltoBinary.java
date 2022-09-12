package ss10_StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class OptionalDecimaltoBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Decimal: ");
        int a = scanner.nextInt();
        int result;
        int binary = 1;

        Stack<Integer> stackBinary = new Stack();

        boolean checker = true;
        while (checker == true){
            result = a / 2;
//            System.out.println(result);

            binary = a % 2;
//            System.out.println(binary);
            stackBinary.push(binary);
            if (result == 0){
                checker = false;
            }
            a = result;

        }

        System.out.print("Binary result: ");
        int i = 0;
        int z = stackBinary.size();
        while (i < z){
            System.out.print(stackBinary.pop() + " ");;
            i++;
        }
    }
}
