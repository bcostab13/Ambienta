package com.bcb.ambienta.ambientaapp.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bcb.ambienta.ambientaapp.service.AnalisisSent;
import com.bcb.ambienta.ambientaapp.service.AnalisisSentimientosManager;
import com.bcb.ambienta.ambientaapp.service.PriceIncrease;
import com.bcb.ambienta.ambientaapp.service.ProductManager;

@Controller
@RequestMapping("/exploradorCont")
public class ExploradorController {
	protected final Log logger = LogFactory.getLog(getClass());
	
//	@Autowired
//        private AnalisisSentimientosManager analisisManager;
//	
//	
//	@RequestMapping("/metodo")
//        protected AnalisisSent formBackingObject(HttpServletRequest request) throws ServletException {
//            AnalisisSent analisisSent = new AnalisisSent();
//            analisisSent.setComentario("");
//            return analisisSent;
//	}

	/*public AnalisisSentimientosManager getAnalisisManager() {
		return analisisManager;
	}

	public void setAnalisisManager(AnalisisSentimientosManager analisisManager) {
		this.analisisManager = analisisManager;
	}*/
	
	
}
