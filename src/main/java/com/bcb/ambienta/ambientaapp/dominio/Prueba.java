/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcb.ambienta.ambientaapp.dominio;

/**
 *
 * @author BRENDA
 */
public class Prueba {
    private Integer balance;
 
 
    public Prueba() {}
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    public Prueba(Integer balance) {
        super();
        this.balance = balance;
    }
    public void withdraw(int money) {
        balance -= money;
    }
}
