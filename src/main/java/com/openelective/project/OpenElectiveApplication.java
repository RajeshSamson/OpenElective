package com.openelective.project;

import com.openelective.project.model.Student;
import com.openelective.project.repository.StudentRepository;
import com.openelective.project.service.StudentService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class OpenElectiveApplication {

    @Bean
    public ApplicationRunner runner(StudentRepository repository) {
        return args -> {
            Student s1 = new Student("1",
                    "Alex", 4,
                    9.0, 0,
                    "CSE", "IT", "ECE");
            Student s2 = new Student("2",
                    "Stacy", 4,
                    9.0, 1,
                    "CSE", "IT", "ECE");
            Student s3 = new Student("3",
                    "Stacy", 4,
                    9.0, 3,
                    "CSE", "IT", "ECE");
            Student s4 = new Student("4",
                    "John", 4,
                    10.0, 0,
                    "CSE", "IT", "ECE");
            repository.saveAll(Arrays.asList(s1, s2, s3, s4));

            repository.findAll().forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenElectiveApplication.class, args);
    }

}
