package ss09_DSA.bai_tap.BT_Them01.models;

public class Teacher extends Person{
    String speciality;

    public Teacher(int id, String name, String dateOfBirth, String gender, String speciality) {
        super(id, name, dateOfBirth, gender);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
