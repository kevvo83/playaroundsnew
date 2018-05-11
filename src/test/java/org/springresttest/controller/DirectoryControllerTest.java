package org.springresttest.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springresttest.model.Student;
import org.springresttest.service.StudentService;
import static org.mockito.BDDMockito.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
public class DirectoryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void restGetStudentDetailsOfInitializedStudentId()
    {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/0/getStudentDetails").accept(MediaType.APPLICATION_JSON);

        try {
            MvcResult result = mockMvc.perform(requestBuilder).andReturn();
            Assert.assertEquals("{\"firstname\":\"Per\",\"lastname\":\"Mertesacker\",\"age\":33,\"studentid\":0}", result.getResponse().getContentAsString());
        } catch (Exception exp) {
            Assert.fail(exp.getMessage());
        }
    }

    @Test
    public void restGetStudentDetailsOfNonExistentStudentId()
    {
        RequestBuilder rB = MockMvcRequestBuilders.get("/9000/getStudentDetails").accept(MediaType.APPLICATION_JSON);
        try {
            MvcResult result = mockMvc.perform(rB).andReturn();
            Assert.assertEquals("", result.getResponse().getContentAsString());
        } catch (Exception exp) {
            Assert.fail(exp.getMessage());
        }
    }

}
