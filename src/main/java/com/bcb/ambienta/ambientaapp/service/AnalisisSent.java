package com.bcb.ambienta.ambientaapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AnalisisSent {	
    protected final Log logger = LogFactory.getLog(getClass());
        
    private String comentario;

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
		logger.info("Comentario " + comentario);
	}
    
    
}
