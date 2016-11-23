/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcb.ambienta.ambientaapp.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author BRENDA
 */
@Controller
@RequestMapping("/c_empresa")
public class EmpresaController {
    @RequestMapping("/metodo")
    public @ResponseBody String prueba(HttpServletRequest request){
        System.out.println("holi");
        return "holi";
    }
}
