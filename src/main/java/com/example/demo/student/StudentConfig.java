package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student danny = new Student(
                    1L,
                    "Danny",
                    "dannycao1997@yahoo.com",
                    LocalDate.of(1997, Month.SEPTEMBER, 9)
            );
            Student andy = new Student(
                    "Andy",
                    "andy@gmail.com",
                    LocalDate.of(1997, Month.DECEMBER, 1)
            );

            repository.saveAll(
                    List.of(danny, andy)
            );
        };
    }
}
