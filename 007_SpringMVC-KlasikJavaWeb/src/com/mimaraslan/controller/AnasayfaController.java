package com.mimaraslan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class AnasayfaController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
												 HttpServletResponse response) throws Exception {

		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		
		modelAndView.addObject("mesaj1", "Selamün Aleyküm");

		modelAndView.addObject("mesaj2", "سالامون عليكم");

		
		return modelAndView;
	}
	
}
