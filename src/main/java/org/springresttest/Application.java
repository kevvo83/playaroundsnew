package org.springresttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springresttest.model.Course;
import org.springresttest.model.Student;
import org.springresttest.service.CourseService;
import org.springresttest.service.RegistrationService;
import org.springresttest.service.StudentService;

import java.util.ArrayList;

// Writing this test based on the requirements listed in the springboot tutorial here
// http://www.springboottutorial.com/unit-testing-for-spring-boot-rest-services

@SpringBootApplication
public class Application implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    public static CourseService cs = new CourseService();
    @Autowired
    public static StudentService ss = new StudentService();
    @Autowired
    public static RegistrationService rs = new RegistrationService();

    @Override
    public void run(String... args)
    {
        ss.registerNewStudent(new Student("Jon","Snow",23));
        ss.registerNewStudent(new Student("Abal","Cain",43));
        ss.registerNewStudent(new Student("Rajesh","Kanchi",24));

        cs.addNewCourse(new Course("Introduction to Economics", "Albert Friedrichs"));
        cs.addNewCourse(new Course("Advanced Economics", "Albert Friedrichs"));

        rs.registerStudentinCourse(ss.getStudentDetails(1), cs.getCourseDetails(1));
        rs.registerStudentinCourse(ss.getStudentDetails(1), cs.getCourseDetails(2));
    }
}
