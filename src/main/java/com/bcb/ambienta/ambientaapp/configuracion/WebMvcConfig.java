package com.bcb.ambienta.ambientaapp.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
  
 
	 private static final String RESOURCES_HANDLER = "/resources/";
	 private static final String RESOURCES_LOCATION = RESOURCES_HANDLER + "**";
	 
	  
	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  registry.addResourceHandler(RESOURCES_HANDLER).addResourceLocations(RESOURCES_LOCATION);
	 }
	 
	 @Controller
	    static class FaviconController {
	        @RequestMapping("favicon.ico")
	        String favicon() {
	            return "forward:/resources/favicon.ico";
	        }
	    }
 
}
