package com.bcb.ambienta.ambientaapp.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bcb.ambienta.ambientaapp.service.AnalisisSent;
import com.bcb.ambienta.ambientaapp.service.AnalisisSentimientosManager;
import com.bcb.ambienta.ambientaapp.service.PriceIncrease;
import com.bcb.ambienta.ambientaapp.service.ProductManager;

@Controller

public class ExploradorController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	//@Autowired
    //private AnalisisSentimientosManager analisisManager;
	
	/*@RequestMapping(value="/explorador.htm")
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String now = (new Date()).toString();
        logger.info("Returning explorador view with " + now);

        return new ModelAndView("explorador", "now", now);
	}*/
	/*
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid AnalisisSent analisisSent, BindingResult result)
    {
        if (result.hasErrors()) {
            return "analisis de sentimientos";
        }
		
        //int increase = priceIncrease.getPercentage();
        //logger.info("Increasing prices by " + increase + "%.");
        try{
        	analisisManager.analisis(analisisSent.getComentario());
        }catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/explorador.htm";
		      
    }
	@RequestMapping(method = RequestMethod.GET)
    protected AnalisisSent formBackingObject(HttpServletRequest request) throws ServletException {
        AnalisisSent analisisSent = new AnalisisSent();
        analisisSent.setComentario("");;
        return analisisSent;
	}*/

	/*public AnalisisSentimientosManager getAnalisisManager() {
		return analisisManager;
	}

	public void setAnalisisManager(AnalisisSentimientosManager analisisManager) {
		this.analisisManager = analisisManager;
	}*/
	
	
}
