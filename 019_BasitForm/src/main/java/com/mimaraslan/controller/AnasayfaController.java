package com.mimaraslan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
CREATE - POST

READ - GET

UPDATE - PUT

DELETE - DELETE
*/

import com.mimaraslan.model.Kullanici;

@Controller
public class AnasayfaController {
	
	@RequestMapping(value="/basitForm", method = RequestMethod.GET)
	public void basitForm(Model model) {
		model.addAttribute(new Kullanici());
	}
	
	@RequestMapping(value="/formsonuc.html", method = RequestMethod.POST)
	public void formsonuc(@ModelAttribute  Kullanici kullanici,   Model model) {
		model.addAttribute("kullanici", kullanici);
	}
	

	
	
}
