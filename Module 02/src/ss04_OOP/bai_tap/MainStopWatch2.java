package ss04_OOP.bai_tap;

import java.util.Scanner;

public class MainStopWatch2 {
    public static void main(String[] args) {
        StopWatch2 stopwatch = new StopWatch2();
        Scanner scanner = new Scanner(System.in);


        int choice = 10;
        while (choice != 0){
            System.out.println("Hello!!!!!");
            System.out.println("1. Enter number 1 to start StopWatch!!!!!!");
            System.out.println("2. Enter number 2 to stop StopWatch and show the Result !!!!!!");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    stopwatch.start();
                    break;
                case 2:
                    stopwatch.end();
                    System.out.println(""+ stopwatch.toString());
                    System.exit(2);
                    break;
                default:
                    System.out.println("Please read the construction clearly!!!!");
                    break;
            }
        }
    }
}
