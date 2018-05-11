package org.org.springresttest.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springresttest.model.Student;
import org.springresttest.service.StudentService;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class StudentServiceTest {

    private StudentService sSvc;
    private StudentService sSvcMock;

    @Before
    public void setUp()
    {
        sSvc = new StudentService();
        sSvcMock = mock(StudentService.class);
    }

    @Test
    public void getStudentDetailsIfStudentIdDoesntExist()
    {
        given(sSvcMock.getStudentDetails(1)).willReturn(null);
        Assert.assertEquals(null, sSvcMock.getStudentDetails(1));
    }

    @Test
    public void registerNewStudent_verifyStudentIdSetToLatestIndex()
    {
        Student newFish = new Student("Per", "Mertesacker", 33);
        sSvc.registerNewStudent(newFish);
        Assert.assertEquals(sSvc.getStudentsList().size()-1, newFish.getStudentid());
    }

    @Test
    public void registerNewStudent_verifyCanQueryBackFromName()
    {
        Assert.assertTrue(sSvc.registerNewStudent(new Student("Arsene", "Wenger", 70)));
        Assert.assertNotNull(sSvc.getStudentDetails("Arsene", "Wenger"));
    }
}
