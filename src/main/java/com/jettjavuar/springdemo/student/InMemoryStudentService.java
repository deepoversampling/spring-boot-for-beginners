package com.jettjavuar.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return this.dao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return this.dao.update(s);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }
}
