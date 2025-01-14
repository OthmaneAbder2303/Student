package com.example.demo.student;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;

}
