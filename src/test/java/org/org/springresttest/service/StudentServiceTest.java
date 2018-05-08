package org.org.springresttest.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springresttest.model.Student;
import org.springresttest.service.StudentService;

import static org.mockito.BDDMockito.given;

public class StudentServiceTest {

    private StudentService sSvc;

    @Before
    public void setUp()
    {
        sSvc = new StudentService();
    }

    @Test
    public void getStudentDetailsIfStudentIdDoesntExist()
    {
        given(sSvc.getStudentDetails(1)).willReturn(null);
        Assert.assertEquals(null, sSvc.getStudentDetails(1));
    }

    @Test
    public void registerNewStudent_verifyStudentIdSetToLatestIndex()
    {
        Student newFish = new Student("Per", "Mertesacker", 33);
        sSvc.registerNewStudent(newFish);
        Assert.assertEquals(sSvc.getStudentsList().size()-1, newFish.getStudentid());
    }
}
