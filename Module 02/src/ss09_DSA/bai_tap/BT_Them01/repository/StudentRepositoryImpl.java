package ss09_DSA.bai_tap.BT_Them01.repository;

import ss09_DSA.bai_tap.BT_Them01.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public List<Student> displayAll(){
        return studentList;
    }
}
