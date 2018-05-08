package org.springresttest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springresttest.Application;
import org.springresttest.model.Course;
import org.springresttest.service.CourseService;

@RestController
@RequestMapping(value="/{courseId}", method=RequestMethod.GET)
public class CourseController {

    @RequestMapping(value="/getCourseDetails", method=RequestMethod.GET)
    public Course getCourseDetails(@PathVariable String courseId) {
        return Application.cs.getCourseDetails(Integer.parseInt(courseId));
    }

}
