package ss09_DSA.bai_tap.BT_Them01.services;

import ss09_DSA.bai_tap.BT_Them01.models.Student;
import ss09_DSA.bai_tap.BT_Them01.repository.StudentRepository;
import ss09_DSA.bai_tap.BT_Them01.repository.StudentRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{
    private static Scanner scanner = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepositoryImpl();


    @Override
    public void addStudent() {
        Student newStudentInfo = this.studentInfo();
        studentRepository.addStudent(newStudentInfo);
    }

    @Override
    public void displayStudentList(){
        List<Student> studentList = studentRepository.displayAll();
        for (Student student: studentList){
            System.out.println(student.toString());
        }
    }

    @Override
    public int searchStudentInfo() {
        List<Student> studentList = studentRepository.displayAll();
        Student studentFind = null;
        int indexFindInList = -1;
        System.out.println("Input Student ID to find: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<studentList.size(); i++){
            if (studentList.get(i).getId() == inputId){
                studentFind = studentList.get(i);
                indexFindInList = i;
            }
        }
        if (studentFind == null){
            System.out.println("Can't find student with ID: " + inputId);
        }else {
            System.out.println(studentFind.toString());
        }
        return indexFindInList;
    }

    @Override
    public void deleteStudentInfo() {
        List<Student> studentList = studentRepository.displayAll();
        int indexDelete = this.searchStudentInfo();
        if (indexDelete == -1){
            System.out.println("Can't delete Student which not available on List!!");
        }else {
            studentList.remove(indexDelete);
            System.out.println("Delete Student Info Successfully!");
        }
    }

    private Student studentInfo(){
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
}
