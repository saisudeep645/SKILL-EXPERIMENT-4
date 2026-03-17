package com.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    // Existing (keep as it is)
    @Bean
    public Student student() {
        Student s = new Student(102, "Saisudeep", "Artificial Intelligence", 4);
        s.setCourse("AI & Data Science");
        s.setYear(4);
        return s;
    }

    // ADD Student 2
    @Bean
    public Student student2() {
        Student s = new Student(103, "Rahul", "Java", 3);
        s.setCourse("Core Java");
        s.setYear(3);
        return s;
    }

    // ADD Student 3
    @Bean
    public Student student3() {
        Student s = new Student(104, "Anjali", "Python", 2);
        s.setCourse("Python & ML");
        s.setYear(2);
        return s;
    }
}