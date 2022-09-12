package ss10_StackQueue;

import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string to check: ");
        String inputString = scanner.nextLine();
        String covertedString = inputString.toLowerCase();

        String[] stringArray = covertedString.split("");
        System.out.println(Arrays.toString(stringArray));


        Queue<String> queueString = new LinkedList<>();
        Stack<String> stackString = new Stack<>();

        int i = 0;
        while (i < stringArray.length){
            queueString.add(stringArray[i]);
            stackString.push(stringArray[i]);
            i++;
        }

        int k = 0;
        boolean check = true;
        while (stringArray.length > k){
            String elementQueue = queueString.remove();
            String elementStack = stackString.pop();

            if (!elementQueue.equals(elementStack)){
                check = false;
                break;
            }
            k++;
        }

        if (!check){
            System.err.println("The input String is not a Palindrome !!!");
        }else {
            System.out.println("The input String is a Palindrome !!!");
        }

    }

}
