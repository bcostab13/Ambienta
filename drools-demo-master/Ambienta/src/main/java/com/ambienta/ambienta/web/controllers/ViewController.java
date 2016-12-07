/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ambienta.ambienta.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author BRENDA
 */
public interface ViewController {
    @RequestMapping(value="/explorador") 
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/inicio") 
    public ModelAndView handleRequest2(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/empresa") 
    public ModelAndView handleRequest3(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/proyecto") 
    public ModelAndView handleRequest4(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/comentarios") 
    public ModelAndView handleRequest5(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/registroProyecto") 
    public ModelAndView handleRequest6(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/prueba2") 
    public ModelAndView handleRequest7(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/datosEmpresa") 
    public ModelAndView handleRequest8(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/consultaProyectos") 
    public ModelAndView handleRequest9(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/verIndicadores") 
    public ModelAndView handleRequest10(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
    
    @RequestMapping(value="/registroP") 
    public ModelAndView handleRequest11(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
}
