/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ambienta.ambienta.web.controllers;

import com.abienta.ambienta.model.Usuario;
import com.ambienta.ambienta.services.AmbientaService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author BRENDA
 */
@Controller
public class AmbientaControllerImpl implements AmbientaController{
    private static Logger logger = LoggerFactory.getLogger(AmbientaControllerImpl.class);
    
//    @Autowired
//    private AmbientaService service;
    
    @Override
    public @ResponseBody String f_login(
            @RequestParam("usuario") String usuario,
            @RequestParam("pass") String pass,
            HttpServletRequest request)	{
		
        //List<Usuario> reg = service.f_login(usuario,pass);
        return "exito";
				
    }
    
    
}
