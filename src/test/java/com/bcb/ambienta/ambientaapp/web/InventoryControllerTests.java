package com.bcb.ambienta.ambientaapp.web;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.bcb.ambienta.ambientaapp.service.SimpleProductManager;
import com.bcb.ambienta.ambientaapp.web.InventoryController;

public class InventoryControllerTests {

	@Test
	public void testHandleRequestView() throws ServletException, IOException {
		InventoryController controller = new InventoryController();
		controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        
        @SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
	}

}
