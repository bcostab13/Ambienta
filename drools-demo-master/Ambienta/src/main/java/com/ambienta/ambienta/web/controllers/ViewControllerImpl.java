/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ambienta.ambienta.web.controllers;

import java.io.IOException;
import static java.time.Instant.now;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author BRENDA
 */
@Controller
public class ViewControllerImpl implements ViewController{
    private static Logger logger = LoggerFactory.getLogger(ViewControllerImpl.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning explorador view");
        return new ModelAndView("explorador");
    }

    @Override
    public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning inicio view " );
        return new ModelAndView("inicio");
    }

    @Override
    public ModelAndView handleRequest3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning empresa view " );
        return new ModelAndView("empresa");
    }

    @Override
    public ModelAndView handleRequest4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning proyecto view " );
        return new ModelAndView("proyecto");
    }

    @Override
    public ModelAndView handleRequest5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning comentarios view " );
        return new ModelAndView("comentarios");
    }

    @Override
    public ModelAndView handleRequest6(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning registroProyecto view " );
        return new ModelAndView("registroProyecto");
    }
    
    @Override
    public ModelAndView handleRequest7(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning prueba view " );
        return new ModelAndView("prueba2");
    }
    
    @Override
    public ModelAndView handleRequest8(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning datosEmpresa view " );
        return new ModelAndView("datosEmpresa");
    }
    
    @Override
    public ModelAndView handleRequest9(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning consultaProyectos view " );
        return new ModelAndView("consultaProyectos");
    }
    
    @Override
    public ModelAndView handleRequest10(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning verIndicadores view " );
        return new ModelAndView("verIndicadores");
    }
    
    @Override
    public ModelAndView handleRequest11(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning registroP view " );
        return new ModelAndView("registroP");
    }
}
