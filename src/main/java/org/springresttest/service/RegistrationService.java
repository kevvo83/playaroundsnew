package org.springresttest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springresttest.model.Course;
import org.springresttest.model.Student;

import java.util.AbstractMap;
import java.util.HashMap;

@Service
public class RegistrationService {

    private static HashMap<Integer, Integer> studentCourseRegistration = new HashMap<Integer, Integer>();

    public boolean registerStudentinCourse(Student stud, Course course) {
        studentCourseRegistration.put(Integer.valueOf(stud.getStudentid()), Integer.valueOf(course.getCourseId()));
        return true;
    }
}
