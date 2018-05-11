package org.springresttest.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Student extends Person {

    private int studentid;

    public Student (String firstname, String lastname, int age)
    {
        super(firstname, lastname, age);
        studentid = 0;
    }

    public Student()
    {
        super();
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
}
