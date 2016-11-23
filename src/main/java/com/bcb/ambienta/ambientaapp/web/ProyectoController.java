/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcb.ambienta.ambientaapp.web;

import com.bcb.ambienta.ambientaapp.service.SistemaExpertoService;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author BRENDA
 */
@Controller

public class ProyectoController {
    @Autowired
    private SistemaExpertoService service;
    
    @RequestMapping(value="prueba.htm",method=RequestMethod.POST)
        public @ResponseBody String prueba(HttpServletRequest request){
        //System.out.println("holi");
        return service.pruebaRespuesta();
    }
}
