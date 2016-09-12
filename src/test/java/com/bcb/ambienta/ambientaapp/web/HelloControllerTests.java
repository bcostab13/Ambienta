package com.bcb.ambienta.ambientaapp.web;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.bcb.ambienta.ambientaapp.web.HelloController;

public class HelloControllerTests {

	@Test
	public void testHandleRequestView() throws ServletException, IOException {
		HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
	}

}
