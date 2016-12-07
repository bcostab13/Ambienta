/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ambienta.ambienta.web.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author BRENDA
 */
@RequestMapping("/cc_ambienta")
public interface AmbientaController {
    
    @RequestMapping(value = "/f_login", method = RequestMethod.POST)
    @ResponseBody String f_login(@RequestParam("usuario") String usuario,
            @RequestParam("pass") String pass,HttpServletRequest request);
}
