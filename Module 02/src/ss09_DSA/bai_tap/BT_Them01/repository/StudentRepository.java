package ss09_DSA.bai_tap.BT_Them01.repository;


import ss09_DSA.bai_tap.BT_Them01.models.Student;

import java.util.List;

public interface StudentRepository {
    void addStudent(Student student);

    List<Student> displayAll();
}
