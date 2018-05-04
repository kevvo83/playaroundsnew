package org.springresttest.model;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {

    private int studentid;

    public Student (String firstname, String lastname, int age, int studid)
    {
        super(firstname, lastname, age);
        studentid = studid;
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
