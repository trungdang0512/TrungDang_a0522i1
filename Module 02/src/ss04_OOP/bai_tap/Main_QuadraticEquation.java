package ss04_OOP.bai_tap;

import java.util.Scanner;

public class Main_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c: ");
        double c = scanner.nextDouble();

        QuadraticEquation2 quadratic = new QuadraticEquation2(a,b,c);
        System.out.println("Delta: " + quadratic.getDiscriminant());
        if (quadratic.getDiscriminant() > 0){
            System.out.println("Phương trình 2 nghiệm!!");
            System.out.println("Nghiệm thứ 1: " + quadratic.getRoot1());
            System.out.println("Nghiệm thứ 2: " + quadratic.getRoot2());
        }else if (quadratic.getDiscriminant() == 0){
            System.out.println("Phương trình 2 nghiệm kép!!");
            System.out.println("Nghiệm kép: " + quadratic.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm!!!!");
        }

    }
}
