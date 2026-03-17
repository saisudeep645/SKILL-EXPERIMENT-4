package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    private static ApplicationContext context;

	public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student s1 = (Student) context.getBean("student1");
        Student s2 = (Student) context.getBean("student2");
        Student s3 = (Student) context.getBean("student3");

        System.out.println("---- Student 1 ----");
        s1.display();

        System.out.println("\n---- Student 2 ----");
        s2.display();

        System.out.println("\n---- Student 3 ----");
        s3.display();
    }
}