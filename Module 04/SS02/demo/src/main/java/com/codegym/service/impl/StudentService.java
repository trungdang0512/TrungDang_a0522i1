package com.codegym.service.impl;

import com.codegym.model.Student;
import com.codegym.repository.IStudentRepository;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public List<Student> getAll() {
        return iStudentRepository.getAll();
    }

    @Override
    public void save(Student student) {
        if(student.getPoint()>0 && student.getPoint()<10) {

        }
        this.iStudentRepository.save(student);
    }

    @Override
    public Student findById(Integer codeStudent) {
        return iStudentRepository.findById(codeStudent);
    }
}
