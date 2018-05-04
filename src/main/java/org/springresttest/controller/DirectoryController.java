package org.springresttest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springresttest.model.Student;
import org.springresttest.service.CourseService;
import org.springresttest.service.RegistrationService;
import org.springresttest.service.StudentService;

@RestController
public class DirectoryController {

    @Autowired
    public StudentService ss;

    @Autowired
    public CourseService cs;

    @RequestMapping(value="/getStudentDetails", method= RequestMethod.GET)
    public Student getStudentDetails(@RequestParam(value="studentid", defaultValue=0) int studentid)
    {
        return ss.getStudentDetails(studentid);
    }
}
