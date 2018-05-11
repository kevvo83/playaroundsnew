package org.springresttest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springresttest.model.Course;
import org.springresttest.model.Student;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class RegistrationService {

    private static HashMap<Integer, ArrayList<Integer>> studentCourseRegistration = new HashMap<Integer, ArrayList<Integer>>();

    public boolean registerStudentinCourse(Student stud, Course course) {

        try {
            Integer studentId = stud.getStudentid();

            if (!studentCourseRegistration.containsKey(studentId)) {
                studentCourseRegistration.put(studentId, new ArrayList<>());
            }

            ArrayList<Integer> tmp = studentCourseRegistration.get(studentId);
            tmp.add(course.getCourseId());
            studentCourseRegistration.put(studentId, tmp);
            return true;
        }
        catch (Exception exp)
        {
            return false;
        }

    }

    public ArrayList<Integer> getCoursesRegisteredByStudent(Student stud)
    {
        ArrayList<Integer> retVal = new ArrayList<>();

        Integer studentId = stud.getStudentid();

        if (studentCourseRegistration.containsKey(studentId)) {
            retVal = studentCourseRegistration.get(studentId);
        }
        return retVal;
    }
}
