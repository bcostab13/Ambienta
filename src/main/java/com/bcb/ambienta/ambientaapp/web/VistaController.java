package com.bcb.ambienta.ambientaapp.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class VistaController {
protected final Log logger = LogFactory.getLog(getClass());
	
	//@Autowired
    //private AnalisisSentimientosManager analisisManager;
	
	@RequestMapping(value="/explorador.htm")
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String now = (new Date()).toString();
        logger.info("Returning explorador view with " + now);

        return new ModelAndView("explorador", "now", now);
	}
        
        @RequestMapping(value="/inicio.htm")
	public ModelAndView handleRequest2(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
            logger.info("Returning inicio view " );

        return new ModelAndView("inicio");
	}
        
        @RequestMapping(value="/empresa.htm")
	public ModelAndView handleRequest3(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
            logger.info("Returning empresa view " );

        return new ModelAndView("empresa");
	}
        
        @RequestMapping(value="/proyecto.htm")
	public ModelAndView handleRequest4(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
            logger.info("Returning proyecto view " );

        return new ModelAndView("proyecto");
	}
}
