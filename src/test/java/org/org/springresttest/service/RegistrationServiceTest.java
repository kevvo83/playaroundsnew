package org.org.springresttest.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springresttest.model.Course;
import org.springresttest.model.Student;
import org.springresttest.service.CourseService;
import org.springresttest.service.RegistrationService;
import org.springresttest.service.StudentService;

import javax.annotation.PreDestroy;

public class RegistrationServiceTest {

    private StudentService sSvc;
    private CourseService cSvc;
    private RegistrationService rSvc;

    @Before
    public void setUp()
    {
        sSvc = new StudentService();
        cSvc = new CourseService();
        rSvc = new RegistrationService();
    }

    @Test
    public void addStudentToACourse()
    {
        Assert.assertTrue(sSvc.registerNewStudent(new Student("Horatio", "Nelson", 32)));
        Assert.assertTrue(cSvc.addNewCourse(new Course("Advanced Psychology", "Prof. Tang")));
        Assert.assertTrue(cSvc.addNewCourse(new Course("Intermediate Psychology", "Prof. Tang")));
        Assert.assertTrue(rSvc.registerStudentinCourse(sSvc.getStudentDetails("Horatio", "Nelson"), cSvc.getCourseDetails("Advanced Psychology")));

        Assert.assertTrue(rSvc.getCoursesRegisteredByStudent(sSvc.getStudentDetails("Horatio","Nelson")).contains(cSvc.getCourseDetails("Advanced Psychology").getCourseId()));
        Assert.assertFalse(rSvc.getCoursesRegisteredByStudent(sSvc.getStudentDetails("Horatio","Nelson")).contains(cSvc.getCourseDetails("Intermediate Psychology").getCourseId()));
    }
}
