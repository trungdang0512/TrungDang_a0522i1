package ss09_DSA.bai_tap.BT_Them01.controllers;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Student Manager");
            System.out.println("2. Teacher Manager");
            System.out.println("3. Exit");

            switch (scanner.nextInt()) {
                case 1:
                    StudentController.studentMenu();
                    break;

                case 2:
                    TeacherController.teacherMenu();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
