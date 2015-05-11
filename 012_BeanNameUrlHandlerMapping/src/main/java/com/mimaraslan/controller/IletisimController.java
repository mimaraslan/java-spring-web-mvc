package com.mimaraslan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class IletisimController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
												 HttpServletResponse response) throws Exception {
	
		ModelAndView modelAndView = new ModelAndView("index");
		
		modelAndView.addObject("sayfa", "İletişim");
		
		return modelAndView;
	}

}