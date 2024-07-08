package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
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
