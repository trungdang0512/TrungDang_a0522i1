package exercise01.SS10_StackQueue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class OptionalCheckSymbol {
    private static boolean check(String s){
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char charCheck = s.charAt(i);
            if (charCheck == '('){
                bStack.push(charCheck);
            } else if (charCheck == ')'){
                if (bStack.isEmpty()){
                    return false;
                } else if (bStack.pop() != '('){
                    return false;
                }
            }

        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String need check: ");
        String checkString = scanner.nextLine();

        System.out.println(check(checkString));

    }
}
