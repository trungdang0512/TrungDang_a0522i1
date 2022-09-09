package ss09_DSA.bai_tap.BT_Them01.repository;

import ss09_DSA.bai_tap.BT_Them01.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryImpl implements TeacherRepository{
    private static List<Teacher> teacherList = new ArrayList<>();


    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public List<Teacher> displayAll() {
        return teacherList;
    }
}
