package ss09_DSA.bai_tap.BT_Them01.controllers;

import ss09_DSA.bai_tap.BT_Them01.services.TeacherService;
import ss09_DSA.bai_tap.BT_Them01.services.TeacherServiceImpl;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static TeacherService teacherService = new TeacherServiceImpl();

    public static void teacherMenu() {
        while (true) {
            System.out.println("Teacher Manager: ");
            System.out.println("1. Add new Teacher Info: ");
            System.out.println("2. Display teacher list: ");
            System.out.println("3. Search teacher info: ");
            System.out.println("4. Delete teacher info: ");
            System.out.println("5. Back to Main menu");
            int  choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    teacherService.addTeacher();
                    break;
                case 2:
                    teacherService.displayTeacherList();
                    break;
                case 3:
                    teacherService.searchTeacherInfo();
                    break;
                case 4:
                    teacherService.deleteTeacherInfo();
                    break;
                case 5:
                    return;
            }
        }
    }
}
