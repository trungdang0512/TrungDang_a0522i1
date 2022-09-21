package ss14_ExceptionDebug.bai_tap;

import java.util.Scanner;

public class TriangleCheck {

    public static void inputTriangle() throws TriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();
        System.out.println("Input c:");
        int c = scanner.nextInt();

        if (a+b <= c || b+c <= a || c+a <= b){
            throw new TriangleException("Invalid Triangle!!!");
        }else {
            System.out.println("Valid Triangle <3");
        }
    }

    public static void main(String[] args) {
        try {
            inputTriangle();
        }catch (TriangleException e){
            System.err.println(e.getMessage());
        }
    }
}
