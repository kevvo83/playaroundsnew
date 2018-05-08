package org.springresttest.model;

import org.springframework.stereotype.Component;

@Component
public class Course {

    private int courseId;
    private String courseDescriptor;
    private String courseConductor;

    public Course(String courseDescriptor, String courseConductor) {
        this.courseConductor = courseConductor;
        this.courseDescriptor = courseDescriptor;
        this.courseId = 0;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseDescriptor() {
        return courseDescriptor;
    }

    public void setCourseDescriptor(String courseDescriptor) {
        this.courseDescriptor = courseDescriptor;
    }

    public String getCourseConductor() {
        return courseConductor;
    }

    public void setCourseConductor(String courseConductor) {
        this.courseConductor = courseConductor;
    }
}
