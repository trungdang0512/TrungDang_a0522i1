package ss09_DSA.bai_tap.BT_Them01.models;

public class Student extends Person{
    String studentClass;
    int point;

    public Student(int id, String name, String dateOfBirth, String gender, String studentClass, int point) {
        super(id, name, dateOfBirth, gender);
        this.studentClass = studentClass;
        this.point = point;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
