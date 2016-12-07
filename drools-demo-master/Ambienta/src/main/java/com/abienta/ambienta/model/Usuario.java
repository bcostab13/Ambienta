/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abienta.ambienta.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author BRENDA
 */
@Entity
public class Usuario implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idusuario", nullable = true, unique = true)
    private Integer idusuario;
    private String usuario;
    private String pass;
    private String tipo;
    private int iddatos;

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIddatos() {
        return iddatos;
    }

    public void setIddatos(int iddatos) {
        this.iddatos = iddatos;
    }
    
    
}
