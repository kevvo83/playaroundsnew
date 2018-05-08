package org.springresttest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springresttest.Application;
import org.springresttest.model.Course;
import org.springresttest.model.Student;
import org.springresttest.service.CourseService;
import org.springresttest.service.RegistrationService;
import org.springresttest.service.StudentService;

@RestController
@RequestMapping(value="/{personId}", method=RequestMethod.GET)
public class DirectoryController {


    @RequestMapping(value="/getStudentDetails", method=RequestMethod.GET)
    public Student getStudentDetails(@PathVariable String personId) {
        return Application.ss.getStudentDetails(Integer.parseInt(personId));
    }

}
