package FinalExam.controller;

import FinalExam.service.IMobileService;
import FinalExam.service.MobileServiceImpl;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static IMobileService mobileService = new MobileServiceImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please choose the function: ");
            System.out.println("1. Add new phone");
            System.out.println("2. Remove phone");
            System.out.println("3. Display phone list");
            System.out.println("4. Search phone info");
            System.out.println("5. Exit");

            switch (scanner.nextInt()) {
                case 1:
                    mobileService.addMobile();
                    break;
                case 2:
                    mobileService.removeMobile();
                    break;
                case 3:
                    mobileService.displayList();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
