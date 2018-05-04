package org.springresttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springresttest.model.Course;
import org.springresttest.model.Student;
import org.springresttest.service.CourseService;
import org.springresttest.service.RegistrationService;
import org.springresttest.service.StudentService;

import java.util.ArrayList;

// Writing this test based on the requirements listed in the springboot tutorial here
// http://www.springboottutorial.com/unit-testing-for-spring-boot-rest-services

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run()
    {
        cs.addNewCourse(new Course(111, "Introduction to Economics"));
        cs.addNewCourse(new Course(112, "Advanced Economics"));
        cs.addNewCourse(new Course(113, "Introduction to Mechanics"));
        cs.addNewCourse(new Course(114, "Advanced Mechanics"));
        cs.addNewCourse(new Course(115,"Introduction to Pure Mathematics"));
        cs.addNewCourse(new Course(116, "Advanced Pure Mathematics"));

        ss.registerNewStudent(new Student("Jon", "Woo", 23,1));
        ss.registerNewStudent(new Student("One-Eyed", "Raven", 44,2));
        ss.registerNewStudent(new Student("Aaron", "Ramsay", 23,3));

        rs.registerStudentinCourse(ss.getStudentDetails(1), cs.getCourseDetails(112));
    }

}
