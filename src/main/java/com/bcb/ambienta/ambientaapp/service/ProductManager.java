package com.bcb.ambienta.ambientaapp.service;

import java.io.Serializable;
import java.util.List;

import com.bcb.ambienta.ambientaapp.dominio.Product;

public interface ProductManager extends Serializable{
	public void increasePrice(int percentage);    
    public List<Product> getProducts();
}
