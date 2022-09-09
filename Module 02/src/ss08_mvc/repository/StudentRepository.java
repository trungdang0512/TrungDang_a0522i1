package ss08_mvc.repository;

import ss08_mvc.model.Student;

public interface StudentRepository {
    Student[] findAll();
    void addStudent(Student student);
    void updateStudent(Student student);
    void remove(int index);
    Student findByIndex(int index);
}
