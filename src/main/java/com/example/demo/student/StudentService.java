package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // annotation might to be for service class
public class StudentService {

    public List<Student> getStudents() {
        return List.of( // CLASS CONVERTED TO JSON FORMAT array localhost8080
                new Student(
                        1L,
                        "Danny",
                        "dannycao1997@yahoo.com",
                        LocalDate.of(1997, Month.SEPTEMBER, 9),
                        26
                )
        );
    }
}
