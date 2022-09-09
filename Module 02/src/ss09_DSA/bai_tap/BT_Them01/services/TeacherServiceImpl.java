package ss09_DSA.bai_tap.BT_Them01.services;

import ss09_DSA.bai_tap.BT_Them01.models.Teacher;
import ss09_DSA.bai_tap.BT_Them01.repository.TeacherRepository;
import ss09_DSA.bai_tap.BT_Them01.repository.TeacherRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService{
    private static Scanner scanner = new Scanner(System.in);
    private TeacherRepository teacherRepository = new TeacherRepositoryImpl();


    @Override
    public void addTeacher() {
        Teacher newTeacherInfo = this.teacherInfo();
        teacherRepository.addTeacher(newTeacherInfo);
    }

    @Override
    public void displayTeacherList() {
        List<Teacher> teacherList = teacherRepository.displayAll();
        for (Teacher teacher: teacherList){
            System.out.println(teacher.toString());
        }
    }

    @Override
    public int searchTeacherInfo() {
        List<Teacher> teacherList = teacherRepository.displayAll();
        Teacher teacherFind = null;
        int indexFindInList = -1;
        System.out.println("Input Teacher ID to find: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<teacherList.size(); i++){
            if (teacherList.get(i).getId() == inputId){
                teacherFind = teacherList.get(i);
                indexFindInList = i;
            }
        }
        if (teacherFind == null){
            System.out.println("Can't find student with ID: " + inputId);
        }else {
            System.out.println(teacherFind.toString());
        }
        return indexFindInList;
    }

    @Override
    public void deleteTeacherInfo() {
        List<Teacher> teacherList = teacherRepository.displayAll();
        int indexDelete = this.searchTeacherInfo();
        if (indexDelete == -1){
            System.out.println("Can't delete Student which not available on List!!");
        }else {
            teacherList.remove(indexDelete);
            System.out.println("Delete Student Info Successfully!");
        }
    }

    private Teacher teacherInfo(){
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
