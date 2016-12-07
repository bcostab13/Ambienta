/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ambienta.ambienta.services;

import com.abienta.ambienta.model.Usuario;
import java.util.List;

/**
 *
 * @author BRENDA
 */
public interface AmbientaService {
    List<Usuario> f_login(String usuario,String pass);
}
