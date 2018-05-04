package org.springresttest.model;

import org.springframework.stereotype.Component;

@Component
public class Course {

    private int courseId;
    private String courseDescriptor;

    public Course(int courseId, String courseDescriptor) {
        this.courseId = courseId;
        this.courseDescriptor = courseDescriptor;
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

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseDescriptor='" + courseDescriptor + '\'' +
                '}';
    }
}
