package ss09_DSA.bai_tap.BT_Them01.repository;

import ss09_DSA.bai_tap.BT_Them01.models.Teacher;

import java.util.List;

public interface TeacherRepository {
    void addTeacher(Teacher teacher);

    List<Teacher> displayAll();
}
