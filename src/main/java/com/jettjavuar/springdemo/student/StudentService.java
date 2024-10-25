package com.jettjavuar.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Dave",
                        "Gahan",
                        LocalDate.now(),
                        "davegahan@gmail.com",
                        69
                ),
                new Student(
                        "James",
                        "Hetfield",
                        LocalDate.now(),
                        "jamesgahan@gmail.com",
                        72
                )
        );
    }
}
