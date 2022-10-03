package ss17_StringRegex.bai_tap;

import java.util.Scanner;

public class ClassNameTest {
    private static ClassNameRegex classNameRegex;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        classNameRegex = new ClassNameRegex();
        boolean checkName = false;
        while (!checkName) {
            System.out.println("Input class name: ");
            String className = scanner.nextLine();
            checkName = classNameRegex.validate(className);
            System.out.println(checkName);
        }
    }
}
