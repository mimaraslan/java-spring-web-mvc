package com.mimaraslan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
CREATE - POST

READ - GET

UPDATE - PUT

DELETE - DELETE
*/

@Controller
public class AnasayfaController {
	
	@RequestMapping(value="/AnasayfaView", method = RequestMethod.GET)
	public ModelAndView selamAcilis() {
		String mesaj = "Selamlar Spring MVC ";
		
		return new ModelAndView("AnasayfaView", "modelNesnesiMesaj", mesaj);
	}

	
	
}
