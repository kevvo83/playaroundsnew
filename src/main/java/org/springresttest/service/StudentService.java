package org.springresttest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springresttest.model.Course;
import org.springresttest.model.Student;
import java.util.ArrayList;

@Service
public class StudentService {

    private static ArrayList<Student> studentsList = new ArrayList<Student>();

    public boolean registerNewStudent (Student stud)
    {
        stud.setStudentid(studentsList.size());
        studentsList.add(stud);
        return true;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public Student getStudentDetails(int studentid)
    {
        Student retVal = null;
        for (Student i:studentsList)  {  if (i.getStudentid() == studentid) {retVal = i; break; } }
        return retVal;
    }


}
