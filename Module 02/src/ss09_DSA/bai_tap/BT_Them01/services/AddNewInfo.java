package ss09_DSA.bai_tap.BT_Them01.services;

import ss09_DSA.bai_tap.BT_Them01.models.Person;
import ss09_DSA.bai_tap.BT_Them01.models.Student;
import ss09_DSA.bai_tap.BT_Them01.models.Teacher;

import java.util.Scanner;

public class AddNewInfo {
    public static Student addNewStudentInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Student ID: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Input Student date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input Student Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Input Student Class: ");
        String studentClass = scanner.nextLine();
        System.out.println("Input Student Point: ");
        int point = Integer.parseInt(scanner.nextLine());

        Student student = new Student(inputID, name, dateOfBirth, gender, studentClass, point);
        return student;
    }

    public static Teacher addNewTeacherInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Teacher ID: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Teacher Name: ");
        String name = scanner.nextLine();
        System.out.println("Input Teacher date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input Teacher Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Input Teacher Speciality: ");
        String speciality = scanner.nextLine();

        Teacher teacher = new Teacher(inputID,name,dateOfBirth,gender,speciality);

        return teacher;
    }
}
