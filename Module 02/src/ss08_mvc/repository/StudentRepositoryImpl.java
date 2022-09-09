package ss08_mvc.repository;

import ss08_mvc.model.Student;

public class StudentRepositoryImpl implements StudentRepository {
    private static Student[] studentList;
    private static int size = 0;

    static {
        studentList = new Student[20];
        studentList[0] = new Student(1, "Nguyen Van A");
        studentList[1] = new Student(1, "Nguyen Van B");
        studentList[2] = new Student(1, "Nguyen Van C");
        studentList[3] = new Student(1, "Nguyen Van D");
        size = 4;
    }

    @Override
    public Student[] findAll() {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentList[i];
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        /*kiểm tra size..*/
        studentList[size] = student;
        size++;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Student findByIndex(int index) {
        return null;
    }
}
