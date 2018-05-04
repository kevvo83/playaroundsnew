package org.test.printservice.service;

import org.junit.Assert;
import org.junit.Before;
import org.test.printservice.service.FilePrintService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.BDDMockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class FilePrintServiceTest {

    private String logfilename = "abc_test.txt";
    FilePrintService fs;
    FilePrintService fsMocked;

    @Before
    public void setUp()
    {
        fs = new FilePrintService(); // Actual instance
        fsMocked = mock(FilePrintService.class); // Mocked instance
    }

    @Test
    public void ifVerifySuitabilityInputsAreIntsThenShouldReturnTrue()
    {
        //verify
        Assert.assertTrue(fs.verifySuitability(1,2));
    }

    @Test
    public void ifVerifySuitabilityInputsAreIntsThenShouldReturnTrue_onStubbedMethod()
    {
        //given
        given(fsMocked.verifySuitability(1,2)).willReturn(Boolean.TRUE); // Stubbing the verifySuitability() method on the Mocked instance

        //then
        Assert.assertTrue(fsMocked.verifySuitability(1,2));
    }

}
