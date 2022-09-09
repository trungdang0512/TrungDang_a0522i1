package ss08_mvc.controller;

import ss08_mvc.model.Student;
import ss08_mvc.service.StudentService;
import ss08_mvc.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {

    private static StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("---- Student Manager ----");
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("9. Exit");

            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1: //List
                    Student[] studentList = studentService.findAll();
                    for(Student student: studentList){
                        System.out.println(student);
                    }
                    break;
                case 2: //add
                    System.out.print("Input Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Name: ");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);

                    studentService.addStudent(student);
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
