package ss08_mvc.service;

import ss08_mvc.model.Student;

import java.util.Arrays;

public interface StudentService {
    Student[] findAll();
    void addStudent(Student student);
    void updateStudent(Student student);
    void remove(int index);
    Student findByIndex(int index);

    /*validation*/
}
