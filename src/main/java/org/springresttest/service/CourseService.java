package org.springresttest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springresttest.model.Course;

import java.util.ArrayList;

@Service
public class CourseService {

    private static ArrayList<Course> courseList = new ArrayList<Course>();

    public boolean addNewCourse(Course crs) {
        for (Course i:courseList) { if ((i.getCourseDescriptor()==crs.getCourseDescriptor()) && (i.getCourseConductor()==crs.getCourseConductor())) {return false;} }
        crs.setCourseId(courseList.size());
        courseList.add(crs); return true;
    }

    public ArrayList<Course> getCourseList()
    {
        return courseList;
    }

    public Course getCourseDetails(int courseId)
    {
        Course retVal = null;
        for (Course i:courseList) { if (i.getCourseId()==courseId){retVal=i;break; } }
        return retVal;
    }
}
