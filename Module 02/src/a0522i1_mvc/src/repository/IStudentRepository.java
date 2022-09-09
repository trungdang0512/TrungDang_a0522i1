package repository;

import model.Student;

import java.util.List;

public interface IStudentRepository {
    void addStudent(Student student);

    List<Student> getAll();
}
