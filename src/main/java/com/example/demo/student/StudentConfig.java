package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student othmane = new Student(
                    "Othmane",
                    "othmane232004@gmail.com",
                    LocalDate.of(2004, MARCH, 23)
            );

            Student alex = new Student(
                    "Alex",
                    "alexkj98@gmail.com",
                    LocalDate.of(2000, MARCH, 12)
            );

            repository.saveAll(List.of(othmane, alex));
        };
    }

}
