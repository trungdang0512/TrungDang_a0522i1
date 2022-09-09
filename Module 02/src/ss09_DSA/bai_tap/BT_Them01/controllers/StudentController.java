package ss09_DSA.bai_tap.BT_Them01.controllers;

import ss09_DSA.bai_tap.BT_Them01.services.StudentService;
import ss09_DSA.bai_tap.BT_Them01.services.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {

    private static StudentService studentService = new StudentServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void studentMenu() {
        while (true) {
            System.out.println("Student Manager: ");
            System.out.println("1. Add new Student Info: ");
            System.out.println("2. Display student list: ");
            System.out.println("3. Search student info: ");
            System.out.println("4. Delete student info: ");
            System.out.println("5. Back to Main menu");
            int  choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.displayStudentList();
                    break;
                case 3:
                    studentService.searchStudentInfo();
                    break;
                case 4:
                    studentService.deleteStudentInfo();
                    break;
                case 5:
                    return;
            }
        }
    }
}
