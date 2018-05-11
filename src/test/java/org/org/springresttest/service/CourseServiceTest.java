package org.org.springresttest.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springresttest.model.Course;
import org.springresttest.service.CourseService;

public class CourseServiceTest
{
    private CourseService csSvc;

    @Before
    public void setUp()
    {
        csSvc = new CourseService();
    }

    @Test
    public void addNewCourse_VerifyCourseIdIsSetToLatestIndex()
    {
        Course newCourse = new Course("Introduction to Pure Mathematics", "Prof. Tan Cheng Boon");
        csSvc.addNewCourse(newCourse);
        Assert.assertEquals(csSvc.getCourseList().size()-1, newCourse.getCourseId());
    }

    @Test
    public void attemptToAddCourse_whichAlreadyExists()
    {
        Course newCourse = new Course("Introduction to Pure Mathematics", "Prof. Tan Cheng Boon");
        csSvc.addNewCourse(newCourse);
        Assert.assertEquals(csSvc.getCourseList().size()-1, newCourse.getCourseId());
        newCourse = new Course("Introduction to Pure Mathematics", "Prof. Tan Cheng Boon");
        Assert.assertFalse(csSvc.addNewCourse(newCourse));
    }

    @Test
    public void addNewCourse_verifyThatCanQueryBackByName()
    {
        Assert.assertTrue(csSvc.addNewCourse(new Course("Advanced Polynomials", "Herbert Nordstein")));
        Assert.assertNotNull(csSvc.getCourseDetails("Advanced Polynomials"));
        Assert.assertNull(csSvc.getCourseDetails("Advanced Polynomials Blah Blah Blah Incorrect Name"));
    }

}
